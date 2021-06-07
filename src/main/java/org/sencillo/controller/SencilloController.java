package org.sencillo.controller;

import org.sencillo.model.Cliente;
import org.sencillo.model.Producto;
import org.sencillo.model.Usuario;
import org.sencillo.repository.IClienteRepository;
import org.sencillo.repository.IProductoRepository;
import org.sencillo.repository.IUsuarioRepository;
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
		return "index";
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
	
	@Autowired
	private IClienteRepository repoC;
	
	@Autowired
	private IUsuarioRepository repoU;
	
	@GetMapping("/registro")
	public String cargarProd(Model model) {
		model.addAttribute("producto", new Producto());
		model.addAttribute("usuario", new Usuario());
		return "login";
	}
	
	@PostMapping("/grabar")
	public String guardarProd(@ModelAttribute Cliente cliente, Usuario usuario) {
		//guardar el producto
		System.out.println(cliente);
		System.out.println(usuario);
		repoC.save(cliente);
		repoU.save(usuario);
		return "login";
	}
	
}
