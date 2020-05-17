package edu.com.cinemark.service;

import java.util.List;

import edu.com.cinemark.model.Forecast;
import edu.com.cinemark.model.Peliculas;
import edu.com.cinemark.pojo.req.PeliculaReq;
import edu.com.cinemark.pojo.resp.ConsultarCiudadesResp;
import edu.com.cinemark.pojo.resp.ConsultarPeliculasPorSemanaResp;

public interface IActualizarForecast {

	public void actualizarForecast(List<PeliculaReq> listPeliculas, String id_ciudad);
	
}
