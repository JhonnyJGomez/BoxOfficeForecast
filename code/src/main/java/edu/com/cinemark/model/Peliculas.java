package edu.com.cinemark.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "peliculas")
public class Peliculas {

	@Id
    @Column(name = "id")
    private Integer id;
	@Column(name = "cod_pelicula")
    private String cod_pelicula;
	@Column(name = "titulo")
    private String titulo;
	@Column(name = "descripcion")
    private String descripcion;
	@Column(name = "formato")
    private String formato;
	@Column(name = "idioma")
    private String idioma;
	@Column(name = "id_fec_estreno")
    private Integer id_fec_estreno;
	@Column(name = "id_genero")
    private Integer id_genero;
	@Column(name = "id_rating")
    private Integer id_rating;
	@Column(name = "id_distributor")
    private Integer id_distributor;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCod_pelicula() {
		return cod_pelicula;
	}
	public void setCod_pelicula(String cod_pelicula) {
		this.cod_pelicula = cod_pelicula;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public Integer getId_fec_estreno() {
		return id_fec_estreno;
	}
	public void setId_fec_estreno(Integer id_fec_estreno) {
		this.id_fec_estreno = id_fec_estreno;
	}
	public Integer getId_genero() {
		return id_genero;
	}
	public void setId_genero(Integer id_genero) {
		this.id_genero = id_genero;
	}
	public Integer getId_rating() {
		return id_rating;
	}
	public void setId_rating(Integer id_rating) {
		this.id_rating = id_rating;
	}
	public Integer getId_distributor() {
		return id_distributor;
	}
	public void setId_distributor(Integer id_distributor) {
		this.id_distributor = id_distributor;
	}
	
}
