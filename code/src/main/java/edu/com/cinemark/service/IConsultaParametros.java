package edu.com.cinemark.service;

import java.util.List;

import edu.com.cinemark.model.Forecast;
import edu.com.cinemark.model.Peliculas;
import edu.com.cinemark.pojo.resp.ConsultarParametrosResp;

public interface IConsultaParametros {

	public ConsultarParametrosResp getParametros();
	
}
