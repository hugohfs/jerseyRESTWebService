package com.jersey.ws.rest.vo;

public class VOUsuario {
	private String usuario;
	private String password;
	private boolean usuarioValido;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isUsuarioValido() {
		return usuarioValido;
	}
	public void setUsuarioValido(boolean usuarioValido) {
		this.usuarioValido = usuarioValido;
	}
	
	

}
