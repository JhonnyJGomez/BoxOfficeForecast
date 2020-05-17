package edu.com.cinemark.pojo.resp;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description = "Objeto que hace referencia a la respuesta del api, devolverá el número de semana")
@Data
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"id_ciudad","nom_ciudad"})
public class CiudadesResp {

	private String id_ciudad;
	private String nom_ciudad;
		
	public String getId_ciudad() {
		return id_ciudad;
	}
	public void setId_ciudad(String id_ciudad) {
		this.id_ciudad = id_ciudad;
	}
	public String getNom_ciudad() {
		return nom_ciudad;
	}
	public void setNom_ciudad(String nom_ciudad) {
		this.nom_ciudad = nom_ciudad;
	}
	
	
	
}
