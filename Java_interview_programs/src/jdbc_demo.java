import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_demo {
	
	public static void main(String v[]) throws SQLException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/hb-01-one-to-one-uni","hbstudent","hbstudent");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from instructor");
		String fn, ln, email;
		while(rs.next())
		{
			fn=rs.getString("first_name");
			ln=rs.getString("last_name");
			email=rs.getString("email");
			
			System.out.println(fn +  ln +  email);
		}
		
		ResultSet rs1=s.executeQuery("select max(id) from instructor");
		
		int xyz=0;
		while(rs1.next())
		{
			xyz=rs1.getInt("max(id)");
		}
		
		
		s.execute("INSERT INTO instructor values("+ ++xyz +",'Prithvi', 'DM', 'prithvi.dm@gmail.com',null)");
		
		int x=s.executeUpdate("update instructor set first_name='Likhitha'  where first_name='Deepak';");
		System.out.println(x);
		
		s.executeUpdate("delete from instructor where id=10");
	}

}
