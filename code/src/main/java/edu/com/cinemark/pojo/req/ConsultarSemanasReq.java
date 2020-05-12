package edu.com.cinemark.pojo.req;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder({"fec_inicial"})
public class ConsultarSemanasReq {

	@Valid
	@NotNull(message = "Ingrese la fecha inicial")
    private String fec_inicial;

	public String getFec_inicial() {
		return fec_inicial;
	}

	public void setFec_inicial(String fec_inicial) {
		this.fec_inicial = fec_inicial;
	}
	
	
}
