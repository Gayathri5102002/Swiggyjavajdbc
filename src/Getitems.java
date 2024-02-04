import java.sql.*;
public class Getitems {
  public static void Getvalues()throws Exception {
	  String url="jdbc:mysql://127.0.0.1:3306/swiggy";
	  String username="root";
	  String password="T#9758@qlph";
	  String Query="select * from items_list ";
	  Connection con=DriverManager.getConnection(url, username, password);
	  Statement st=con.createStatement();
	  ResultSet rest=st.executeQuery(Query);
	  while(rest.next()) {
		  System.out.println("Items id:" + rest.getInt(1));
		  System.out.println("Items name :" + rest.getString(2));
		  System.out.println("No of Items:" + rest.getInt(3));
		  System.out.println("price:" + rest.getInt(4));
		  System.out.println("Deleivery fees" + rest.getInt(5));
		  System.out.println("Total price:" + rest.getInt(6));
	  }
  }
  public static void main (String[]args)throws Exception {
	  Getvalues();
  }
}
