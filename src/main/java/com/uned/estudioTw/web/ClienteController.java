package com.uned.estudioTw.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.uned.estudioTw.model.Cliente;
import com.uned.estudioTw.model.Persona;
import com.uned.estudioTw.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	ClienteService clienteService;

	@RequestMapping(value = "/addCliente.htm", method = RequestMethod.POST)
	public ModelAndView addClient(Persona persona, Errors errors) {
		if (errors.hasErrors()) {
			ModelAndView mav = new ModelAndView("addCliente");
			mav.addObject("errors", errors);
			return mav;
		}
		Cliente cliente = new Cliente();
		cliente.setPersona(persona);
		clienteService.crear(cliente);
		return new ModelAndView("redirect:/sendForm.jsp");
	}

	@RequestMapping(value = "/addCliente.htm")
	public String addClient() {
		return "addCliente";
	}

	@RequestMapping(value = "/sendForm.htm")
	public String sendForm() {
		return "sendForm";
	}
	
	/*@RequestMapping(value = "/editClients.htm")
	public ModelAndView editCliente(long id)) {

		
		List<Cliente> clientes = clienteService.editarCliente(id);

		ModelAndView mav = new ModelAndView("listClientes");
		mav.addObject("cliente", clientes);
		return mav;
	}*/

	@RequestMapping(value = "/listClientes.htm")
	public ModelAndView allClients() {

		
		List<Cliente> clientes = clienteService.listarTodos();

		ModelAndView mav = new ModelAndView("listClientes");
		mav.addObject("clients", clientes);
		return mav;
	}

}
