package edu.com.cinemark.pojo.resp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description = "Objeto que hace referencia a la respuesta del api, devolverá el número de semana")
@Data
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"numSemana"})
public class ConsultarSemanasResp {

	private String numSemana;

	public String getNumSemana() {
		return numSemana;
	}

	public void setNumSemana(String numSemana) {
		this.numSemana = numSemana;
	}
	
	
}
