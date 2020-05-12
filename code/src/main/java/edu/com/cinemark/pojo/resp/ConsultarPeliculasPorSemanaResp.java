package edu.com.cinemark.pojo.resp;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description = "Objeto que hace referencia a la respuesta del api, devolverá el número de semana")
@Data
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"peliculas"})
public class ConsultarPeliculasPorSemanaResp {

	@Valid
    @NotNull
	private List<PeliculaResp> peliculas;

	
	public List<PeliculaResp> getPeliculas() {
		if (peliculas == null) {
			peliculas = new ArrayList<>();
		}
		return peliculas;
	}
	
}
