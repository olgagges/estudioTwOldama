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
import com.uned.estudioTw.model.Cliente;
import com.uned.estudioTw.model.Estructura;
import com.uned.estudioTw.model.Proyecto;
import com.uned.estudioTw.model.ProyectoDTO;
import com.uned.estudioTw.model.TipoProyecto;
import com.uned.estudioTw.service.ProyectoService;
import com.uned.estudioTw.service.ArquitectoService;
import com.uned.estudioTw.service.ClienteService;

import utils.Utils;

@Controller
public class ProyectoController {

	@Autowired
	ProyectoService proyectoService;
	@Autowired
	ArquitectoService arquitectoService;
	@Autowired
	ClienteService clienteService;

	@RequestMapping(value = "/addProyecto.htm")
	public ModelAndView addClientProject(@RequestParam("id") long idCliente) {
		//List<TipoProyecto> tiposProyecto = proyectoService.obtenerTiposProyecto();
		List<Arquitecto> arquitectos = proyectoService.obtenerArquitectos();
		List<Estructura> estructuras = null;
		// proyectoService.obtenerEstructuras();
		ModelAndView mav = new ModelAndView("addProyecto");
		mav.addObject("idCliente", idCliente);
		//mav.addObject("tiposProyecto", tiposProyecto);
		mav.addObject("arquitectos", arquitectos);
		mav.addObject("estructuras", estructuras);
		return mav;
	}

	@RequestMapping(value = "/editProyecto.htm")
	public ModelAndView editProyecto(@RequestParam("id") long idProyecto) {
		List<Arquitecto> arquitectos = arquitectoService.listarTodos();
		Proyecto proyecto = proyectoService.obtener(idProyecto);
		Cliente cliente = proyecto.getCliente();
		ProyectoDTO proyectoDTO = new ProyectoDTO();
		
		proyectoDTO.setTipo(proyecto.getTipo());
		proyectoDTO.setBanyos(proyecto.getBanyos());
		proyectoDTO.setCoste(proyecto.getCoste());
		proyectoDTO.setDireccion(proyecto.getDireccion());
		proyectoDTO.setDuracionObra(proyecto.getDuracionObra());
		proyectoDTO.setDuracionPresupuesto(proyecto.getDuracionPresupuesto());
		proyectoDTO.setFechaEntrega(Utils.convertirFechaVista(proyecto.getFechaEntrega()));
		proyectoDTO.setFechaFin(Utils.convertirFechaVista(proyecto.getFechaFin()));
		proyectoDTO.setFechaInicio(Utils.convertirFechaVista(proyecto.getFechaInicio()));
		proyectoDTO.setFechaSolicitud(Utils.convertirFechaVista(proyecto.getFechaSolicitud()));
		proyectoDTO.setFinalidadObra(proyecto.getFinalidadObra());
		proyectoDTO.setHabitaciones(proyecto.getHabitaciones());
		proyectoDTO.setIdProyecto(proyecto.getIdProyecto());
		proyectoDTO.setPlantas(proyecto.getPlantas());
		proyectoDTO.setPresupuestoTotal(proyecto.getPresupuestoTotal());
		proyectoDTO.setRef(proyecto.getRef());
		proyectoDTO.setSuperficeEdificio(proyecto.getSuperficeEdificio());
		proyectoDTO.setSuperficeReforma(proyecto.getSuperficeReforma());
		proyectoDTO.setSuperficeTerreno(proyecto.getSuperficeTerreno());
		if (proyecto.getArquitecto()!=null) {
			proyectoDTO.setIdArquitecto(String.valueOf(proyecto.getArquitecto().getIdArquitecto()));
		}
		if (proyecto.getCliente()!=null) {
			proyectoDTO.setIdCliente(String.valueOf(proyecto.getCliente().getIdCliente()));
		}
		/*if (proyecto.getTipoProyecto()!=null) {
			proyectoDTO.setIdTipoProyecto(String.valueOf(proyecto.getTipoProyecto().getIdTipoProyecto()));
		}*/

		ModelAndView mav = new ModelAndView("editProyecto");
		mav.addObject("proyecto", proyectoDTO);
		mav.addObject("cliente", cliente);
		mav.addObject("arquitectos", arquitectos);
		return mav;
	}

	@RequestMapping(value = "/editProyecto.htm", method = RequestMethod.POST)
	public ModelAndView editProyecto(ProyectoDTO proyecto, Errors errors) {
		Proyecto proyectoDAO = new Proyecto(proyecto.getRef(), proyecto.getTipo(), 
				Utils.convetirFecha(proyecto.getFechaSolicitud()), proyecto.getDuracionObra(), proyecto.getPresupuestoTotal(),
				proyecto.getDuracionPresupuesto(), proyecto.getDireccion(), proyecto.getSuperficeTerreno(),
				proyecto.getSuperficeEdificio(), proyecto.getSuperficeReforma(), proyecto.getPlantas(),
				proyecto.getHabitaciones(), proyecto.getBanyos(), proyecto.getCoste(), proyecto.getFinalidadObra());

		if (proyecto.getFechaEntrega().equals("dd/mm/aaaa")) {
			proyectoDAO
					.setFechaEntrega(null);
		}
		else {
			proyectoDAO
			.setFechaEntrega(Utils.convetirFecha(proyecto.getFechaEntrega()));
		}
		if (proyecto.getFechaFin().equals("dd/mm/aaaa")) {
			proyectoDAO
					.setFechaFin(null);
		}
		else {
			proyectoDAO
			.setFechaFin(Utils.convetirFecha(proyecto.getFechaFin()));
		}
		
		if (proyecto.getFechaInicio().equals("dd/mm/aaaa")) {
			proyectoDAO
					.setFechaInicio(null);
		}
		else {
			proyectoDAO
			.setFechaInicio(Utils.convetirFecha(proyecto.getFechaInicio()));
		}
		
		if (proyecto.getIdCliente() != null) {
			proyectoDAO.setCliente(proyectoService.obtenerCliente(Long.parseLong(proyecto.getIdCliente())));
		}
		if (proyecto.getIdArquitecto() != null) {
			proyectoDAO.setArquitecto(proyectoService.obtenerArquitecto(Long.parseLong(proyecto.getIdArquitecto())));
		}
		
		proyectoDAO.setIdProyecto(proyecto.getIdProyecto());

		proyectoService.crear(proyectoDAO);
		return new ModelAndView("redirect:/clientsArea.htm");
	}

	@RequestMapping(value = "/addProyecto.htm", method = RequestMethod.POST)
	public ModelAndView addProyecto(ProyectoDTO proyecto, Errors errors) {
		if (errors.hasErrors()) {
			ModelAndView mav = new ModelAndView("addProyecto");
			mav.addObject("errors", errors);
			return mav;
		}

		Proyecto proyectoDAO = new Proyecto(proyecto.getRef(), proyecto.getTipo(), Utils.convetirFecha(proyecto.getFechaInicio()),
				Utils.convetirFecha(proyecto.getFechaSolicitud()), Utils.convetirFecha(proyecto.getFechaEntrega()),
				Utils.convetirFecha(proyecto.getFechaFin()), proyecto.getDuracionObra(), proyecto.getPresupuestoTotal(),
				proyecto.getDuracionPresupuesto(), proyecto.getDireccion(), proyecto.getSuperficeTerreno(),
				proyecto.getSuperficeEdificio(), proyecto.getSuperficeReforma(), proyecto.getPlantas(),
				proyecto.getHabitaciones(), proyecto.getBanyos(), proyecto.getCoste(), proyecto.getFinalidadObra());

		if (proyecto.getIdCliente() != null) {
			proyectoDAO.setCliente(proyectoService.obtenerCliente(Long.parseLong(proyecto.getIdCliente())));
		}
		if (proyecto.getIdArquitecto() != null) {
			proyectoDAO.setArquitecto(proyectoService.obtenerArquitecto(Long.parseLong(proyecto.getIdArquitecto())));
		}
		/*if (proyecto.getIdTipoProyecto() != null) {
			proyectoDAO
					.setTipoProyecto(proyectoService.obtenerTipoProyecto(Long.parseLong(proyecto.getIdTipoProyecto())));
		}*/
		proyectoService.editar(proyectoDAO);
		return new ModelAndView("redirect:/sendForm.htm");
	}

	@RequestMapping(value = "/listProyectos.htm")
	public ModelAndView allProyectos(){//@RequestParam("idCliente") String idCliente) {
		List<Proyecto> proyectos = proyectoService.listarTodos();
		List<Arquitecto> arquitectos = arquitectoService.listarTodos();
		List<Cliente> clientes = clienteService.listarTodos();
		ModelAndView mav = new ModelAndView("listProyectos");
		mav.addObject("proyectos", proyectos);
		mav.addObject("arquitectos", arquitectos);
		mav.addObject("clientes", clientes);
		return mav;
	}
}
