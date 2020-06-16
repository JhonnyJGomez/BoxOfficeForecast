package edu.com.cinemark.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.com.cinemark.common.util.TotalUtil;
import edu.com.cinemark.model.Parametros;
import edu.com.cinemark.pojo.resp.ConsultarParametrosResp;
import edu.com.cinemark.pojo.resp.ParametrosResp;
import edu.com.cinemark.repository.ParametrosRepository;


@Service
public class ConsultaParametros implements IConsultaParametros{
	
	@Autowired
	private ParametrosRepository parametrosRepo;

	@Override
    public ConsultarParametrosResp getParametros() {
		
		List<Parametros> listParametros = parametrosRepo.findAll();
		
		ConsultarParametrosResp response = new ConsultarParametrosResp();
		
		response.setParametros(new ArrayList<ParametrosResp>());
		
		for (Parametros parametros : listParametros) {
			ParametrosResp pr= new ParametrosResp();
			
			pr.setId_parametro(String.valueOf(parametros.getId()));
			pr.setNom_parametro(parametros.getNom_parametro());
			pr.setType(parametros.getType());
			
			response.getParametros().add(pr);
		}
		
		
		
		return response;
		
	}
	
	
	
}
