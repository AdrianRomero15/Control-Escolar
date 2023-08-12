package com.controlescolar.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.controlescolar.grupos.service.IGrupoService;
import com.controlescolar.modelo.CarrerasEntidad;
import com.controlescolar.modelo.GruposEntidad;

import jakarta.validation.Valid;

@Controller
public class GruposControlador {
	
	@Autowired
	private IGrupoService grupoService;
	@GetMapping(value = "registrodegrupos")
	public String insertadatosCarrera(Model model) {
		CarrerasEntidad formulario = (CarrerasEntidad) model.getAttribute("objetosistema");
		grupoService.insertaGrupos(new GruposEntidad());
		
		if (formulario == null) {
			formulario=new CarrerasEntidad();
		}
	
		model.addAttribute("controlador", formulario);
		
		return "grupos/registrodegrupos";
	}
	@PostMapping(value = "insertagrupos")
	public String registradatosCarreras(@Valid @ModelAttribute("controlador") CarrerasEntidad datos,BindingResult resul, RedirectAttributes flash) {
		if (resul.hasErrors()) {
			
		return "registro";
		}
		//repositorio.save(datos);
		

		return "redirect:/registrodecarreras";

	}
}
