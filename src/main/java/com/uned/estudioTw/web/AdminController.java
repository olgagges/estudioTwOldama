package com.uned.estudioTw.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.uned.estudioTw.model.Admin;
import com.uned.estudioTw.model.Persona;
import com.uned.estudioTw.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	AdminService adminService;

	@RequestMapping(value = "/addAdmin.htm", method = RequestMethod.POST)
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
	public String addAdmin() {
		return "addAdmin";
	}
	
	@RequestMapping(value = "/editAdmin.htm")
	public ModelAndView editAdmin(@RequestParam("id") long idAdmin) {
		Admin admin = adminService.obtener(idAdmin);
		ModelAndView mav = new ModelAndView("editAdmin");
		mav.addObject("admins", admin);
		return mav;
	}

	@RequestMapping(value = "/editAdmin.htm", method = RequestMethod.POST)
	public ModelAndView addAdmin(Admin admin, Errors errors) {
		adminService.editar(admin);
		return new ModelAndView("redirect:/personaeditada.htm");
	}

	@RequestMapping(value = "/listAdmins.htm")
	public ModelAndView allAdmins() {

		
		List<Admin> admins = adminService.listarTodos();

		ModelAndView mav = new ModelAndView("listAdmins");
		mav.addObject("admins", admins);
		return mav;
	}
	
	@RequestMapping(value = "/delAdmin.htm")
	public ModelAndView delAdmin(@RequestParam("id") long idAdmin) {
		Admin admin = adminService.obtener(idAdmin);
		adminService.borrar(admin);
		return new ModelAndView("redirect:/personaborrada.htm");
	}
	
	@RequestMapping(value = "/personaadd.htm")
	public String personadd() {
		return "personadd";
	}
	


}
