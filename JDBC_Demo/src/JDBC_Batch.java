import java.net.StandardSocketOptions;
import java.sql.*;
import java.util.*;
public class JDBC_Batch {
    private static final String url= "jdbc:mysql://127.0.0.1:3306/batchdb";
    private static final String userName ="root";
    private static final String password="Admin@123";
    //use of batch processing - we can perform multiple operations ata time
    //benefit - it will compile at once and execute at once as well
    public static void main(String[] args){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection connection = DriverManager.getConnection(url, userName,password);
            String query ="Insert into Studentclass( name, marks) values ( ?, ?)";
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            Scanner sc= new Scanner(System.in);
             while(true){
                System.out.println("Enter name : ");
                String name = sc.next();
                System.out.println("Enter marks : ");
                double marks = sc.nextDouble();
                System.out.println("Do u want to enter more data?(Y/N) :");
                String choice = sc.next();
                preparedStatement.setString(1, name);
                preparedStatement.setDouble(2, marks);
                preparedStatement.addBatch();
                if(choice.toUpperCase().equals("N")){
                    break;
                }
            }

            int[] arr= preparedStatement.executeBatch();
            for(int i=0;i<arr.length;i++){
                if(arr[i]==0){
                    System.out.println("Query "+i+" not excuted successfully!!");
                }
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}