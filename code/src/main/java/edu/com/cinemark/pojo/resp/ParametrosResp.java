package edu.com.cinemark.pojo.resp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description = "Objeto que hace referencia a la respuesta del api, devolverá el número de semana")
@Data
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"id_parametro","nom_parametro","type"})
public class ParametrosResp {

	private String id_parametro;
	private String nom_parametro;
	private String type;
		
	
	public String getId_parametro() {
		return id_parametro;
	}
	public void setId_parametro(String id_parametro) {
		this.id_parametro = id_parametro;
	}
	public String getNom_parametro() {
		return nom_parametro;
	}
	public void setNom_parametro(String nom_parametro) {
		this.nom_parametro = nom_parametro;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}
