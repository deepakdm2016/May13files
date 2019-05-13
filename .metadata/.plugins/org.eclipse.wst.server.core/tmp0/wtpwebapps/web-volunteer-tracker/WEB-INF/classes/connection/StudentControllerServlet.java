package com.jdbc.connection;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet("/StudentControllerServlet")
public class StudentControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentDbUtil stdbutil;
	@Resource(name="jdbc/web_student_tracker")
	private DataSource datasource;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	//create student db util and pass in connection pool /data source
		try{
			stdbutil=new StudentDbUtil(datasource);
		}
		catch (Exception Ex)
		{
			throw new ServletException(Ex);
		}
	
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//read command parameter
		String theCommand=request.getParameter("command");
		System.out.println(theCommand);
		//route to appropriate method
		if(theCommand==null)
		{
			theCommand="LIST";
		}
		
		switch(theCommand)
		{
		case "LIST":listStudents(request,response);
		break;
		
		
		
		case "LOAD":try {
			loadStudent(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			break;
	
		case "UPDATE":try {
			updateStudent(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	     	break;
	     
		case "ADDFINAL":try {
        	addStudentFinal(request, response);
        }
        	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
       	break;
	
		case "DELETE":try {
			deleteStudent(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	break;
		
		default:
        	addStudentFinal(request, response);
			
		
		
		}
		
	}
	
	
	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	        try {
	            // read the "command" parameter
	            String theCommand = request.getParameter("command");
	                    System.out.println(theCommand+"Hullu");
	            // route to the appropriate method
	            switch (theCommand) {
	                            
	            case "ADD":
	            	
	                addStudent(request, response);
	                RequestDispatcher RequetsDispatcherObj =request.getRequestDispatcher("/license.jsp");
	    			RequetsDispatcherObj.forward(request, response);
	                break;
	                

	    		case "ADDFINAL":try {
	            	addStudentFinal(request, response);
	            }
	            	catch (Exception e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		}
	             break;                           
	            default:
	                //listStudents(request, response);
	            	addStudentFinal(request, response);

	            }
	                
	        }
	        catch (Exception exc) {
	            throw new ServletException(exc);
	        }
	        
	    }

	private void deleteStudent(HttpServletRequest request, 
			HttpServletResponse response) throws Exception{
		//read student id from form data
		int id=Integer.parseInt(request.getParameter("studentId"));
		//delete from database
		StudentDbUtil.deleteStudent(id);
		//send it back to list page
		listStudents(request, response);
		}

	private void updateStudent(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		//read student info
		
		int id=Integer.parseInt(request.getParameter("studentId"));
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String email=request.getParameter("email");
		String gender=request.getParameter("radios");
		String phonenum=request.getParameter("phonenum");
		
		String volunteer_option=request.getParameter("volunteer_option");
		System.out.println("Phone"+phonenum);
		//create new student
		
		Student theStudent=new Student(id, firstName, lastName, email,gender, phonenum, volunteer_option );
		
		//perform update
		StudentDbUtil.updateStudent(theStudent);
		
		
		
		//send back to list
		listStudents(request, response);
	}

	private void loadStudent(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//read student from form data
		String theStudentId=request.getParameter("studentId");
		//get student from dbutil using id
		
		Student theStudent=StudentDbUtil.getStudent(theStudentId);
		
		//place student in request attribute
		
		request.setAttribute("THE_STUDENT", theStudent);
		//send to jsp page: update-student0form.jsp
		RequestDispatcher dispatcher=request.getRequestDispatcher("update-student-form.jsp");
		dispatcher.forward(request, response);
	}

	private void addStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		//read student information from form
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String email=request.getParameter("email");
		String gender=request.getParameter("radios");
		String phonenum=request.getParameter("Phone");

		
		String legendName=firstName+"_"+lastName;
		System.out.println(email);
		System.out.println(gender);
		System.out.println(phonenum);

		//Create a new student
		//Student thestudent=new Student(firstName, lastName, email, gender, phonenum);
		//add to database
		//send back to main page
		
		
		

		
	}

	
	private void addStudentFinal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//read student information from form
		String firstName=session.getParameter("firstName");
		String lastName=session.getParameter("lastName");
		String email=session.getParameter("email");
		String gender=session.getParameter("radios");
		String phonenum=session.getParameter("Phone");

		
		String legendName=firstName+"_"+lastName;
		System.out.println(email);
		System.out.println(gender);
		System.out.println(phonenum);

		//Create a new student
		Student thestudent=new Student(firstName, lastName, email, gender, phonenum);
		//add to database
		//send back to main page
		
		
		StudentDbUtil.addStudent(thestudent);
		
		
       // AddLegends legend=new AddLegends();
		//legend.Add_upload_Legend(legendName);
		
	}

	
	private void listStudents(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		//get students from db util
		List<Student> students=null;
		try {
			students=stdbutil.getStudents();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//add students to request
		request.setAttribute("student_list", students);
		//send to jsp page
		RequestDispatcher dispatcher=request.getRequestDispatcher("list-students.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private void license(HttpServletRequest request, HttpServletResponse response) {
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("license.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
	

}
