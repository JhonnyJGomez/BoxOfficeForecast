package edu.com.cinemark.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.com.cinemark.common.util.TotalUtil;
import edu.com.cinemark.model.Ciudades;
import edu.com.cinemark.pojo.resp.CiudadesResp;
import edu.com.cinemark.pojo.resp.ConsultarCiudadesResp;
import edu.com.cinemark.repository.CiudadesRepository;


@Service
public class ConsultaCiudades implements IConsultaCiudades{
	
	@Autowired
	private CiudadesRepository ciudadesRepo;

	@Override
    public ConsultarCiudadesResp getCiudades() {
		
		List<Ciudades> listCiudades = ciudadesRepo.findAll();
		
		ConsultarCiudadesResp response = new ConsultarCiudadesResp();
		
		response.setCiudades(new ArrayList<CiudadesResp>());
		
		for (Ciudades ciudades : listCiudades) {
			CiudadesResp cr= new CiudadesResp();
			
			cr.setCod_ciudad(ciudades.getCod_ciudad());
			cr.setNom_ciudad(ciudades.getNom_ciudad());
			
			response.getCiudades().add(cr);
		}
		
		
		
		return response;
		
	}
	
	
	
}
