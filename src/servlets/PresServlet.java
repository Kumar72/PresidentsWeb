package servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
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
		ServletContext context = getServletContext();
		start = new PresDAOImpl(context);
		// start calls method from DAO that starts instantiation of main data object and rest of operations
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<Integer, President> presData;
		
			start.loadPresidentsFromFile();
//			presData = start.getHashMapFromArrayList();
//			req.setAttribute("term", presData); // this passes session's data to output.jsp
		// instantiates defensive copy of database in List presData to be used in session.

		HttpSession session = req.getSession(); // gets session id if exists
		if ( start == null ) { // if new session, assign session id
			presData = new HashMap<>();
			session.setAttribute("term", presData); 
		}
		req.getRequestDispatcher("/display.jsp").forward(req, resp);
	}
		

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(); // gets session id if exists	
		Map<Integer, President> presData = (Map<Integer, President>)session.getAttribute("term"); // instantiates defensive copy of database
		System.out.println("after presData");
		
		if ( start == null ) { // if new session, assign session id
			presData = new HashMap<>();
			session.setAttribute("term", presData); 
			System.out.println("in if");

		}
		System.out.println("sent to test");

		req.getRequestDispatcher("/test.html").forward(req, resp);
	}

}
