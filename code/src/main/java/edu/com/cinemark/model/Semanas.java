package edu.com.cinemark.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "semanas")
public class Semanas {

	@Id
    @Column(name = "id")
    private Integer id;
	@Column(name = "cod_semana")
    private String cod_semana;
	@Column(name = "num_semana")
    private Integer num_semana;
	@Column(name = "fec_inicial")
    private Date fec_inicial;
	@Column(name = "fec_final")
    private Date fec_final;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCod_semana() {
		return cod_semana;
	}
	public void setCod_semana(String cod_semana) {
		this.cod_semana = cod_semana;
	}
	public Integer getNum_semana() {
		return num_semana;
	}
	public void setNum_semana(Integer num_semana) {
		this.num_semana = num_semana;
	}
	public Date getFec_inicial() {
		return fec_inicial;
	}
	public void setFec_inicial(Date fec_inicial) {
		this.fec_inicial = fec_inicial;
	}
	public Date getFec_final() {
		return fec_final;
	}
	public void setFec_final(Date fec_final) {
		this.fec_final = fec_final;
	}
	
	
	
}
