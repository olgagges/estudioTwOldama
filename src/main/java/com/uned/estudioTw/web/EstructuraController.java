package com.uned.estudioTw.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.uned.estudioTw.model.Estructura;
import com.uned.estudioTw.model.TipoProyecto;
import com.uned.estudioTw.service.EstructuraService;
import com.uned.estudioTw.model.Cliente;
import com.uned.estudioTw.model.Persona;
import com.uned.estudioTw.service.ClienteService;

@Controller
public class EstructuraController {

	@Autowired
	EstructuraService estructuraService;

	
	@RequestMapping(value = "/addEstructura.htm")
	public ModelAndView addEstructura(@RequestParam("id") long idCliente) {
		ModelAndView mav = new ModelAndView("addEstructura");
		mav.addObject("idCliente", idCliente);
		return mav;
	}

	@RequestMapping(value = "/addEstructura.htm", method = RequestMethod.POST)
	public ModelAndView addEstructura(Estructura estructura, Errors errors) {
		if (errors.hasErrors()) {
			ModelAndView mav = new ModelAndView("addEstructura");
			mav.addObject("errors", errors);
			return mav;
		}
		estructuraService.crear(estructura);
		return new ModelAndView("redirect:/sendForm.htm");
	}

	

	
	
	
}
