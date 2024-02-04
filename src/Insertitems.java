import java.sql.*;
public class Insertitems {
  public static void Insertvalue() throws Exception{
	  String url="jdbc:mysql://127.0.0.1:3306/swiggy";
	  String username="root";
	  String password="T#9758@qlph";
	  String Query="insert into items_list values(?,?,?,?,?,?)";
	  Connection con=DriverManager.getConnection(url, username, password);
	  PreparedStatement pst=con.prepareStatement(Query);
	  pst.setInt(1,2);
	  pst.setString(2,"Burger");
	  pst.setInt(3, 1);
	  pst.setInt(4,199);
	  pst.setInt(5, 40);
	  pst.setInt(6, 239);
	  pst.setInt(1,3);
	  pst.setString(2,"Biriyani");
	  pst.setInt(3, 1);
	  pst.setInt(4,100);
	  pst.setInt(5, 50);
	  pst.setInt(6, 150);
	  pst.executeUpdate();
	  con.close();
	  }
  public static void main(String[]args) throws Exception{
	  Insertvalue();
  }
}
