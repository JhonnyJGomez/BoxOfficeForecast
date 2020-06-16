package edu.com.cinemark.common.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;

import com.fasterxml.jackson.databind.ObjectMapper;

import edu.com.cinemark.common.util.Constant;
import edu.com.cinemark.common.util.TotalUtil;
import edu.com.cinemark.common.util.UtilLog;
import edu.com.cinemark.pojo.req.PeliculasParametrosReq;

@Controller
public class BaseSeleccionarPeliculasParametrosController {

    private static final Logger logger = LogManager.getLogger(BaseSeleccionarPeliculasParametrosController.class);

    @Autowired
    private ObjectMapper objMapper;

    public void evaluateValidation(BindingResult validation, HttpServletRequest request, PeliculasParametrosReq obj)
	    throws MethodArgumentNotValidException {
	this.logBeforeHttpCall(request, obj);
	if (validation.hasErrors() && CollectionUtils.isNotEmpty(validation.getAllErrors())) {
	    throw new MethodArgumentNotValidException(null, validation);
	}
    }

    public void logBeforeHttpCall(HttpServletRequest request, PeliculasParametrosReq obj) {
	StringBuilder log = new StringBuilder();
	try {

	    log.append(Constant.URL_LABEL);
	    log.append(objMapper.writeValueAsString(request.getRequestURI()));
	    log.append(Constant.NEW_LINE + "" + Constant.NEW_LINE);
	    log.append(Constant.METHOD_LOG_LABEL);
	    log.append(objMapper.writeValueAsString(request.getMethod()));
	    log.append(Constant.PARAMETERS_LOG_LABEL);
	    log.append(Constant.NEW_LINE);
	    log.append(Constant.INPUT_PARAMETERS_LABEL);
	    log.append(Constant.NEW_LINE);
	    String temp;

	    temp = String.format("-[%s] %s = %s ".concat(Constant.NEW_LINE), "Json", "values", objMapper.writeValueAsString(obj));

	    log.append(temp);
	} catch (Exception e) {
	    String temp;
	    temp = "[It couldn't parse to JSON the method's response (Please check the SOAP log)]";
	    log.append(temp);
	    log.append(Constant.NEW_LINE);
	}
	logInfo(log.toString());
    }

    private static void logInfo(String log) {

	StringBuilder finalLog = new StringBuilder();
	finalLog.append(getHeaderForLog());
	finalLog.append(log);
	finalLog.append(getFooterLog());
	logger.info(finalLog.toString());
    }

    private static String getHeaderForLog() {

	StringBuilder headerLog = new StringBuilder();

	UtilLog.generateTracking();

	headerLog.append(Constant.NEW_LINE + Constant.SEPARATOR + Constant.NEW_LINE);
	headerLog.append("[TrackingID]: ");
	headerLog.append(UtilLog.getTracking());
	headerLog.append(Constant.NEW_LINE);
	headerLog.append("[Date]: ");
	headerLog.append(new Date());
	headerLog.append(Constant.NEW_LINE);
	headerLog.append("[Time]: ");
	headerLog.append(TotalUtil.getDateFormat(new Date(), Constant.TIME));
	headerLog.append(Constant.NEW_LINE + "" + Constant.NEW_LINE);
	return headerLog.toString();
    }

    private static String getFooterLog() {
	return Constant.SEPARATOR;
    }
}
