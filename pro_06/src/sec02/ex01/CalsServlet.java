package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/calc")
public class CalsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static float USD_RATE = 1124.70F;
	private static float JPN_RATE = 10.113F;
	private static float CNY_RATE = 163.30F;
	private static float GBP_RATE = 1444.35F;
	private static float EUR_RATE = 1295.97F;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("utf-8");
		
		
		response.setContentType("text/html;charset=utf-8");
		
		
		PrintWriter pw = response.getWriter();
		String command = request.getParameter("command");
		String won = request.getParameter("won");
		String operator = request.getParameter("operator");
		
		
		
		
		if (command != null && command.equals("calculate")) {
			String result = calculate(Float.parseFloat(won), operator);
			pw.print("<html><font size=7>변환결과</font><br>");
			pw.print("<html><font size=7>" + result + "</font><br>");
			pw.print("<a href='/pro_06/calc'>환율 계산기로 돌아가기</a>");
			return;
		}
		
		
		
		
		pw.print("<html><title>환율계산기 김민상</title>");
		pw.print("<font size=5>환율 계산기</font><br>");
		pw.print("<form  name='frmCalc' method='get'  action='/pro_06/calc'/>  ");
		pw.print("원화: <input type='text' name='won' size=10  />원을  ");
		pw.print("<select name='operator' >");
		pw.print("<option value='dollar'>달러로</option>");
		pw.print("<option value='en'>엔화로</option>");
		pw.print("<option value='wian'>위안화로</option>");
		pw.print("<option value='pound'>파운드로</option>");
		pw.print("<option value='euro'>유로로</option>");
		pw.print("</select>");
		pw.print("<input type='hidden' name='command' value='calculate'/>  ");
		pw.print("<input type='submit' value='변환'  />");
		pw.print("</form>");
		pw.print("</html>");
		pw.close();
		
	
	}
	
	
	
	
	private static String calculate(float won, String operator) {
		String result = null;
		if (operator.equals("dollar")) {
			result = String.format("%.2f", won / USD_RATE);
		} else if (operator.equals("en")) {
			result = String.format("%.2f", won / JPN_RATE);
		} else if (operator.equals("wian")) {
			result = String.format("%.2f", won / CNY_RATE);
		} else if (operator.equals("pound")) {
			result = String.format("%.2f", won / GBP_RATE);
		} else if (operator.equals("euro")) {
			result = String.format("%.2f", won / EUR_RATE);
		}
		return result;
	}

}
