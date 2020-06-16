package edu.com.cinemark.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.com.cinemark.common.util.TotalUtil;
import edu.com.cinemark.model.PeliculasParametros;
import edu.com.cinemark.pojo.req.ParametrizacionReq;
import edu.com.cinemark.pojo.req.ParametrizadosReq;
import edu.com.cinemark.pojo.req.PeliculasParametrosReq;
import edu.com.cinemark.repository.PeliculasParametrosRepository;


@Service
public class ActulizarPeliculasParametros implements IActualizarPeliculasParametros{
	
	@Autowired
	private PeliculasParametrosRepository peliculasParametrosRepo;

	@Override
	public void actualizarPeliculasParametros(PeliculasParametrosReq peliculasParametros) {
		Integer max = peliculasParametrosRepo.findAll().size();
		
		List<PeliculasParametros> listPeliculaParametro = new ArrayList<PeliculasParametros>();
		int i = max;
		
			
			for (ParametrizacionReq pq : peliculasParametros.getParametrizacion()) {
				for (ParametrizadosReq pr : pq.getParametros()) {
					
				
				PeliculasParametros pp = new PeliculasParametros();
				pp.setId(i+1);
				pp.setId_parametro(Integer.parseInt(pr.getId_parametro()));
				pp.setValue(pr.getValue());
				pp.setId_pelicula(Integer.parseInt(pq.getId_pelicula()));
				
				listPeliculaParametro.add(pp);
				i++;
				
				}
			}
			
			
		System.out.println("Tamaño de la lista: "+listPeliculaParametro.size());
		
		peliculasParametrosRepo.save(listPeliculaParametro);
		
	};
	
	
	
}
