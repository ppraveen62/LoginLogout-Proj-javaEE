package com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=request.getParameter("emailid");
		String Password=request.getParameter("pswrd");
		
		RequestDispatcher rd = null;
		
		if(email.equals("ppraveen@gmail.com") && Password.equals("kumar01") ) {
			rd=request.getRequestDispatcher("Sucess");
			rd.forward(request, response);
		}
		else {
			rd=request.getRequestDispatcher("index.html");
			PrintWriter writer=response.getWriter();
			rd.include(request, response);
			writer.println(("<center> <span style = 'color:red'> Invalid Credentials </span> </center>"));
		}
	}

}
