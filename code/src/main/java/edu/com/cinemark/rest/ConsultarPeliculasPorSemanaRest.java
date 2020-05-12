package edu.com.cinemark.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.com.cinemark.common.controller.BaseConsultaSemanaController;
import edu.com.cinemark.exception.ApiFault;
import edu.com.cinemark.model.Forecast;
import edu.com.cinemark.model.Peliculas;
import edu.com.cinemark.pojo.req.ConsultarSemanasReq;
import edu.com.cinemark.pojo.resp.ConsultarPeliculasPorSemanaResp;
import edu.com.cinemark.pojo.resp.ConsultarSemanasResp;
import edu.com.cinemark.service.IConsultaPeliculasPorSemana;
import edu.com.cinemark.service.IConsultaSemana;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "/query", consumes = "application/json")
@RestController
@RequestMapping("/query")
public class ConsultarPeliculasPorSemanaRest extends BaseConsultaSemanaController{
	
	@Autowired
	private IConsultaSemana consultaSemana;
	
	@Autowired
	private IConsultaPeliculasPorSemana consultaPeliculaPorSemana;
	
	@ApiOperation(protocols = "http", value = "Método que se encarga de la logica de negocio del motor MT", notes = "Esta operacion devolvera los productos sugeridos a los clientes MT tanto planes como equipos", response = ConsultarSemanasResp.class, nickname = "getPeliculasPorSemana", responseContainer = "List")
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Bad Request", response = ApiFault.class),
	    @ApiResponse(code = 500, message = "Internal Server Error", response = ApiFault.class),
	    @ApiResponse(code = 204, message = "No Content", response = ApiFault.class) })
    @PostMapping("/consulta-peliculas-semana")
	public ResponseEntity<ConsultarPeliculasPorSemanaResp> getPeliculasPorSemana(@Valid @RequestBody ConsultarSemanasReq request, BindingResult bindingResult,
		    HttpServletRequest httpReq) throws MethodArgumentNotValidException {
		
		this.evaluateValidation(bindingResult, httpReq, request);
		
		System.out.println("REQUEST ======>"+request);
		
		//ConsultarSemanasResp response = new ConsultarSemanasResp();
		
		Integer id_fec_estreno = consultaSemana.getIdFecEstreno(request);
		
		System.out.println("consulta-peliculas-semana : num_semana ===> "+id_fec_estreno);		
		
		List<Peliculas> listPeliculas = consultaPeliculaPorSemana.listarPeliculas(id_fec_estreno);
		
		System.out.println("consulta-peliculas-semana : listPeliculas ===> "+listPeliculas.size());
		
		ConsultarPeliculasPorSemanaResp response = new ConsultarPeliculasPorSemanaResp();
		
		response = consultaPeliculaPorSemana.generateResponse(listPeliculas);
		
		System.out.println("consulta-peliculas-semana : response ===> "+response);
		
		System.out.println("commit");
		
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	
}
