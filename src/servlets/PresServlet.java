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
		ServletContext context = getServletContext(); //instantiate ServletContext to allow access to WebContent
		start = new PresDAOImpl(context);
		// start instantiation of main data object and rest of operations
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<President> data = new ArrayList<>();
		data = start.getPicturePath();
		req.setAttribute("presData", data);
		req.getRequestDispatcher("/display.jsp").forward(req, resp);
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
