import java.sql.*;
import java.util.ArrayList;
public class PrintAlltableQuery {
    public static void main(String[] args) throws Exception{

        String url="jdbc:mysql://localhost:3306/customer";
        String uname="root";
        String pass="Ashish3204";
        String query="Select customer from payment where modes='Credit card'";
        Connection con=DriverManager.getConnection(url,uname,pass);
        Statement st= con.createStatement();
        ResultSet rs=st.executeQuery(query);

        ArrayList<String > cus=new ArrayList<>();


//        System.out.println(nam);
        for(int i=0;i<2;i++){
            rs.next();
            String nam=rs.getString("customer");
            System.out.println(nam);


        }

//        String name=rs.getString("customer");
//        System.out.println(cus);

        st.close();con.close();


//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            System.out.println("Driver Loaded Successfully");
//
//        }catch(Exception e){
//            e.printStackTrace();
//
//        }
    }
}
