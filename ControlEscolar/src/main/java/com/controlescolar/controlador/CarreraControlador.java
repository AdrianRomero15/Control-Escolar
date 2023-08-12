package com.controlescolar.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.controlescolar.modelo.AlumnosEntidad;
import com.controlescolar.modelo.CarrerasEntidad;
import com.controlescolar.repositorio.AlumnosRepositoio;
import com.controlescolar.repositorio.CarrerasRepositorio;

import jakarta.validation.Valid;

@Controller
public class CarreraControlador {
	@Autowired
	private CarrerasRepositorio repositorio;
	
	@GetMapping(value = "registrodecarreras")
	public String insertadatosCarrera(Model model) {
		CarrerasEntidad formulario = (CarrerasEntidad) model.getAttribute("objetosistema");
		
		if (formulario == null) {
			formulario=new CarrerasEntidad();
		}
	
		model.addAttribute("controlador", formulario);
		
		return "carreras/carrera";
	}
	@PostMapping(value = "registrarcarreras")
	public String registradatosCarreras(@Valid @ModelAttribute("controlador") CarrerasEntidad datos,BindingResult resul, RedirectAttributes flash) {
		if (resul.hasErrors()) {
			
		return "registro";
		}
		repositorio.save(datos);
		

		return "redirect:/registrodecarreras";

	}
}
