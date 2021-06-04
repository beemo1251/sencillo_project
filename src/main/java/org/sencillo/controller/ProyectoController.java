package org.sencillo.controller;

import org.sencillo.model.Producto;
import org.sencillo.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProyectoController {
	
	@Autowired
	private IProductoRepository repo;
	
	/*@PostMapping("/grabar")
	public String guardarPeli(@ModelAttribute Pelicula pelicula, RedirectAttributes redirectAttrs) {
		System.out.println(pelicula);
		try {
			repo.save(pelicula);
			redirectAttrs
        	.addFlashAttribute("mensaje", "Actualizado correctamente")
        	.addFlashAttribute("clase", "success");
		} catch (Exception e) {
			redirectAttrs
        	.addFlashAttribute("error", "Ocurrio un error")
        	.addFlashAttribute("clase", "danger");
		}
		return "redirect:/listado";
	}*/
	
	@GetMapping("/index")
	public String listarProd(@ModelAttribute Producto producto, Model model) {
		model.addAttribute("lstProducto", repo.findAll());
		System.out.println(repo.findAll());
		return "index";
	}
	
	/*@GetMapping("/index")
	public String listarProd(Model model) {
		System.out.println("index");
		return "index";
	}*/
	
	@GetMapping("/login")
	public String login(Model model) {
		System.out.println("login");
		return "login";
	}
	
	@GetMapping("/carrito")
	public String carrito(Model model) {
		System.out.println("carrito");
		return "carrito";
	}
	
	@GetMapping("/detail")
	public String detail(Model model) {
		System.out.println("detail");
		return "detail";
	}
}
