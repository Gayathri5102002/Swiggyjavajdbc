import java.sql.*;
public class Deleteitems {
  public static void  Deletevalues() throws Exception{
	  String url="jdbc:mysql://127.0.0.1:3306/swiggy";
	  String username="root";
	  String password="T#9758@qlph";  
	  String Query="delete from items_list where item_id='1'";
	  Connection con=DriverManager.getConnection(url, username, password);
	  PreparedStatement pst=con.prepareStatement(Query);
	  pst.executeUpdate();
	  con.close();
	 
			  }
  public static void main(String[]args) throws Exception {
		Deletevalues();
}
}