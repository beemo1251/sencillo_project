package org.sencillo.controller;

import org.sencillo.model.Producto;
import org.sencillo.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SencilloController {
	
	@Autowired
	private IProductoRepository repo;
	
	@GetMapping("/index")
	public String listarProd(@ModelAttribute Producto producto, Model model) {
		model.addAttribute("lstProducto", repo.findAll());
		//System.out.println(repo.findAll());
		return "index";
	}
	
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
	public String detail(@ModelAttribute Producto p, Model model) {
		model.addAttribute("codProducto", repo.findById(p.getCodProducto()));
		model.addAttribute("lstProducto", repo.findAll());
		return "detail";
	}

	
	
}
