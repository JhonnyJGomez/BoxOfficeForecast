package edu.com.cinemark.service;

import java.util.List;

import edu.com.cinemark.model.Forecast;
import edu.com.cinemark.model.Peliculas;
import edu.com.cinemark.pojo.resp.ConsultarPeliculasPorSemanaResp;

public interface IConsultaPeliculasPorSemana {

	//List<Forecast> getListForecatsPorNumSemana(String num_semana);
	
	List<Peliculas> listarPeliculas(Integer id_fec_estreno);
	
}
