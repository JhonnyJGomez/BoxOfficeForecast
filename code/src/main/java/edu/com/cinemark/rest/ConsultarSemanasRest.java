package edu.com.cinemark.rest;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.com.cinemark.common.controller.BaseConsultaSemanaController;
import edu.com.cinemark.exception.ApiFault;
import edu.com.cinemark.pojo.req.ConsultarSemanasReq;
import edu.com.cinemark.pojo.resp.ConsultarSemanasResp;
import edu.com.cinemark.service.IConsultaSemana;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "/query", consumes = "application/json")
@RestController
@RequestMapping("/query")
public class ConsultarSemanasRest extends BaseConsultaSemanaController{
	
	@Autowired
	private IConsultaSemana consultaSemana;
	
	@ApiOperation(protocols = "http", value = "Método que se encarga de la logica de negocio del motor MT", notes = "Esta operacion devolvera los productos sugeridos a los clientes MT tanto planes como equipos", response = ConsultarSemanasResp.class, nickname = "getNumSemana", responseContainer = "List")
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Bad Request", response = ApiFault.class),
	    @ApiResponse(code = 500, message = "Internal Server Error", response = ApiFault.class),
	    @ApiResponse(code = 204, message = "No Content", response = ApiFault.class) })
    @GetMapping("/consulta-semana")
	public ResponseEntity<ConsultarSemanasResp> getNumSemana(@Valid @RequestBody ConsultarSemanasReq request, BindingResult bindingResult,
		    HttpServletRequest httpReq) throws MethodArgumentNotValidException {
		
		this.evaluateValidation(bindingResult, httpReq, request);
		
		System.out.println("REQUEST ======>"+request);
		
		//ConsultarSemanasResp response = new ConsultarSemanasResp();
		
		ConsultarSemanasResp response = consultaSemana.getNumSemana(request);
		
		

		
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	
}
