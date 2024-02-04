import java.sql.*;
public class Updatevalue {
public static void Updateitems() throws Exception{
	String url="jdbc:mysql://127.0.0.1:3306/swiggy";
	String username="root";
	String password="T#9758@qlph";
	String Query="update items_list set delivery_fees=50 where item_id='2'";
	Connection con=DriverManager.getConnection(url, username, password);
	PreparedStatement pst=con.prepareStatement(Query);
    pst.executeUpdate();
    con.close();
}
    public static void main(String[]args)throws Exception {
    	Updateitems();
    

}
}
