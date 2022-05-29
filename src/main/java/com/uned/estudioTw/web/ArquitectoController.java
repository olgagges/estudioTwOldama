package com.uned.estudioTw.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uned.estudioTw.model.Arquitecto;
import com.uned.estudioTw.model.Persona;
import com.uned.estudioTw.service.ArquitectoService;

@Controller
public class ArquitectoController {

	@Autowired
	ArquitectoService arquitectoService;

	@RequestMapping(value = "/addArquitecto.htm", method = RequestMethod.POST)
	public ModelAndView addArquitecto(Persona persona, Errors errors) {
		if (errors.hasErrors()) {
			ModelAndView mav = new ModelAndView("addArquitecto");
			mav.addObject("errors", errors);
			return mav;
		}
		Arquitecto arquitecto = new Arquitecto();
		arquitecto.setPersona(persona);
		arquitectoService.crear(arquitecto);
		return new ModelAndView("redirect:/personadd.htm");
	}
	
	@RequestMapping(value = "/addArquitecto.htm")
	public String addArquitecto() {
		return "addArquitecto";
	}
	
	@RequestMapping(value = "/architecarea.htm")
	public ModelAndView ArchitecArea(Persona persona, Errors errors) {
		List<Arquitecto> arquitectos = arquitectoService.listarTodos();

		ModelAndView mav = new ModelAndView("architecarea");
		mav.addObject("arquitectos", arquitectos);
		return mav;
	}
	

	
	
	@RequestMapping(value = "/editArquitecto.htm")
	public ModelAndView editArquitecto(@RequestParam("id") long idArquitecto) {
		Arquitecto arquitecto = arquitectoService.obtener(idArquitecto);
		ModelAndView mav = new ModelAndView("editArquitecto");
		mav.addObject("arquitecto", arquitecto);
		return mav;
	}

	@RequestMapping(value = "/editArquitecto.htm", method = RequestMethod.POST)
	public ModelAndView addArchitect(Arquitecto arquitecto, Errors errors) {
		arquitectoService.editar(arquitecto);
		return new ModelAndView("redirect:/personaeditada.htm");
	}

	@RequestMapping(value = "/listArquitectos.htm")
	public ModelAndView allArchitects() {

		
		List<Arquitecto> arquitectos = arquitectoService.listarTodos();

		ModelAndView mav = new ModelAndView("listArquitectos");
		mav.addObject("arquitectos", arquitectos);
		return mav;
	}
	
	@RequestMapping(value = "/delArquitecto.htm")
	public ModelAndView delArquitecto(@RequestParam("id") long idArquitecto) {
		Arquitecto arquitecto = arquitectoService.obtener(idArquitecto);
		arquitectoService.borrar(arquitecto);
		return new ModelAndView("redirect:/personaborrada.htm");
	}
	

}
