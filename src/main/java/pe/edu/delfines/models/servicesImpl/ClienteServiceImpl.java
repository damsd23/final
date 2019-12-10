package pe.edu.delfines.models.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.delfines.models.entity.Cliente;
import pe.edu.delfines.models.repository.ClienteRepository;
import pe.edu.delfines.services.ClienteService;


@Service
public class ClienteServiceImpl implements ClienteService{
	@Autowired
	private ClienteRepository ClienteRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() throws Exception {
		// TODO Auto-generated method stub
		return ClienteRepository.findAll();
	}

	@Override
	public Optional<Cliente> findById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return ClienteRepository.findById(id);
	}

	@Override
	public Cliente save(Cliente entity) throws Exception {
		// TODO Auto-generated method stub
		return ClienteRepository.save(entity);
	}

	@Override
	public Cliente update(Cliente entity) throws Exception {
		// TODO Auto-generated method stub
		return ClienteRepository.save(entity);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		ClienteRepository.deleteById(id);
		
	}

	@Override
	public void deleteAll() throws Exception {
		ClienteRepository.deleteAll();
		
	}

}
