package edu.com.cinemark.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.com.cinemark.model.Peliculas;


@Repository
public interface PeliculasRepository extends JpaRepository<Peliculas,Serializable>{

	@Cacheable(value = "peliculas", unless = "#result == null or #result.size() == 0")
	List<Peliculas> findAll();
	
	@Cacheable(value = "peliculas", unless = "#result == null or #result.size() == 0")
	Peliculas findOne(Serializable id);
	
}
