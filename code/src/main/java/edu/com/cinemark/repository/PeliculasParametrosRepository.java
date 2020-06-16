package edu.com.cinemark.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.com.cinemark.model.PeliculasParametros;


@Repository
public interface PeliculasParametrosRepository extends JpaRepository<PeliculasParametros,Serializable>{

	@Cacheable(value = "peliculasparametros", unless = "#result == null or #result.size() == 0")
	List<PeliculasParametros> findAll();
	
}
