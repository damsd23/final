package pe.edu.delfines.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.delfines.models.entity.Alquiler;
import pe.edu.delfines.models.entity.Cliente;

public interface AlquilerRepository extends JpaRepository<Alquiler, Integer>  {

}
