package servlets;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
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
 * Servlet implementation class inventoryServlet
 */
@WebServlet("/addCarServlet")
public class addCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public addCarServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Car> cars = Repository.getCarList();
		Car car = new Car();
		car.setMake(request.getParameter("make"));
		car.setModelName(request.getParameter("model"));
		car.setPrice(request.getParameter("price"));
		car.setYear(request.getParameter("year"));
		car.setDescription(request.getParameter("description"));
		car.setOdometer(request.getParameter("odometer"));
		car.setPicturePath(request.getParameter("picture"));
		car.setColor(request.getParameter("color"));
		car.setVin(request.getParameter("vin"));
		LocalDate today = LocalDate.now();
		car.setDateRecieved(today);

		cars.add(car);

		try {
			File file = new File(
					"C:\\Users\\ngwac\\eclipse-carDealership\\carDealership\\WebContent\\WEB-INF\\cars.txt");
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			if (file.length() < 1) {

				bw.write(car.toFile());
				bw.close();
			} else {
				bw.newLine();
				bw.write(car.toFile());
				bw.close();
			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		HttpSession session = request.getSession(true);
		session.setAttribute("cars", cars);
		RequestDispatcher rd = request.getRequestDispatcher("inventoryServlet");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
