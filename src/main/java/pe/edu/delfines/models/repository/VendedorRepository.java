package pe.edu.delfines.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.delfines.models.entity.Vendedor;


@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, String> {
	
	
	List<Vendedor> findByNombre(String nombre);
	
	List<Vendedor> findByTelefono(Float sueldo);
	
	@Query("Select me from Vendedor me where me.sueldo > :sueldo")
	List<Vendedor> fetchMayorSueldo(Float sueldo);

}
