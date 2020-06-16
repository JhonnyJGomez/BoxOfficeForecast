package edu.com.cinemark.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "peliculas_parametros")
public class PeliculasParametros {

	@Id
	@Column(name = "id")
    private Integer id;
	@Column(name = "id_pelicula")
    private Integer id_pelicula;
    @Column(name = "id_parametro")
    private Integer id_parametro;
	@Column(name = "value")
    private String value;	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_pelicula() {
		return id_pelicula;
	}
	public void setId_pelicula(Integer id_pelicula) {
		this.id_pelicula = id_pelicula;
	}
	public Integer getId_parametro() {
		return id_parametro;
	}
	public void setId_parametro(Integer id_parametro) {
		this.id_parametro = id_parametro;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	
	
	
	
}
