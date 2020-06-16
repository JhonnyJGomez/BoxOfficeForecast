package edu.com.cinemark.pojo.req;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder({"parametros","id_pelicula"})
public class ParametrizacionReq {

	private List<ParametrizadosReq> parametros;
	private String id_pelicula;
	
	public List<ParametrizadosReq> getParametros() {
		return parametros;
	}
	public void setParametros(List<ParametrizadosReq> parametros) {
		this.parametros = parametros;
	}
	public String getId_pelicula() {
		return id_pelicula;
	}
	public void setId_pelicula(String id_pelicula) {
		this.id_pelicula = id_pelicula;
	}
	
	
	
}
