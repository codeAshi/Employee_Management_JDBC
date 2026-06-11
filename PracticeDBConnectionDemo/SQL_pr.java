import java.sql.*;
//import packages
// //load and register the Driver
// Create Connection
// create a statement
// execute the query
// process the result
// close
public class SQL_pr {
    public static void main(String[] args) throws Exception{
        String url="";
        String name="Root";
        String pass="";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,name,pass);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Sucessfully");
        }catch(Exception e){

        e.printStackTrace();

        }
    }

}
