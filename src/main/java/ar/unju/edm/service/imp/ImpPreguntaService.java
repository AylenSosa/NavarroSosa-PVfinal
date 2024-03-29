package ar.unju.edm.service.imp;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ar.unju.edm.model.Pregunta;
import ar.unju.edm.repository.PreguntaRepository;
import ar.unju.edm.service.IPreguntaService;

@Service
@Qualifier("servicioEnMySQL")
public class ImpPreguntaService implements IPreguntaService{
	
	@Autowired
	PreguntaRepository preguntaRepository;
	

	@Override
	public void cargarPregunta(Pregunta unaPregunta) {
		// TODO Auto-generated method stub
		unaPregunta.setEstado(true);
		preguntaRepository.save(unaPregunta);
	}

	@Override
	public void eliminarPregunta(Integer idPregunta) {
		Optional<Pregunta> aux= Optional.of(new Pregunta());
		aux=preguntaRepository.findById(idPregunta);
		aux.get().setEstado(false);
		preguntaRepository.save(aux.get());
		
	}

	@Override
	public ArrayList<Pregunta> listarPreguntas() {

		return (ArrayList<Pregunta>) preguntaRepository.findByEstado(true);
	}

	@Override
	public Pregunta modificarPregunta(Integer idPregunta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pregunta listarUnaPregunta(Integer idPregunta) {
		Optional<Pregunta> aux = Optional.of(new Pregunta());
		aux = preguntaRepository.findById(idPregunta);
		return aux.get();
	}
	

}