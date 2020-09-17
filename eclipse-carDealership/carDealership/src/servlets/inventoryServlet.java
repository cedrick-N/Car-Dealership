package servlets;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
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
@WebServlet("/inventoryServlet")
public class inventoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);

		List<Car> cars = new ArrayList<Car>();
		try {
			ServletContext context = getServletContext();
			InputStream is = context.getResourceAsStream("/WEB-INF/cars.txt");
			if (is != null) {

				InputStreamReader isr = new InputStreamReader(is);
				Scanner scanner = new Scanner(new File(
						"C:\\Users\\ngwac\\eclipse-carDealership\\carDealership\\WebContent\\WEB-INF\\cars.txt"));

				String line;

				while (scanner.hasNextLine()) {
					line = scanner.nextLine();
//	return make + ";"+ modelName + ";" + year + ";" + odometer + ";" + description 
//			+ ";" + Price + ";" + picturePath;

					String[] readCarFile = line.split(";");
					Car car = new Car();
					car.setMake(readCarFile[0]);
					car.setModelName(readCarFile[1]);
					car.setYear(readCarFile[2]);
					car.setOdometer(readCarFile[3]);
					car.setDescription(readCarFile[4]);
					car.setPrice(readCarFile[5]);
					car.setColor(readCarFile[6]);
					car.setVin(readCarFile[7]);
					String[] dateArray = readCarFile[8].split("-");
					int year = Integer.parseInt(dateArray[0]);
					int month = Integer.parseInt(dateArray[1]);
					int day = Integer.parseInt(dateArray[2]);

					LocalDate date = LocalDate.of(year, month, day);
					car.setDateRecieved(date);
					car.setPicturePath(readCarFile[9]);
					System.out.println(car.toFile());
					System.out.println(car.isBidable);
					cars.add(car);

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Repository.setCarList(cars);
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		List<Car> cars = Repository.getCarList();
		session.setAttribute("cars", cars);

		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
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
