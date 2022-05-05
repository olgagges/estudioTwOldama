package com.uned.estudioTw.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.uned.estudioTw.model.Arquitecto;
import com.uned.estudioTw.model.Persona;
import com.uned.estudioTw.service.ArquitectoService;

@Controller
public class ArquitectoController {

	@Autowired
	ArquitectoService arquitectoService;

	@RequestMapping(value = "/addArquitecto.htm", method = RequestMethod.POST)
	public ModelAndView addArquitect(Persona persona, Errors errors) {
		if (errors.hasErrors()) {
			ModelAndView mav = new ModelAndView("addArquitecto");
			mav.addObject("errors", errors);
			return mav;
		}
		Arquitecto arquitecto = new Arquitecto();
		arquitecto.setPersona(persona);
		arquitectoService.crear(arquitecto);
		return new ModelAndView("redirect:/listArquitectos.htm");
	}

	@RequestMapping(value = "/addArquitecto.htm")
	public String addArquitect() {
		return "addArquitecto";
	}

	@RequestMapping(value = "/listArquitectos.htm")
	public ModelAndView allArquitects() {

		
		List<Arquitecto> arquitectos = arquitectoService.listarTodos();

		ModelAndView mav = new ModelAndView("listArquitectos");
		mav.addObject("arquitects", arquitectos);
		return mav;
	}

}
