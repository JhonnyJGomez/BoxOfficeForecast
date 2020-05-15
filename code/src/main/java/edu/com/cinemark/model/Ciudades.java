package edu.com.cinemark.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "ciudades")
public class Ciudades {

	@Id
    @Column(name = "id")
    private Integer id;
	@Column(name = "cod_ciudad")
    private String cod_ciudad;
	@Column(name = "nom_ciudad")
    private String nom_ciudad;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCod_ciudad() {
		return cod_ciudad;
	}
	public void setCod_ciudad(String cod_ciudad) {
		this.cod_ciudad = cod_ciudad;
	}
	public String getNom_ciudad() {
		return nom_ciudad;
	}
	public void setNom_ciudad(String nom_ciudad) {
		this.nom_ciudad = nom_ciudad;
	}
	
	
	
}
