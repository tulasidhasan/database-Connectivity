import java.sql.*;
public class TRY 
{
	public static void main(String[] args) throws Exception
	{
		display();
	}
	public static void display() throws Exception
	{
		String url="jdbc:mysql://localhost:3306/tulasi";
		String user="root";
		String pass="Tulasi@1109";
		String q="select * from TULASI";

	Connection con=DriverManager.getConnection(url,user,pass);
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(q);
	while(rs.next())
	{
		System.out.println("ID is "+rs.getInt(1));
		System.out.println("name is "+rs.getString(2));
		System.out.println("cgpa is"+rs.getFloat(3));
	}
	con.close();
	}
}