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

import edu.com.cinemark.common.controller.BaseSeleccionarPeliculaForecastController;
import edu.com.cinemark.exception.ApiFault;
import edu.com.cinemark.pojo.req.SeleccionaPeliculaForecastReq;
import edu.com.cinemark.pojo.resp.ConsultarPeliculasPorSemanaResp;
import edu.com.cinemark.pojo.resp.OkResp;
import edu.com.cinemark.service.IActualizarForecast;
import edu.com.cinemark.service.IConsultaSemana;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "/query", consumes = "application/json")
@RestController
@RequestMapping("/query")
public class SeleccionaPeliculaForecastRest extends BaseSeleccionarPeliculaForecastController{
	
	@Autowired
	private IActualizarForecast actualizarForecast;
	
	@ApiOperation(protocols = "http", value = "Método que se encarga de la logica de negocio del motor MT", notes = "Esta operacion devolvera los productos sugeridos a los clientes MT tanto planes como equipos", response = SeleccionaPeliculaForecastReq.class, nickname = "getPeliculasPorSemana", responseContainer = "List")
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Bad Request", response = ApiFault.class),
	    @ApiResponse(code = 500, message = "Internal Server Error", response = ApiFault.class),
	    @ApiResponse(code = 204, message = "No Content", response = ApiFault.class) })
    @PostMapping("/selecciona-pelicula-forecast")
	public ResponseEntity<OkResp> ingresarPeliculasForescast(@Valid @RequestBody SeleccionaPeliculaForecastReq request, BindingResult bindingResult,
		    HttpServletRequest httpReq) throws MethodArgumentNotValidException {
		
		this.evaluateValidation(bindingResult, httpReq, request);
		
		actualizarForecast.actualizarForecast(request.getPeliculas(), request.getId_ciudad());
				
		OkResp response = new OkResp();
		
		response.setRespuesta("Ok");		
		
		System.out.println("consulta-peliculas-semana : response ===> "+response);
		
		return new ResponseEntity<>(response, HttpStatus.OK);
		
	}
	
}
