package com.jersey.ws.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jersey.ws.rest.vo.VOUsuario;

@Path("/JavaRevolutions")
public class ServiceLoginJR {
	
	@POST
	@Path("/validaUsuario")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOUsuario validaUsuario(VOUsuario vo) {
		vo.setUsuarioValido(false);
		if(vo.getUsuario().equals("Java") && vo.getPassword().equals("Revolutions")) {
			vo.setUsuarioValido(true);
		}
		vo.setPassword("####");
		return vo;
	}

}
