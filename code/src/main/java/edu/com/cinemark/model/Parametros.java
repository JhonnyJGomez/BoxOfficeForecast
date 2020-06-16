package edu.com.cinemark.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "parametros")
public class Parametros {

	@Id
    @Column(name = "id")
    private Integer id;
	@Column(name = "cod_parametro")
    private String cod_parametro;
	@Column(name = "nom_parametro")
    private String nom_parametro;
	@Column(name = "type")
    private String type;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCod_parametro() {
		return cod_parametro;
	}
	public void setCod_parametro(String cod_parametro) {
		this.cod_parametro = cod_parametro;
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
