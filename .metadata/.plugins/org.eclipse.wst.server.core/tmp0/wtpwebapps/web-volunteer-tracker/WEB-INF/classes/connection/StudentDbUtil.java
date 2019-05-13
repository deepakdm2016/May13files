package com.jdbc.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class StudentDbUtil {
	
	private static DataSource dataSource;
	
	public StudentDbUtil(DataSource theDataSource)
	{
		dataSource=theDataSource;
		
	}

	
	public List<Student> getStudents() throws Exception
	{
		
		List<Student> students=new ArrayList();
		Connection myConn=null;
		Statement mystmt=null;
		ResultSet Rs=null;
		try{
			myConn=dataSource.getConnection();
			
			String sql="select * from VOLUNTEER order by last_name";
		mystmt=myConn.createStatement();
		Rs=mystmt.executeQuery(sql);
		while(Rs.next())
		{
		int id=Rs.getInt("ID");
		String firstName=Rs.getString("first_name");
		String lastName=Rs.getString("last_name");
		String email=Rs.getString("EMAIL");
		String gender=Rs.getString("GENDER");
		String Phonenum=Rs.getString("PHONENUM");

		Student tempStudent=new Student(id, firstName, lastName, email, gender, Phonenum);
		students.add(tempStudent);
		}
		return students;
		
		}
		finally{
close(myConn,mystmt, Rs);			
		}
		
	}


	private static void close(Connection myConn, Statement mystmt, ResultSet rs) {
		// TODO Auto-generated method stub
		
		try{
		if(rs!=null)
		{
		
			rs.close();
			 
		}
		
		if(mystmt!=null)
		{
		
			mystmt.close();
			 
		}
		
		if(myConn!=null)
		{
		
			myConn.close();//put back to connection pool
			 
		}
		}
		
		catch (Exception Ex)
		{
			Ex.printStackTrace();
		}
	}


	public static void addStudent(Student thestudent) throws Exception{
		Connection myconn=null;
		PreparedStatement mystmt=null;
		
		try{
			
			//get db connection
			myconn=dataSource.getConnection();
		//create sql stmt
			String sql="insert into VOLUNTEER "
			+ "(first_name, last_name,email, GENDER, PHONENUM) "
					+ "values(?,?,?,?,?)";
			
		mystmt=myconn.prepareStatement(sql);
		//set param value
			mystmt.setString(1, thestudent.getFirstName());
			mystmt.setString(2, thestudent.getLastName());
			mystmt.setString(3, thestudent.getEmail());
			mystmt.setString(4, thestudent.getGender());
			mystmt.setString(5, thestudent.getPhonenum());
		
		//execute sql insert
			mystmt.execute();
		}
		finally{
		//clean up jdbc
			close(myconn, mystmt, null);
		}
	}


	


	public static Student getStudent(String theStudentId) throws Exception {
		// TODO Auto-generated method stub
		Student theStudent= null;
		Connection myconn=null;
		PreparedStatement stmnt=null;
		ResultSet rs=null;
		int studentId;
		
		try{
			//convert theStudentId to int
			studentId=Integer.parseInt(theStudentId);
			//get connection from database
			myconn=dataSource.getConnection();
			//get matched record with id
			String sql="select * from VOLUNTEER where id=?";
			
			//create prepared statement
			stmnt=myconn.prepareStatement(sql);
			
			//set params
			stmnt.setInt(1, studentId);
			
			rs=stmnt.executeQuery();
			
			//retreive data from result set
			
			if (rs.next())
			{
				String firstName=rs.getString("first_name");
				String lastName=rs.getString("last_name");
				String email=rs.getString("EMAIL");
				String gender=rs.getString("GENDER");
				String phonenum=rs.getString("PHONENUM");

				theStudent=new Student(studentId, firstName, lastName, email, gender, phonenum);
			}
			else
			{
				
				throw new Exception("Could not find the student id" + theStudentId);
			}
			return theStudent;
				
		}
		finally{
			close(myconn, stmnt, rs);
			
		}
		
	}


	
	


	public static void updateStudent(Student theStudent) throws Exception {
		// TODO Auto-generated method stub
		Connection myconn=null;
		PreparedStatement stmnt=null;
		
		
		
		try{
		
			//get connection from database
			myconn=dataSource.getConnection();
			//get matched record with id
			String sql="update VOLUNTEER set first_name=?, last_name=?, EMAIL=?, GENDER=?, PHONENUM=? where id=?";
			
			//create prepared statement
			stmnt=myconn.prepareStatement(sql);
			
			//set params
			stmnt.setString(1, theStudent.getFirstName());
			stmnt.setString(2, theStudent.getLastName());
			stmnt.setString(3, theStudent.getEmail());
			stmnt.setString(4, theStudent.getGender());
			stmnt.setString(5, theStudent.getPhonenum());
			stmnt.setInt(6, theStudent.getId());
			
			stmnt.execute();
			
			//retreive data from result set
		
			
				
		}
		finally{
			close(myconn, stmnt, null);
			
		}
	}


	


	public static void deleteStudent(int id) throws Exception {
		// TODO Auto-generated method stub
		Connection myconn=null;
		PreparedStatement stmnt =null;
		
		try{
			myconn=dataSource.getConnection();
			String sql="delete from VOLUNTEER where id=?";
			stmnt=myconn.prepareStatement(sql);
			stmnt.setInt(1, id);
			stmnt.execute();
		}
		finally{
			close(myconn, stmnt, null);
			
		}
		
	}
	
}
