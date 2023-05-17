package by.tr.conspect.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import by.tr.conspect.bean.User;

public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Controller() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		switch(request.getParameter("operationType")){
		case "registration":

			registartionHandler(request, response);
		case "authorization":
			authorizationHandler(request, response);
		}


	}


	private void registartionHandler(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		System.out.print("name = "+request.getParameter("name"));
		User user = new User();
		user.setName(request.getParameter("name"));
		user.setLogin(request.getParameter("login"));
if (request.getParameter("yearOfBirth") != "") {
	//user.setYearBirthday(Integer.parseInt(request.getParameter("yearOfBirth")));
}
	 
		request.setAttribute("user", user);
		request.setAttribute("message", "Authiorized!");

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
		requestDispatcher.forward(request, response);


	}


	private void authorizationHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");

		User user = new User();
		user.setLogin(request.getParameter("login"));


		request.setAttribute("message", "Registered!");
		request.setAttribute("user", user);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
		requestDispatcher.forward(request, response);


	}

}
