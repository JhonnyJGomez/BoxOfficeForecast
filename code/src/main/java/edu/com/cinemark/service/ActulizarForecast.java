package edu.com.cinemark.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.com.cinemark.common.util.TotalUtil;
import edu.com.cinemark.model.Ciudades;
import edu.com.cinemark.model.Forecast;
import edu.com.cinemark.pojo.req.PeliculaReq;
import edu.com.cinemark.pojo.resp.CiudadesResp;
import edu.com.cinemark.pojo.resp.ConsultarCiudadesResp;
import edu.com.cinemark.repository.CiudadesRepository;
import edu.com.cinemark.repository.ForecastRepository;


@Service
public class ActulizarForecast implements IActualizarForecast{
	
	@Autowired
	private ForecastRepository forecastRepo;

	@Override
	public void actualizarForecast(List<PeliculaReq> listPeliculas, String id_ciudad) {
		Integer max = forecastRepo.findAll().size();
		
		List<Forecast> listForecast = new ArrayList<Forecast>();
		int i = max;
		for (PeliculaReq pq : listPeliculas) {
			Forecast f = new Forecast();
			f.setId(i+1);
			f.setCod_forecast(pq.getCod_forecast());
			f.setNum_semana(Integer.parseInt(pq.getNum_semana()));
			f.setId_pelicula(Integer.parseInt(pq.getId_pelicula()));
			f.setId_ciudad(Integer.parseInt(id_ciudad));
			listForecast.add(f);
			i++;
		}
		
		forecastRepo.save(listForecast);
		
	};
	
	
	
}
