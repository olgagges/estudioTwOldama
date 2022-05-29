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

	private static final String RENOVAR_CERTIFICADO = "C";
	private static final String INSPECCION_TECNICA = "I";

	@RequestMapping(value = "/certificadoArea.htm")
	public ModelAndView certificadoArea(@RequestParam("id") long idCliente) {
		List<Estructura> estructuras = estructuraService.listarTodos();
		ModelAndView mav = new ModelAndView("certificadoArea");
		mav.addObject("estructuras", estructuras);
		mav.addObject("idCliente", idCliente);
		return mav;
	}


	@RequestMapping(value = "/addCertificado.htm")
	public ModelAndView addCertificado(@RequestParam("id") long idCliente, @RequestParam("idestr") long idEstructura) {
		Cliente cliente = clienteService.obtener(idCliente);
		Estructura estructura = estructuraService.obtener(idEstructura);
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
		Certificado certificadoDAO = new Certificado(certificado.getTipo(),
				Utils.convetirFecha(certificado.getFechaSolicitud()),
				Utils.convetirFecha(certificado.getFechaEntrega()), Utils.convetirFecha(certificado.getFechaVisita()),
				Utils.convetirFecha(certificado.getFechaEmision()), certificado.getEficiencia(), certificado.getCoste());

		if (certificado.getIdCliente() != null) {
			certificadoDAO.setCliente(certificadoService.obtenerCliente(Long.parseLong(certificado.getIdCliente())));
		}
		if (certificado.getIdArquitecto() != null) {
			certificadoDAO
					.setArquitecto(certificadoService.obtenerArquitecto(Long.parseLong(certificado.getIdArquitecto())));
		}
		if (certificado.getIdEstructura() != null) {
			certificadoDAO
					.setEstructura(certificadoService.obtenerEstructura(Long.parseLong(certificado.getIdEstructura())));
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

	@RequestMapping(value = "/listCertificadosClientes.htm")
	public ModelAndView allCertificadosCaducados(@RequestParam("opt") String opt) {
		List<Certificado> certificados = null;
		if (opt.equals(RENOVAR_CERTIFICADO)) {
			certificados = certificadoService.listarCertificadosRenovacion();
		}
		else if (opt.equals(INSPECCION_TECNICA)) {
			certificados = certificadoService.listarInspeccionTecnica();
		}
		else certificados = certificadoService.listarTodos();
		ModelAndView mav = new ModelAndView("listCertificadosClientes");
		mav.addObject("certificados", certificados);
		return mav;
	}

	@RequestMapping(value = "/editCertificado.htm")
	public ModelAndView editCertificado(@RequestParam("id") long idCertificado) {
		List<Arquitecto> arquitectos = arquitectoService.listarTodos();
		
		Certificado certificado = certificadoService.obtener(idCertificado);
		Estructura estructura = certificado.getEstructura();
		Cliente cliente = certificado.getCliente();
		
		CertificadoDTO certificadoDTO = new CertificadoDTO();
		
		certificadoDTO.setIdCertificado(certificado.getIdCertificado());
		
		certificadoDTO.setTipo(certificado.getTipo());
		certificadoDTO.setCoste(certificado.getCoste());
		certificadoDTO.setEficiencia(certificado.getEficiencia());
		certificadoDTO.setFechaSolicitud(Utils.convertirFechaVista(certificado.getFechaSolicitud()));
		
		if (certificadoDTO.getFechaEntrega() != null) {
			certificadoDTO
					.setFechaEntrega(Utils.convertirFechaVista(certificado.getFechaEntrega()));
		}
		
		if (certificadoDTO.getFechaVisita() != null) {
			certificadoDTO
					.setFechaVisita(Utils.convertirFechaVista(certificado.getFechaVisita()));
		}
		
		if (certificadoDTO.getFechaEmision() != null) {
			certificadoDTO
					.setFechaEmision(Utils.convertirFechaVista(certificado.getFechaEmision()));
		}
		
		if (certificadoDTO.getIdArquitecto() != null) {
			certificadoDTO
					.setIdArquitecto(String.valueOf(certificado.getArquitecto().getIdArquitecto()));
		}
		if (certificadoDTO.getIdEstructura() != null) {
			certificadoDTO
					.setIdEstructura(String.valueOf(certificado.getEstructura().getIdEstructura()));
		}
		if (certificadoDTO.getIdCliente() != null) {
			certificadoDTO
					.setIdCliente(String.valueOf(certificado.getCliente().getIdCliente()));
		}
		
		
		ModelAndView mav = new ModelAndView("editCertificado");
		mav.addObject("certificado", certificadoDTO);
		mav.addObject("arquitectos", arquitectos);
		mav.addObject("cliente", cliente);
		mav.addObject("estructura", estructura);
		return mav;
	}

	@RequestMapping(value = "/editCertificado.htm", method = RequestMethod.POST)
	public ModelAndView editCertificado(CertificadoDTO certificado, Errors errors) {
		Certificado certificadoDAO = new Certificado(certificado.getTipo(),
				Utils.convetirFecha(certificado.getFechaSolicitud()),
				Utils.convetirFecha(certificado.getFechaEntrega()), Utils.convetirFecha(certificado.getFechaVisita()),
				Utils.convetirFecha(certificado.getFechaEmision()), certificado.getEficiencia(), certificado.getCoste());

		if (certificado.getIdCliente() != null) {
			certificadoDAO.setCliente(certificadoService.obtenerCliente(Long.parseLong(certificado.getIdCliente())));
		}
		if (certificado.getIdArquitecto() != null) {
			certificadoDAO
					.setArquitecto(certificadoService.obtenerArquitecto(Long.parseLong(certificado.getIdArquitecto())));
		}
		if (certificado.getIdEstructura() != null) {
			certificadoDAO
					.setEstructura(certificadoService.obtenerEstructura(Long.parseLong(certificado.getIdEstructura())));
		}
		
			certificadoDAO.setIdCertificado(certificado.getIdCertificado());
			
		
	
		certificadoService.editar(certificadoDAO);
		
		return new ModelAndView("redirect:/personaeditada.htm");
	}

}
