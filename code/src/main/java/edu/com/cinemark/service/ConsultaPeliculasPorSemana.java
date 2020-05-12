package edu.com.cinemark.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.com.cinemark.model.Forecast;
import edu.com.cinemark.model.Peliculas;
import edu.com.cinemark.pojo.resp.ConsultarPeliculasPorSemanaResp;
import edu.com.cinemark.pojo.resp.PeliculaResp;
import edu.com.cinemark.repository.ForecastRepository;
import edu.com.cinemark.repository.PeliculasRepository;


@Service
public class ConsultaPeliculasPorSemana implements IConsultaPeliculasPorSemana{
	
	@Autowired
	private ForecastRepository forecastRepo;
	
	@Autowired
	private PeliculasRepository peliculasRepo;

	
    public List<Forecast> getListForecatsPorNumSemana(String num_semana) {
		
		List<Forecast> listForecastTemp = forecastRepo.findAll();
		
		Integer semana = Integer.parseInt(num_semana);
		
		
		List<Forecast> listForecast = new ArrayList<Forecast>();
		
		for (Forecast forecast : listForecastTemp) {
			if(forecast.getNum_semana() == semana) {
				listForecast.add(forecast);
			}
		}
		
		return listForecast;
		
	}
    
    public List<Peliculas> listarPeliculas(Integer id_fec_estreno){
    	
    	List<Peliculas> listPeliculasTemp = peliculasRepo.findAll();
    	
    	List<Peliculas> listPeliculas = new ArrayList<Peliculas>();
    	
    	for (Peliculas pel : listPeliculasTemp) {
			
    		if(pel.getId_fec_estreno() == id_fec_estreno) {
    		
    		listPeliculas.add(pel);
    		
    		}
    		
		}
    	
    	return listPeliculas;
    	
    }
    
    public ConsultarPeliculasPorSemanaResp generateResponse(List<Peliculas> listPeliculas){
    	ConsultarPeliculasPorSemanaResp response = new ConsultarPeliculasPorSemanaResp();
    	
    	for (Peliculas peliculas : listPeliculas) {
			
    		PeliculaResp pr = new PeliculaResp();
    		
    		pr.setCod_pelicula(peliculas.getCod_pelicula());    		
    		pr.setTitulo(peliculas.getTitulo());
    		
    		
    		response.getPeliculas().add(pr);
    		
		}
    	
    	    	
    	
    	return response;
    	
    }
    
}
