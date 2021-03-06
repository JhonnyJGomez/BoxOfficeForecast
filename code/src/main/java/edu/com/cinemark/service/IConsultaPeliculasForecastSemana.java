package edu.com.cinemark.service;

import java.util.List;

import edu.com.cinemark.model.Forecast;
import edu.com.cinemark.model.Peliculas;
import edu.com.cinemark.pojo.req.ConsultarNumSemanaReq;
import edu.com.cinemark.pojo.resp.ConsultarPeliculasPorSemanaResp;

public interface IConsultaPeliculasForecastSemana {

	//List<Forecast> getListForecatsPorNumSemana(String num_semana);
	
	List<Peliculas> listarPeliculas(ConsultarNumSemanaReq request);
	
}
