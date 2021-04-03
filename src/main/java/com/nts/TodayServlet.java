package com.nts;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 현재 시간 출력 Servlet 
 */
@WebServlet("/aboutme/today")
public class TodayServlet extends HttpServlet {
	/*
	 * 현재 시간 출력 Method
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType(ContentType.htmlType);
		PrintWriter out = response.getWriter();

		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/M/d HH:mm");
		LocalDateTime currentLocalDateTime = LocalDateTime.now();
		String currentTime = currentLocalDateTime.format(format);

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<style>");
		out.println("h1{" + "font-size:77px;" + "text-align:center;" + "margin-top:15%;}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<a href=\"../index.html\">메인화면</a>");
		out.println("<h1>현재시간 : " + currentTime + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
