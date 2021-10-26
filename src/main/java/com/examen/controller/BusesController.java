package com.examen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.examen.model.Buses;
import com.examen.repository.IBusesRepository;
import com.examen.repository.IChoferesRepository;
import com.examen.repository.IRutasRepository;

@Controller
public class BusesController {

	@Autowired
	private IBusesRepository repo;
	
	@Autowired
	private IChoferesRepository repC;
	
	@Autowired
	private IRutasRepository repR;
	
	@GetMapping("/cargarPag")
	private String cargarPag(Model model){
		model.addAttribute("bus", new Buses());
		model.addAttribute("lstChoferes", repC.findAll());
		model.addAttribute("lstRutas", repR.findAll());
		return "actualizaMedina";
	}
	
	@GetMapping("/listarPag")
	private String listarPag(Model model){
		model.addAttribute("lstBuses", repo.findAll());
		return "consultaMedina";
	}


	@PostMapping("/grabar")
	public String grabarPag(@ModelAttribute Buses bus, Model model) {
		System.out.println(bus);
		repo.save(bus);
		model.addAttribute("lstChoferes", repC.findAll());
		model.addAttribute("lstRutas", repR.findAll());
		model.addAttribute("lstBuses", repo.findAll());
		return "consultaMedina";
	} 
	
	@PostMapping("/editar")
	public String buscaProd(@ModelAttribute Buses bus, Model model) {
		model.addAttribute("bus", repo.findById(bus.getId()));
		model.addAttribute("lstChoferes", repC.findAll());
		model.addAttribute("lstRutas", repR.findAll());
		return "actualizaMedina";
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
