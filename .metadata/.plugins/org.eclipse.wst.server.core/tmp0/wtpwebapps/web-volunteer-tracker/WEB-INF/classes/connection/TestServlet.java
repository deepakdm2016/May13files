package com.jdbc.connection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	
	//define datasource
	@Resource(name="jdbc/web_student_tracker")
	private DataSource dataSource;
    public TestServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//setup printwriter
		PrintWriter out=response.getWriter();
		response.setContentType("text/plain");
		//getting a connection to database
		Connection myconn=null;
		Statement mystmt=null;
		ResultSet res=null;
		try{
		//create sql
		myconn=dataSource.getConnection();
		String sql="select * from student";
		mystmt=myconn.createStatement();
		//execute sql
		res=mystmt.executeQuery(sql);
		//process result set
		while (res.next())
		{
			String email=res.getString("email");
		out.println(email);
		
		}
		}
		catch (Exception E)
		{
			E.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
