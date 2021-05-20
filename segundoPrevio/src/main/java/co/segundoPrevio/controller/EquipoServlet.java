package co.segundoPrevio.controller;

import java.io.IOException;
import java.util.List;

import co.segundoPrevio.dao.CountryDao;
import co.segundoPrevio.dao.CountryDaoFactory;
import co.segundoPrevio.model.Country;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/")
public class EquipoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CountryDao countryDao;
	
    /**
     * Default constructor. 
     */
    public EquipoServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		this.countryDao = CountryDaoFactory.getCountryDao("postgresql");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Country> countrys = this.countryDao.selectAll();
		System.out.println(countrys.toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
