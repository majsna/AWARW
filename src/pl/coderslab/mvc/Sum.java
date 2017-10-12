package pl.coderslab.mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sum")
public class Sum extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/mvc/sumForm.jsp")
		.forward(request, response);
	}

//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		int a = Integer.parseInt(request.getParameter("a"));
//		int b = Integer.parseInt(request.getParameter("b"));
//		int c = a + b;
//		request.setAttribute("a", a);
//		request.setAttribute("b", b);
//		request.setAttribute("sum", c);
//		getServletContext().getRequestDispatcher("/WEB-INF/mvc/sum.jsp").forward(request, response);
//	}

}
