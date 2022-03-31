package com.uned.estudioTw.web;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.uned.estudioTw.model.Persona;



@Controller
public class PersonaController {

	@Autowired
	private SessionFactory sessionFactory;

	@RequestMapping(value = "/addPersona.htm", method = RequestMethod.POST)
	public ModelAndView addPerson(Persona p, Errors errors) {
		if (errors.hasErrors()) {
			ModelAndView mav = new ModelAndView("addPersona");
			mav.addObject("errors", errors);
			return mav;
		}

		sessionFactory.getCurrentSession().save(p);
		return new ModelAndView("redirect:/listPersonas.htm");
	}

	@RequestMapping(value = "/addPersona.htm")
	public String addPerson() {
		return "addPersona";
	}

	@RequestMapping("/listPersonas.htm")
	public ModelAndView allPersons() {
		@SuppressWarnings("unchecked")
	
		List<Persona> persons = sessionFactory.getCurrentSession().createQuery("FROM Persona").list();

		ModelAndView mav = new ModelAndView("listPersonas");
		mav.addObject("persons", persons);
		return mav;
	}

}
