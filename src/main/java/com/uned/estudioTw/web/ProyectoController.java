package com.uned.estudioTw.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.uned.estudioTw.model.Proyecto;
import com.uned.estudioTw.model.TipoProyecto;
import com.uned.estudioTw.service.ProyectoService;

@Controller
public class ProyectoController {

	@Autowired
	ProyectoService proyectoService;

	@RequestMapping(value = "/addProyecto.htm/{idCliente}")
	public ModelAndView addClientProject(@PathVariable("idCliente") long idCliente) {
		
		//Obtener tipos de proyecto
		List<TipoProyecto> tiposProyecto = proyectoService.obtenerTiposProyecto();
		ModelAndView mav = new ModelAndView("addProyecto");
		mav.addObject("idCliente", idCliente);
		mav.addObject("tiposProyecto", tiposProyecto);
		return mav;
	}
	
	@RequestMapping(value = "/addProyecto.htm", method = RequestMethod.POST)
	public ModelAndView addClient(Proyecto proyecto, Errors errors) {
		if (errors.hasErrors()) {
			ModelAndView mav = new ModelAndView("addProyecto");
			mav.addObject("errors", errors);
			return mav;
		}
		return new ModelAndView("redirect:/sendForm.jsp");
	}

}