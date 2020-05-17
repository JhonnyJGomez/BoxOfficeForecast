package edu.com.cinemark.pojo.req;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder({"cod_forecast", "num_semana", "id_pelicula"})
public class PeliculaReq {

	private String cod_forecast;
	private String num_semana;
	private String id_pelicula;
	
	public String getCod_forecast() {
		return cod_forecast;
	}
	public void setCod_forecast(String cod_forecast) {
		this.cod_forecast = cod_forecast;
	}
	public String getNum_semana() {
		return num_semana;
	}
	public void setNum_semana(String num_semana) {
		this.num_semana = num_semana;
	}
	public String getId_pelicula() {
		return id_pelicula;
	}
	public void setId_pelicula(String id_pelicula) {
		this.id_pelicula = id_pelicula;
	}
	
	
	
	
}
