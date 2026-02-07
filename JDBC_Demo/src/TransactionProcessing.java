import java.sql.*;
import java.util.*;

public class TransactionProcessing {
    /* transaction processing in jdbc -
        data consistency- commit  ,rollback
        atomicity- transaction must be successful or failed completely

     */
    private static final String url = "jdbc:mysql://127.0.0.1:3306/transation";
    private static final String userName = "root";
    private static final String password = "Admin@123";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            connection.setAutoCommit(false);
            String debit_query = "Update accounts SET balance =balance - ? Where account_number = ?";
            String credit_query = "Update accounts SET balance =balance + ? where account_number = ?";

            PreparedStatement debitpreparedStatement = connection.prepareStatement(debit_query);
            PreparedStatement creditpreparedStatement = connection.prepareStatement(credit_query);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter acc number : ");
            int account_number = sc.nextInt();
            System.out.println("Enter ammount :");
            double amount = sc.nextDouble();

            debitpreparedStatement.setDouble(1, amount);
            debitpreparedStatement.setInt(2, account_number);
            creditpreparedStatement.setDouble(1, amount);
            creditpreparedStatement.setInt(2, account_number);
            if(insufficientBalnce(connection,101,amount)){
               connection.commit();
               System.out.println("Transaction successful !");
            } else{
                connection.rollback();
                System.out.println("Insufficient balance !");
            }
            debitpreparedStatement.executeUpdate();
            creditpreparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
        static boolean insufficientBalnce (Connection connection,int account_number, double amount){
            try {
                String query = "Select balance from accounts where account_number = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, account_number);
                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    double curr_bal = resultSet.getDouble("balance");
                    if (amount > curr_bal) {
                        return false;
                    } else {
                        return true;
                    }
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());

            }
            return false;
        }
    }

