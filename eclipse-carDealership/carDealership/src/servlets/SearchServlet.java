package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.car.Car;
import com.car.Repository;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String varToSearch = request.getParameter("Search");
		List<Car> searchResults= new ArrayList<Car>();
		 for(Car car:Repository.getCarList()) {
			 if(car.getMake().equalsIgnoreCase(varToSearch)) {
				 searchResults.add(car);
			 }else if(car.getModelName().equalsIgnoreCase(varToSearch)){
				 searchResults.add(car);
			 }else if(car.getYear().equalsIgnoreCase(varToSearch)) {
				 searchResults.add(car);
			 }else if(car.getColor().equalsIgnoreCase(varToSearch)) {
				 searchResults.add(car);
			 }else if(car.newOrUsedString().equalsIgnoreCase(varToSearch)) {
				 searchResults.add(car);
			 }
		 }
		 HttpSession session = request.getSession(true);
		 session.setAttribute("searchResults", searchResults);
		 RequestDispatcher rd = request.getRequestDispatcher("search.jsp");
		 rd.forward(request, response);
		 
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
