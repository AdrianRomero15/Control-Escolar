package com.controlescolar.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.controlescolar.modelo.AlumnosEntidad;
import com.controlescolar.repositorio.AlumnosRepositoio;

import jakarta.validation.Valid;

@Controller
public class AlumnosControlador {
	@Autowired
	private AlumnosRepositoio repositorio;
	private AlumnosEntidad siste;

	@GetMapping(value = "index")
	public String controlador(Model modelo) {

		return "index";
	}

	@GetMapping(value = "registrodeestudiantes")
	public String insertadatosAlumnos(Model model) {
		AlumnosEntidad formulario = (AlumnosEntidad) model.getAttribute("objetosistema");
		//System.out.println(formulario.toString());
		if (formulario == null) {
			formulario=new AlumnosEntidad();
		}
		/*
		 * model.addAttribute("controlador", formulario); model.addAttribute("success",
		 * "mensaje de exito"); model.addAttribute("error", "mensaje de error");
		 * model.addAttribute("warning", "mensaje de alerta");
		 * model.addAttribute("info", "mensaje de info");
		 */
		model.addAttribute("controlador", formulario);
		//flash.addFlashAttribute("success", "registro exitoso");
		return "registro";
	}

	@PostMapping(value = "registrar")
	public String registradatosAlumnos(@Valid @ModelAttribute("controlador") AlumnosEntidad datos,BindingResult resul, RedirectAttributes flash) {
		if (resul.hasErrors()) {
			
		return "registro";
		}
		repositorio.save(datos);
		

		return "redirect:/registrodeestudiantes";

	}

	@GetMapping(value = "listadeestudiantes")
	public String consultadatosAlumnos(Model modelo) {
		List<AlumnosEntidad> resultado = (List<AlumnosEntidad>) repositorio.findAll();
		modelo.addAttribute("listadatos", resultado);

		return "consulta";
	}

	@GetMapping(value = "/editaralumno/{id}")
	public String buscaridAlumnos(@PathVariable(name = "id") int id, RedirectAttributes flash) {
System.out.println(id);
		Optional<AlumnosEntidad> objeto =repositorio.findById(id);
		//modelo.addAttribute("controlador", repositorio);
		flash.addFlashAttribute("objetosistema", objeto.get());
		/*
		 * siste.setId(id); siste.setNombre("nombre"); siste.setPrimerapp("primer");
		 * siste.setSegundoapp("segus"); siste.setNumero("num");
		 */
		return "redirect:/registrodeestudiantes";
	}
	@GetMapping(value = "/borrar/{id}")
	public String borrarAlumnos(@PathVariable(name = "id") int id, RedirectAttributes flash) {
System.out.println(id);
		
		//modelo.addAttribute("controlador", repositorio);
		repositorio.deleteById(id);
		flash.addFlashAttribute("info","el registro se borro exitosamente");
		/*
		 * siste.setId(id); siste.setNombre("nombre"); siste.setPrimerapp("primer");
		 * siste.setSegundoapp("segus"); siste.setNumero("num");
		 */
		return "redirect:/listadeestudiantes";
	}
}