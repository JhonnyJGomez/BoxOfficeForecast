package edu.com.cinemark.pojo.req;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder({"parametrizacion"})
public class PeliculasParametrosReq {

	private List<ParametrizacionReq> parametrizacion;

	public List<ParametrizacionReq> getParametrizacion() {
		return parametrizacion;
	}

	public void setParametrizacion(List<ParametrizacionReq> parametrizacion) {
		this.parametrizacion = parametrizacion;
	}
	
	
	
}
