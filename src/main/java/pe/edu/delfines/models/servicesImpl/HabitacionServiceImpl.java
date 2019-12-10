package pe.edu.delfines.models.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.delfines.models.entity.Habitacion;
import pe.edu.delfines.models.repository.ClienteRepository;
import pe.edu.delfines.models.repository.HabitacionRepository;
import pe.edu.delfines.services.HabitacionService;
@Service
public class HabitacionServiceImpl implements HabitacionService {

	@Autowired
	private HabitacionRepository habitacionRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Habitacion> findAll() throws Exception {
		// TODO Auto-generated method stub
		return habitacionRepository.findAll()
				;
	}

	@Override
	public Optional<Habitacion> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return habitacionRepository.findById(id);
	}

	@Override
	public Habitacion save(Habitacion entity) throws Exception {
		// TODO Auto-generated method stub
		return habitacionRepository.save(entity);
	}

	@Override
	public Habitacion update(Habitacion entity) throws Exception {
		// TODO Auto-generated method stub
		return habitacionRepository.save(entity);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		habitacionRepository.deleteById(id);
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		habitacionRepository.deleteAll();
	}

}
