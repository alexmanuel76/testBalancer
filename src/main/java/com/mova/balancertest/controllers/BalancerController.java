package com.mova.balancertest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mova.balancertest.model.Balancer;
import com.mova.balancertest.repositories.BalancerRepository;

import java.net.InetAddress;
import java.util.Date;

@Controller
@RequestMapping(path="/balancer")
public class BalancerController {
	@Autowired
	private BalancerRepository balancerRepository;

	@GetMapping(path="/grabar")
	public @ResponseBody String addBalancerCall(){
		Balancer balancer = new Balancer();
		Date fecha = new Date();
		String hostname ="";
		java.sql.Date fechaSQL = new java.sql.Date(fecha.getTime());
		try {
			hostname = InetAddress.getLocalHost().getHostName();
		}
		catch(Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		balancer.setServidor(hostname);
		balancer.setHora(fechaSQL);
		balancer.setComentario("Hola "+fecha.getHours()+":"+fecha.getMinutes()+":"+fecha.getSeconds());
		
		balancerRepository.save(balancer);
		return "saved";
	}
	
	@GetMapping(path="/listar")
	public @ResponseBody Iterable<Balancer> obtenerListado(){
		return balancerRepository.findAll();
	}
}
