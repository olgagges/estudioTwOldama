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
import com.uned.estudioTw.model.Certificado;
import com.uned.estudioTw.model.CertificadoDTO;
import com.uned.estudioTw.model.Cliente;
import com.uned.estudioTw.model.Estructura;
import com.uned.estudioTw.model.Proyecto;
import com.uned.estudioTw.service.ArquitectoService;
import com.uned.estudioTw.service.CertificadoService;
import com.uned.estudioTw.service.ClienteService;
import com.uned.estudioTw.service.EstructuraService;

import utils.Utils;

@Controller
public class CertificadoController {

	@Autowired
	CertificadoService certificadoService;
	@Autowired
	EstructuraService estructuraService;
	@Autowired
	ClienteService clienteService;
	@Autowired
	ArquitectoService arquitectoService;
	
	
	@RequestMapping(value = "/certificadoArea.htm")
	public ModelAndView certificadoArea(@RequestParam("id") long idCliente) {
		List<Estructura> estructuras = estructuraService.listarTodos();
		ModelAndView mav = new ModelAndView("certificadoArea");
		mav.addObject("estructuras", estructuras);
		mav.addObject("idCliente", idCliente);
		return mav;
	}
	
	/*@RequestMapping(value = "/certificadoArea.htm")
	public String certificadoArea() {
		return "certificadoArea";
	}*/

	@RequestMapping(value = "/addCertificado.htm")
	public ModelAndView addCertificado(@RequestParam("id") long idCliente, @RequestParam("idestr") long idEstructura) {
		Cliente cliente = clienteService.obtener(idCliente);
		Estructura estructura =estructuraService.obtener(idEstructura);
		ModelAndView mav = new ModelAndView("addCertificado");
		mav.addObject("cliente", cliente);
		mav.addObject("estructura", estructura);
		mav.addObject("idCliente", idCliente);
		mav.addObject("idEstructura", idEstructura);
		return mav;
	}

	@RequestMapping(value = "/addCertificado.htm", method = RequestMethod.POST)
	public ModelAndView addCertificado(CertificadoDTO certificado, Errors errors) {
		if (errors.hasErrors()) {
			ModelAndView mav = new ModelAndView("addCertificado");
			mav.addObject("errors", errors);
			return mav;
		}
		Certificado certificadoDAO = new Certificado(certificado.getTipo(), Utils.convetirFecha(certificado.getFechaRenovacion()), Utils.convetirFecha(certificado.getFechaInspeccion()),
				Utils.convetirFecha(certificado.getFechaSolicitud()), Utils.convetirFecha(certificado.getFechaEntrega()), Utils.convetirFecha(certificado.getFechaVisita()),
				Utils.convetirFecha(certificado.getFechaEmision()), Utils.convetirFecha(certificado.getFechaEmisionEstudio()), Utils.convetirFecha(certificado.getFechaITE()),
				certificado.getEficiencia(), certificado.getCoste());				
		
		if (certificado.getIdCliente()!=null) {
			certificadoDAO.setCliente(certificadoService.obtenerCliente(Long.parseLong(certificado.getIdCliente())));
		}
		if (certificado.getIdArquitecto()!=null) {
			certificadoDAO.setArquitecto(certificadoService.obtenerArquitecto(Long.parseLong(certificado.getIdArquitecto())));
		}
		if (certificado.getIdEstructura()!=null) {
			certificadoDAO.setEstructura(certificadoService.obtenerEstructura(Long.parseLong(certificado.getIdEstructura())));
		}
		
		certificadoService.crear(certificadoDAO);
		
		return new ModelAndView("redirect:/sendForm.htm");
	}
	
	@RequestMapping(value = "/listCertificados.htm")
	public ModelAndView allCertificados(@RequestParam("tipo") String tipoCertificado) {
		List<Cliente> clientes = clienteService.listarTodos();
		List<Arquitecto> arquitectos = arquitectoService.listarTodos();
		List<Estructura> estructuras = estructuraService.listarTodos();
		List<Certificado> certificados = certificadoService.listarTodos();

		ModelAndView mav = new ModelAndView("listCertificados");
		mav.addObject("tipo", tipoCertificado);
		mav.addObject("clientes", clientes);
		mav.addObject("estructuras", estructuras);
		mav.addObject("certificados", certificados);
		mav.addObject("arquitectos", arquitectos);
		return mav;
	}
	
	@RequestMapping(value = "/editCertificado.htm")
	public ModelAndView editCertificado(@RequestParam("id") long idCertificado) {
		List<Arquitecto> arquitectos = arquitectoService.listarTodos();
		Certificado certificado = certificadoService.obtener(idCertificado);
		ModelAndView mav = new ModelAndView("editCertificado");
		mav.addObject("idCertificado", idCertificado);
		mav.addObject("certificado", certificado);
		mav.addObject("arquitectos", arquitectos);
		return mav;
	}

	@RequestMapping(value = "/editCertificado.htm", method = RequestMethod.POST)
	public ModelAndView editCertificado(CertificadoDTO certificado, Errors errors) {
		Certificado certificadoDAO = new Certificado(certificado.getTipo(), Utils.convetirFecha(certificado.getFechaRenovacion()), Utils.convetirFecha(certificado.getFechaInspeccion()),
				Utils.convetirFecha(certificado.getFechaSolicitud()), Utils.convetirFecha(certificado.getFechaEntrega()), Utils.convetirFecha(certificado.getFechaVisita()),
				Utils.convetirFecha(certificado.getFechaEmision()), Utils.convetirFecha(certificado.getFechaEmisionEstudio()), Utils.convetirFecha(certificado.getFechaITE()),
				certificado.getEficiencia(), certificado.getCoste());				
		
		if (certificado.getIdCliente()!=null) {
			certificadoDAO.setCliente(certificadoService.obtenerCliente(Long.parseLong(certificado.getIdCliente())));
		}
		if (certificado.getIdArquitecto()!=null) {
			certificadoDAO.setArquitecto(certificadoService.obtenerArquitecto(Long.parseLong(certificado.getIdArquitecto())));
		}
		if (certificado.getIdEstructura()!=null) {
			certificadoDAO.setEstructura(certificadoService.obtenerEstructura(Long.parseLong(certificado.getIdEstructura())));
		}
		if (certificado.getIdCertificado()!=null) {
			certificadoDAO.setIdCertificado(Long.parseLong(certificado.getIdCertificado()));
		}
		certificadoService.editar(certificadoDAO);
		return new ModelAndView("redirect:/personaeditada.htm");
	}


	
}
