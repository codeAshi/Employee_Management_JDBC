import java.sql.*;
//import packages
// //load and register the Driver
// Create Connection
// create a statement
// execute the query
// process the result
// close
public class SQL {
    public static void main(String[] args) throws Exception{
        String url="jdbc:mysql://localhost:3306/Candidate";
        String name="root";
        String pass="Ashish3204";
        String query="select adderess from state where id=3";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,name,pass);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        rs.next();
        String name2=rs.getString("adderess");
        System.out.println(name2);
        st.close();
        con.close();

//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Driver Loaded Sucessfully");
//        }catch(Exception e){
//
//            e.printStackTrace();
//
//        }
    }

}