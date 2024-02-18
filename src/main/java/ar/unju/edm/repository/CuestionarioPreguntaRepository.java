package ar.unju.edm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.unju.edm.model.Cuestionario;
import ar.unju.edm.model.CuestionarioPregunta;



@Repository
public interface CuestionarioPreguntaRepository extends CrudRepository<CuestionarioPregunta, Integer>{
	List<CuestionarioPregunta> findAllByCuestionario(Cuestionario cuestionario);
	 
}