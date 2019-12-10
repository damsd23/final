package pe.edu.delfines.services;

import java.util.List;

import pe.edu.delfines.models.entity.Vendedor;


public interface VendedorService extends CrudService<Vendedor, String>{
	List<Vendedor> fetchMayorSueldo(float sueldo) throws Exception;
	

}
