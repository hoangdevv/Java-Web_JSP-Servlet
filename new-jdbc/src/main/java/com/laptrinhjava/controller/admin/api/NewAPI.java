package com.laptrinhjava.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laptrinhjava.model.NewModel;
import com.laptrinhjava.service.INewService;

import utils.HttpUtil;

@WebServlet(urlPatterns = { "/api-admin-new" }) 
public class NewAPI extends HttpServlet {
	
	@Inject
	private INewService newService;
	
	private static final long serialVersionUID = 5675865316838864718L;

	// POST: Them
	// PUT: Cap nhat
	// DELETE: xoa
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8"); 
		res.setContentType("application	/json"); 
		NewModel newModel = HttpUtil.of(req.getReader()).toModel(NewModel.class);
		newModel = newService.save(newModel);
		mapper.writeValue(res.getOutputStream(), newModel);
	}

	public void doPut(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8"); 
		res.setContentType("application	/json"); 
		NewModel updateNew = HttpUtil.of(req.getReader()).toModel(NewModel.class);
		updateNew = newService.update(updateNew);
		mapper.writeValue(res.getOutputStream(), updateNew);
	}

	public void doDelete(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		req.setCharacterEncoding("UTF-8"); 
		res.setContentType("application	/json"); 
		NewModel newModel = HttpUtil.of(req.getReader()).toModel(NewModel.class);
		newService.delete(newModel.getIds());
		mapper.writeValue(res.getOutputStream(), "{}");
	}
	
}