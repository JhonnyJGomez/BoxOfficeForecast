package edu.com.cinemark.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.com.cinemark.common.util.TotalUtil;
import edu.com.cinemark.model.Semanas;
import edu.com.cinemark.pojo.req.ConsultarSemanasReq;
import edu.com.cinemark.pojo.resp.ConsultarSemanasResp;
import edu.com.cinemark.repository.SemanasRepository;


@Service
public class ConsultaSemana implements IConsultaSemana{
	
	@Autowired
	private SemanasRepository semanasRepo;

	@Override
    public ConsultarSemanasResp getNumSemana(ConsultarSemanasReq request) {
		
		List<Semanas> listSemanas = semanasRepo.findAll();
		
		Date fecha_input = TotalUtil.ParseFecha(request.getFec_inicial());
		
		System.out.println("Fecha Input: "+fecha_input);
		
		String num_semana = obtenerNumSemana(listSemanas, fecha_input, request);
		
		ConsultarSemanasResp response = new ConsultarSemanasResp();
		
		response.setNumSemana(num_semana);
		
		return response;
		
	}
	
	public String obtenerNumSemana(List<Semanas> listSemanas, Date fecha_input, ConsultarSemanasReq request) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String num_semana = "";
		
		for (Semanas semanas : listSemanas) {
					
					//if(semanas.getFec_inicial().before(fecha_input) && semanas.getFec_final().after(fecha_input)) {
					if((semanas.getFec_inicial().before(fecha_input) && semanas.getFec_final().after(fecha_input)) || 
							sdf.format(semanas.getFec_inicial()).equals(request.getFec_inicial()) || sdf.format(semanas.getFec_final()).equals(request.getFec_inicial())	) {
						
						System.out.println("ID: "+semanas.getId());
						System.out.println("COD SEMANA: "+semanas.getCod_semana());
						System.out.println("NUM SEMANA: "+semanas.getNum_semana());
						System.out.println("FEC INICIAL: "+semanas.getFec_inicial());
						System.out.println("FEC FINAL: "+semanas.getFec_final());
						
						num_semana = String.valueOf(semanas.getNum_semana());
					
					}
		}
		
		return num_semana;
	}
	
	public Integer getIdFecEstreno(ConsultarSemanasReq request) {
		
		List<Semanas> listSemanas = semanasRepo.findAll();
		
		Date fecha_input = TotalUtil.ParseFecha(request.getFec_inicial());
		
		System.out.println("Fecha Input: "+fecha_input);
		
		Integer num_semana = obtenerIdFecEstreno(listSemanas, fecha_input, request);
		
		return num_semana;
		
	}
	
	public Integer obtenerIdFecEstreno(List<Semanas> listSemanas, Date fecha_input, ConsultarSemanasReq request) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Integer id_fec_estreno = 0;
		
		for (Semanas semanas : listSemanas) {
					
					//if(semanas.getFec_inicial().before(fecha_input) && semanas.getFec_final().after(fecha_input)) {
					if((semanas.getFec_inicial().before(fecha_input) && semanas.getFec_final().after(fecha_input)) || 
							sdf.format(semanas.getFec_inicial()).equals(request.getFec_inicial()) || sdf.format(semanas.getFec_final()).equals(request.getFec_inicial())	) {
						
						System.out.println("ID: "+semanas.getId());
						System.out.println("COD SEMANA: "+semanas.getCod_semana());
						System.out.println("NUM SEMANA: "+semanas.getNum_semana());
						System.out.println("FEC INICIAL: "+semanas.getFec_inicial());
						System.out.println("FEC FINAL: "+semanas.getFec_final());
						
						id_fec_estreno = semanas.getId();
					
					}
		}
		
		return id_fec_estreno;
	}
	
}
