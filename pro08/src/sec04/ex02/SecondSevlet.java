package sec04.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/second")
public class SecondSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String address = (String)request.getAttribute("address");
				
		out.println("<html><body bgcolor='#ffffff'><span style=\"color:#7895B2\">");
		out.println("<h1>주소 : "+ address + "</h1>");
		out.println("<br>");
		out.println("<h2>==redirect를 이용한 실습입니다. ==</h2>");
		out.println("</span></body></html>");
	
	}

}



