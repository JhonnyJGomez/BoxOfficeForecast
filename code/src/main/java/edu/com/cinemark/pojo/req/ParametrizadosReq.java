package edu.com.cinemark.pojo.req;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder({"id_parametro","value"})
public class ParametrizadosReq {

	private String id_parametro;
	private String value;
	
	public String getId_parametro() {
		return id_parametro;
	}
	public void setId_parametro(String id_parametro) {
		this.id_parametro = id_parametro;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	
}
