package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.PresDAOImpl;
import data.President;

public class PresServlet extends HttpServlet {
	private PresDAOImpl start;

	@Override
	public void init() throws ServletException {
		ServletContext context = getServletContext(); // instantiate
														// ServletContext to
														// allow access to
														// WebContent
		start = new PresDAOImpl(context);
		// start instantiation of main data object and rest of operations
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<President> data = new ArrayList<>();
		data = start.getPicturePath();
		req.setAttribute("presData", data);
		String back = req.getParameter("back");
		String next = req.getParameter("next");
		String id = req.getParameter("id");
		int term2 = 0;
//		System.out.println(back); to test output of buttons
//		System.out.println(id);
//		System.out.println(next);
		try {
			int term = Integer.parseInt(id);
			if (back != null) {
				try {
					term2 = term - 1;
					if (term == 1) {
						term2 = 45;
					}
					req.setAttribute("id", id);
					req.setAttribute("presData", data);
					req.setAttribute("term", term2);
					req.getRequestDispatcher("/Output.jsp").forward(req, resp);
				} catch (Exception e) {
					req.setAttribute("presData", data);
					req.setAttribute("term", term2);
					req.getRequestDispatcher("/Output.jsp").forward(req, resp);
				}
			} else if (next != null) {
				try {
					term2 = term + 1;
					if (term == 45) {
						term2 = 1;
					}
					req.setAttribute("id", id);
					req.setAttribute("presData", data);
					req.setAttribute("term", term2);
					req.getRequestDispatcher("/Output.jsp").forward(req, resp);
				} catch (Exception e) {
					req.setAttribute("presData", data);
					req.setAttribute("term", term2);
					req.getRequestDispatcher("/Output.jsp").forward(req, resp);
				}
			} 
			else{
				req.getRequestDispatcher("/display.jsp").forward(req, resp); 
				}
		} catch (Exception e) {
			System.out.println(e);
			req.getRequestDispatcher("/display.jsp").forward(req, resp); 
		}		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<President> data = new ArrayList<>();
		data = start.getPicturePath();
		Integer term = Integer.parseInt(req.getParameter("presNum"));
		req.setAttribute("presData", data);
		req.setAttribute("term", term);
		
		req.getRequestDispatcher("/Output.jsp").forward(req, resp);
	}
}
