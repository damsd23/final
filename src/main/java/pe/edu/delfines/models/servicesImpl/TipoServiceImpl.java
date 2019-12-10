package pe.edu.delfines.models.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.delfines.models.entity.Tipo;
import pe.edu.delfines.models.repository.ClienteRepository;
import pe.edu.delfines.models.repository.TipoRepository;
import pe.edu.delfines.services.TipoService;
@Service
public class TipoServiceImpl implements TipoService{

	@Autowired
	private TipoRepository tipoRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Tipo> findAll() throws Exception {
		// TODO Auto-generated method stub
		return tipoRepository.findAll()
				;
	}

	@Override
	public Optional<Tipo> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return tipoRepository.findById(id);
	}

	@Override
	public Tipo save(Tipo entity) throws Exception {
		// TODO Auto-generated method stub
		return tipoRepository.save(entity);
	}

	@Override
	public Tipo update(Tipo entity) throws Exception {
		// TODO Auto-generated method stub
		return tipoRepository.save(entity);
	}

	@Override
	public void deleteById(String id) throws Exception {
		// TODO Auto-generated method stub
		tipoRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() throws Exception {
		// TODO Auto-generated method stub
		tipoRepository.deleteAll();
		
	}

}
