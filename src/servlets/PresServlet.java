package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		Map<Integer, President> presData;
		try {
			presData = start.getHashMapFromArrayList();
			req.setAttribute("term", presData); // this passes session's data to output.jsp
		} catch (Exception e) {
			System.out.println("File Not Found. ");
			e.printStackTrace();
		} // instantiates defensive copy of database in List presData to be used in session.

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
		
		if ( start == null ) { // if new session, assign session id
			presData = new HashMap<>();
			session.setAttribute("president", presData); 
		}
		req.getRequestDispatcher("/Output.jsp").forward(req, resp);
	}

}
