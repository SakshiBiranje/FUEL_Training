import java.sql.*;
import java.util.*;
public class JDBCDemoMain {
    private static final String url= "jdbc:mysql://localhost:3306/mydb";
    private static final String userName ="root";
    private static final String password="Admin@123";
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection connection = DriverManager.getConnection(url, userName,password);
            //Data delete
            String query ="DELETE from Students where id=7";
            PreparedStatement preparedStatement= connection.prepareStatement(query);

            int deletedrows= preparedStatement.executeUpdate();
            if(deletedrows >0){
                System.out.println("Data Deleted successfully !");
            }
            else{
                System.out.println("Data not deleted!");
            }




           /*
            //Data update
            String query ="UPDATE Students set marks =? where id =?";
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            preparedStatement.setDouble(1,81.2);
            preparedStatement.setInt(2,4);
            int updatedrows= preparedStatement.executeUpdate();
            if(updatedrows >0){
                System.out.println("Data updated successfully !");
            }
            else{
                System.out.println("Data not updated!");
            }
*/



            /*
            //Data retrieve
            String query ="Select marks from Students where id =?";
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            preparedStatement.setInt(1,2);
            ResultSet resultSet= preparedStatement.executeQuery();
            if(resultSet.next()){
                double marks= resultSet.getDouble("marks");

                System.out.println("Marks : "+marks);
            }
            else{
                System.out.println("Marks not found!");
            }
*/

            /*
            String query = "Insert into Students(name,age,marks) values (?,?,?) ";
            // Statement statement= connection.createStatement();
            //prepared statements -
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            preparedStatement.setString(1,"Tanu");
            preparedStatement.setInt(2,25);
            preparedStatement.setDouble(3,96.6);
            int insertdrow = preparedStatement.executeUpdate();
            if(insertdrow >0){
                System.out.println("Data updated Successfully!!");
            }
            else{
                System.out.println("Data not updated!!");
            }

*/



            /*
            //SELECT
            String query="Select * from Students";
            ResultSet resultSet= statement.executeQuery(query);
            while(resultSet.next()){
                int id= resultSet.getInt("id");
                String name= resultSet.getString("name");
                int age= resultSet.getInt("age");
                Double marks= resultSet.getDouble("marks");
                System.out.println("ID : "+id);
                System.out.println("Name : "+ name);
                System.out.println("Age : "+age);
                System.out.println("Marks : "+ marks);
            }
*/

/*
            //INSERT
            String insertQuery =String.format("Insert into Students(name, age, marks) values('%s', %o, %f) ", "vanita",25,75.2);
           // ResultSet resultset1 = statement.executeQuery(insertQuery);
            int affectedrows= statement.executeUpdate(insertQuery); // it will return updated no. of rows
            if(affectedrows >0){
                System.out.println("Data inserted successfully!!");
            }
            else{
                System.out.println("Data not inserted!!");
            }
//for int we can use %o or %d
*/


/*
            //UPDATE
            String updateQuery = String.format("UPDATE Students SET marks =%f where id=%d", 79.2, 3);
            int updatedrows= statement.executeUpdate(updateQuery);
            if(updatedrows >0){
                System.out.println("Data updated successfully !");
            }
            else{
                System.out.println("Data not updated!");
            }
*/


            /*
            //DELETE
            String deleteQuery = String.format("DELETE from Students where id=5 ");
            int deletedrows= statement.executeUpdate(deleteQuery);
            if(deletedrows > 0){
                System.out.println("Data deleted successfully !");
            }
            else{
                System.out.println("Data not deleted!");
            }
            */

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
