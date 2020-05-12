package edu.com.cinemark.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "forecasts")
public class Forecast {

	@Id
    @Column(name = "id")
    private Integer id;
	@Column(name = "cod_forecast")
    private String cod_forecast;
	@Column(name = "num_semana")
    private Integer num_semana;
	@Column(name = "estimacion_asistencia")
    private Integer estimacion_asistencia;
	@Column(name = "id_pelicula")
    private Integer id_pelicula;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCod_forecast() {
		return cod_forecast;
	}
	public void setCod_forecast(String cod_forecast) {
		this.cod_forecast = cod_forecast;
	}
	public Integer getNum_semana() {
		return num_semana;
	}
	public void setNum_semana(Integer num_semana) {
		this.num_semana = num_semana;
	}
	public Integer getEstimacion_asistencia() {
		return estimacion_asistencia;
	}
	public void setEstimacion_asistencia(Integer estimacion_asistencia) {
		this.estimacion_asistencia = estimacion_asistencia;
	}
	public Integer getId_pelicula() {
		return id_pelicula;
	}
	public void setId_pelicula(Integer id_pelicula) {
		this.id_pelicula = id_pelicula;
	}
	
	
	
	
}
