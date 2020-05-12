package edu.com.cinemark.exception;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description = "Objeto que hace referencia a los errores del api")
@Data
public class ApiFault {
	
	private String    errorConsultaLlamada;
}
