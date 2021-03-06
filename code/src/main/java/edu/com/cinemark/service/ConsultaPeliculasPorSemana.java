package edu.com.cinemark.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.com.cinemark.model.Peliculas;
import edu.com.cinemark.repository.ForecastRepository;
import edu.com.cinemark.repository.PeliculasRepository;


@Service
public class ConsultaPeliculasPorSemana implements IConsultaPeliculasPorSemana{
	
	@Autowired
	private ForecastRepository forecastRepo;
	
	@Autowired
	private PeliculasRepository peliculasRepo;
    
	@Override
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
    
    
}
