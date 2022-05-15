package com.uned.estudioTw.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uned.estudioTw.model.Cliente;
import com.uned.estudioTw.model.Estructura;
import com.uned.estudioTw.model.Persona;
import com.uned.estudioTw.model.Certificado;
import com.uned.estudioTw.model.TipoCertificado;
import com.uned.estudioTw.service.CertificadoService;
import com.uned.estudioTw.service.ClienteService;
import com.uned.estudioTw.service.EstructuraService;

@Controller
public class CertificadoController {

	@Autowired
	CertificadoService certificadoService;
	@Autowired
	EstructuraService estructuraService;
	@Autowired
	ClienteService clienteService;
	
	
	@RequestMapping(value = "/certificadoArea.htm")
	public ModelAndView certificadoArea(@RequestParam("id") long idCliente) {
		ModelAndView mav = new ModelAndView("certificadoarea");
		mav.addObject("idCliente", idCliente);
		return mav;
	}
	
	/*@RequestMapping(value = "/certificadoArea.htm")
	public String certificadoArea() {
		return "certificadoArea";
	}*/

	@RequestMapping(value = "/addCertificado.htm")
	public ModelAndView addCertificado(@RequestParam("id") long idCliente, @RequestParam("idestr") long idEstructura) {
		ModelAndView mav = new ModelAndView("addCertificado");
		mav.addObject("idCliente", idCliente);
		mav.addObject("idEstructura", idEstructura);
		return mav;
	}

	@RequestMapping(value = "/addCertificado.htm", method = RequestMethod.POST)
	public ModelAndView addCertificado(Certificado certificado, Errors errors) {
		if (errors.hasErrors()) {
			ModelAndView mav = new ModelAndView("addCertificado");
			mav.addObject("errors", errors);
			return mav;
		}
		certificadoService.crear(certificado);
		return new ModelAndView("redirect:/sendForm.jsp");
	}

}
