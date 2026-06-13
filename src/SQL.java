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
        String url="jdbc:mysql://localhost:3306/customer";
        String name="root";
        String pass="Ashish3204";
        String query="select * from payment where modes='Credit card'";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,name,pass);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        for(int i=0;i<2;i++){

        rs.next();
        int id=rs.getInt("cus_id");
        String city=rs.getString("city");
        String name2=rs.getString("customer");
        System.out.println(id+"  "+name2+"  "+city);}
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