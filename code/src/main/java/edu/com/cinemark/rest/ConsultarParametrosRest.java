package edu.com.cinemark.rest;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.com.cinemark.common.controller.BaseConsultaParametroController;
import edu.com.cinemark.exception.ApiFault;
import edu.com.cinemark.pojo.req.ConsultarParametroReq;
import edu.com.cinemark.pojo.resp.ConsultarParametrosResp;
import edu.com.cinemark.service.IConsultaParametros;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "/query", consumes = "application/json")
@RestController
@RequestMapping("/query")
public class ConsultarParametrosRest extends BaseConsultaParametroController{
	
	@Autowired
	private IConsultaParametros consultaParametros;
		
	@ApiOperation(protocols = "http", value = "Método que se encarga de la logica de negocio del motor MT", notes = "Esta operacion devolvera los productos sugeridos a los clientes MT tanto planes como equipos", response = ConsultarParametrosResp.class, nickname = "getParametros", responseContainer = "List")
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Bad Request", response = ApiFault.class),
	    @ApiResponse(code = 500, message = "Internal Server Error", response = ApiFault.class),
	    @ApiResponse(code = 204, message = "No Content", response = ApiFault.class) })
    @GetMapping("/consulta-parametro")
	public ResponseEntity<ConsultarParametrosResp> getParametros(@Valid @RequestBody ConsultarParametroReq request, BindingResult bindingResult,
		    HttpServletRequest httpReq) throws MethodArgumentNotValidException {
		
		this.evaluateValidation(bindingResult, httpReq, request);	
		
		
		ConsultarParametrosResp response = consultaParametros.getParametros();		
		
		
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	
}
