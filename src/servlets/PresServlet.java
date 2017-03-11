package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import data.PresDAOImpl;

public class PresServlet extends HttpServlet {
	private PresDAOImpl start;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
//		if logic to account for simultaneous use sessions?
		
		req.setAttribute(name, o);
		req.getRequestDispatcher("/display.jsp").forward(req, resp);
	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute(name, o);
		req.getRequestDispatcher("/Output.jsp").forward(req, resp);
//		copy paste session logic from deGet()
	}

	@Override
	public void init() throws ServletException {
		start = new presStart();
		// presStart calls method from DAO that starts instantiation of map and rest of operations
	}

}
