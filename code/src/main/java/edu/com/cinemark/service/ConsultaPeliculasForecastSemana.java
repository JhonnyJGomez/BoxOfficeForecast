package edu.com.cinemark.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.com.cinemark.model.Forecast;
import edu.com.cinemark.model.Peliculas;
import edu.com.cinemark.pojo.req.ConsultarNumSemanaReq;
import edu.com.cinemark.pojo.resp.ConsultarPeliculasPorSemanaResp;
import edu.com.cinemark.pojo.resp.PeliculaResp;
import edu.com.cinemark.repository.ForecastRepository;
import edu.com.cinemark.repository.PeliculasRepository;


@Service
public class ConsultaPeliculasForecastSemana implements IConsultaPeliculasForecastSemana{
	
	@Autowired
	private ForecastRepository forecastRepo;
	
	@Autowired
	private PeliculasRepository peliculasRepo;

    public List<Peliculas> listarPeliculas(ConsultarNumSemanaReq request) {
		
		List<Forecast> listForecast = forecastRepo.findAll();
		
		List<Peliculas> listPeliculas = new ArrayList<Peliculas>();
		
		for (Forecast forecast : listForecast) {
			
			if(forecast.getNum_semana() == (Integer.parseInt(request.getNum_semana()))) {
				listPeliculas.add(obtenerPelicula(forecast.getId_pelicula()));
			}
			
		}		
		
		return listPeliculas;
		
	}
	
	public Peliculas obtenerPelicula(Integer id_pelicula) {
		
		Peliculas p = new Peliculas();
		
		List<Peliculas> listPeliculas = peliculasRepo.findAll();
		
		for (Peliculas peliculas : listPeliculas) {
			if(peliculas.getId() == id_pelicula) {
				p = peliculas;
				break;
			}
		}
		
		return p;
	}
	
}
