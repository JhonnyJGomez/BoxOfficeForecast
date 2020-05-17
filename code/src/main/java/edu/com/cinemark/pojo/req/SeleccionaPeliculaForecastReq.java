package edu.com.cinemark.pojo.req;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder({"peliculas","id_ciudad"})
public class SeleccionaPeliculaForecastReq {

	private List<PeliculaReq> peliculas;
	private String id_ciudad;
	
	public List<PeliculaReq> getPeliculas() {
		return peliculas;
	}
	public void setPeliculas(List<PeliculaReq> peliculas) {
		this.peliculas = peliculas;
	}
	public String getId_ciudad() {
		return id_ciudad;
	}
	public void setId_ciudad(String id_ciudad) {
		this.id_ciudad = id_ciudad;
	}
	
}
