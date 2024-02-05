package com.laptrinhjava.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.laptrinhjava.service.ICategoryService;
import com.laptrinhjava.service.INewService;

@SuppressWarnings("unused")
@WebServlet(urlPatterns = { "/trang-chu" })  //sử dụng urlPatterns để khai báo nhiểu ul
public class HomeController extends HttpServlet {

	@Inject
	private ICategoryService categoryService;
	@Inject
	private INewService newService;
	
	private static final long serialVersionUID = 7253508122648689956L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setAttribute("news", categoryService.findAll());
		RequestDispatcher rd = req.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	}
}
