package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import data.PresDAOImpl;
import data.President;

public class PresServlet extends HttpServlet {
	private PresDAOImpl start;
	
	@Override
	public void init() throws ServletException {
		start = new PresDAOImpl();
		// start calls method from DAO that starts instantiation of main data object and rest of operations
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<President> presData = start.getClass(); // instantiates defensive copy of database in List presData to be used in session.
		req.setAttribute("president", presData); // this passes session's data to output.jsp

		HttpSession session = req.getSession(); // gets session id if exists
		if ( start == null ) { // if new session, assign session id
			presData = new ArrayList<>();
			session.setAttribute("president", presData); 
		}
		req.getRequestDispatcher("/display.jsp").forward(req, resp);
	}
		

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<President> presData = start.getClass()session.getAttribute("president"); // instantiates defensive copy of database
		HttpSession session = req.getSession(); // gets session id if exists	
		
		HttpSession session = req.getSession(); // gets session id if exists
		if ( start == null ) { // if new session, assign session id
			presData = new ArrayList<>();
			session.setAttribute("president", presData); 
		}
		req.getRequestDispatcher("/Output.jsp").forward(req, resp);
	}

}
