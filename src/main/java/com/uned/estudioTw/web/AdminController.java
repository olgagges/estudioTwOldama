package com.uned.estudioTw.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.uned.estudioTw.model.Admin;
import com.uned.estudioTw.model.Persona;
import com.uned.estudioTw.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	AdminService adminService;

	@RequestMapping(value = "/addadmin.htm", method = RequestMethod.POST)
	public ModelAndView addAdmin(Persona persona, Errors errors) {
		if (errors.hasErrors()) {
			ModelAndView mav = new ModelAndView("addAdmin");
			mav.addObject("errors", errors);
			return mav;
		}
		Admin admin = new Admin();
		admin.setPersona(persona);
		adminService.crear(admin);
		return new ModelAndView("redirect:/listAdmins.htm");
	}

	@RequestMapping(value = "/addAdmin.htm")
	public String addadmin() {
		return "addAdmin";
	}

	@RequestMapping(value = "/listAdmins.htm")
	public ModelAndView allAdmins() {

		
		List<Admin> admins = adminService.listarTodos();

		ModelAndView mav = new ModelAndView("listAdmins");
		mav.addObject("admins", admins);
		return mav;
	}

}
