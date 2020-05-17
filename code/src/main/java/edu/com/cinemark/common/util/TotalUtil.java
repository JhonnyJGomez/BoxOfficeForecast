package edu.com.cinemark.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import edu.com.cinemark.model.Peliculas;
import edu.com.cinemark.pojo.resp.ConsultarPeliculasPorSemanaResp;
import edu.com.cinemark.pojo.resp.PeliculaResp;


public class TotalUtil {

    private TotalUtil() {
    }    

    public static String getDateFormat(Date date, String exp) {
	SimpleDateFormat sdf = new SimpleDateFormat(exp);
	return sdf.format(date);
    }

    public static Date ParseFecha(String fecha)
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
    }
    
    public static ConsultarPeliculasPorSemanaResp generateResponse(List<Peliculas> listPeliculas){
    	ConsultarPeliculasPorSemanaResp response = new ConsultarPeliculasPorSemanaResp();
    	
    	for (Peliculas peliculas : listPeliculas) {
			
    		PeliculaResp pr = new PeliculaResp();
    		
    		pr.setCod_pelicula(peliculas.getCod_pelicula());    		
    		pr.setTitulo(peliculas.getTitulo());
    		
    		
    		response.getPeliculas().add(pr);
    		
		}
    	
    	    	
    	
    	return response;
    	
    }

}
