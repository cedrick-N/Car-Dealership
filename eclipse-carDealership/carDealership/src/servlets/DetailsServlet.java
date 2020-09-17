package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.car.Car;
import com.car.Repository;

@WebServlet("/DetailsServlet")  //IDENTIFIER 
public class DetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DetailsServlet() {
        super();
       
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String vin = request.getParameter("vin");
		for(Car car:Repository.getCarList()) {
			if(vin.equals(car.getVin())) {
				session.setAttribute("car", car);
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher("details.jsp");
		rd.forward(request, response); //
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
