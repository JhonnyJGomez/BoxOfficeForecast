package edu.com.cinemark.pojo.resp;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import edu.com.cinemark.model.Ciudades;

import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description = "Objeto que hace referencia a la respuesta del api, devolverá el número de semana")
@Data
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"ciudades"})
public class ConsultarCiudadesResp {

	private List<CiudadesResp> ciudades;

	public List<CiudadesResp> getCiudades() {
		return ciudades;
	}

	public void setCiudades(List<CiudadesResp> ciudades) {
		this.ciudades = ciudades;
	}	
	
	
	
}
