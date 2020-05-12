package edu.com.cinemark.pojo.resp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description = "Objeto que hace referencia a la respuesta del api, devolverá el número de semana")
@Data
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"cod_pelicula","titulo"})
public class PeliculaResp {

	
    private String cod_pelicula;
    private String titulo;
    
	public String getCod_pelicula() {
		return cod_pelicula;
	}
	public void setCod_pelicula(String cod_pelicula) {
		this.cod_pelicula = cod_pelicula;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}	
	
}
