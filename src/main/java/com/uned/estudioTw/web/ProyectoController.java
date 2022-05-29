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
import com.uned.estudioTw.model.Cliente;
import com.uned.estudioTw.model.Estructura;
import com.uned.estudioTw.model.Proyecto;
import com.uned.estudioTw.model.ProyectoDTO;
import com.uned.estudioTw.model.TipoProyecto;
import com.uned.estudioTw.service.ProyectoService;

import utils.Utils;

@Controller
public class ProyectoController {

	@Autowired
	ProyectoService proyectoService;
	
	@RequestMapping(value = "/addProyecto.htm")
	public ModelAndView addClientProject(@RequestParam("id") long idCliente) {
		List<TipoProyecto> tiposProyecto = proyectoService.obtenerTiposProyecto();
		List<Arquitecto> arquitectos = proyectoService.obtenerArquitectos();
		List<Estructura> estructuras = null;
		//proyectoService.obtenerEstructuras();
		ModelAndView mav = new ModelAndView("addProyecto");
		mav.addObject("idCliente", idCliente);
		mav.addObject("tiposProyecto", tiposProyecto);
		mav.addObject("arquitectos", arquitectos);
		mav.addObject("estructuras", estructuras);
		return mav;
	}

	@RequestMapping(value = "/addProyecto.htm", method = RequestMethod.POST)
	public ModelAndView addProyecto(ProyectoDTO proyecto, Errors errors) {
		if (errors.hasErrors()) {
			ModelAndView mav = new ModelAndView("addProyecto");
			mav.addObject("errors", errors);
			return mav;
		}
		
		
		Proyecto proyectoDAO = new Proyecto(proyecto.getRef(), Utils.convetirFecha(proyecto.getFechaInicio()), Utils.convetirFecha(proyecto.getFechaSolicitud()),
				Utils.convetirFecha(proyecto.getFechaEntrega()), Utils.convetirFecha(proyecto.getFechaFin()), proyecto.getDuracionObra(),
				proyecto.getPresupuestoTotal(), proyecto.getDuracionPresupuesto(), proyecto.getDireccion(),
				proyecto.getSuperficeTerreno(), proyecto.getSuperficeEdificio(), proyecto.getSuperficeReforma(),
				proyecto.getPlantas(), proyecto.getHabitaciones(), proyecto.getBanyos(), proyecto.getCoste(),
				proyecto.getFinalidadObra());
		
		if (proyecto.getIdCliente()!=null) {
			proyectoDAO.setCliente(proyectoService.obtenerCliente(Long.parseLong(proyecto.getIdCliente())));
		}
		if (proyecto.getIdArquitecto()!=null) {
			proyectoDAO.setArquitecto(proyectoService.obtenerArquitecto(Long.parseLong(proyecto.getIdArquitecto())));
		}
		if (proyecto.getIdTipoProyecto()!=null) {
			proyectoDAO.setTipoProyecto(proyectoService.obtenerTipoProyecto(Long.parseLong(proyecto.getIdTipoProyecto())));
		}
		proyectoService.crear(proyectoDAO);
		return new ModelAndView("redirect:/clientsArea.htm");
	}
	
	@RequestMapping(value = "/listProyectos.htm")
	public ModelAndView allProyectos(@RequestParam("idCliente") String idCliente) {
		List<Proyecto> proyectos = proyectoService.listarTodos();

		ModelAndView mav = new ModelAndView("listProyectos");
		mav.addObject("proyectos", proyectos);
		return mav;
	}
}
