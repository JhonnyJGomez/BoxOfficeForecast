package edu.com.cinemark.pojo.resp;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description = "Objeto que hace referencia a la respuesta del api, devolverá el número de semana")
@Data
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"parametros"})
public class ConsultarParametrosResp {

	private List<ParametrosResp> parametros;

	public List<ParametrosResp> getParametros() {
		return parametros;
	}

	public void setParametros(List<ParametrosResp> parametros) {
		this.parametros = parametros;
	}
	
	
	
}
