package edu.com.cinemark.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.com.cinemark.model.Forecast;

@Repository
public interface ForecastRepository extends JpaRepository<Forecast,Serializable>{

	@Cacheable(value = "forecasts", unless = "#result == null or #result.size() == 0")
	List<Forecast> findAll();
	
}
