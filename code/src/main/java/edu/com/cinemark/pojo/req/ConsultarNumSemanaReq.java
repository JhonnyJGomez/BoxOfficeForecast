package edu.com.cinemark.pojo.req;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder({"num_semana"})
public class ConsultarNumSemanaReq {

	private String num_semana;

	public String getNum_semana() {
		return num_semana;
	}

	public void setNum_semana(String num_semana) {
		this.num_semana = num_semana;
	}
	
}
