package edu.com.cinemark.service;

import java.util.Date;
import java.util.List;

import edu.com.cinemark.model.Semanas;
import edu.com.cinemark.pojo.req.ConsultarSemanasReq;
import edu.com.cinemark.pojo.resp.ConsultarSemanasResp;

public interface IConsultaSemana {

	ConsultarSemanasResp getNumSemana(ConsultarSemanasReq request);
	
	Integer getIdFecEstreno(ConsultarSemanasReq request);
	
}
