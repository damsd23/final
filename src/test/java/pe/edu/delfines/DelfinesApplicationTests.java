package pe.edu.delfines;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.delfines.models.entity.Alquiler;
import pe.edu.delfines.models.entity.Cliente;
import pe.edu.delfines.models.entity.Habitacion;
import pe.edu.delfines.models.entity.Tipo;
import pe.edu.delfines.models.entity.Vendedor;
import pe.edu.delfines.models.repository.AlquilerRepository;
import pe.edu.delfines.models.repository.ClienteRepository;
import pe.edu.delfines.models.repository.HabitacionRepository;
import pe.edu.delfines.models.repository.TipoRepository;
import pe.edu.delfines.models.repository.VendedorRepository;


@SpringBootTest
class DelfinesApplicationTests {
	
	@Autowired
	ClienteRepository clienteRepository;
	

	@Autowired
	VendedorRepository vendedorRepository;
	

	@Autowired
	HabitacionRepository habitacionRepository;
	

	@Autowired
	TipoRepository tipoRpository;


	@Autowired
	AlquilerRepository alquilerRepository;
	
	@Test
	void contextLoads() {
		
		
		try {

			
			//CLIENTE
			Cliente cliente1 = new Cliente();
			
			cliente1.setNombre("Diego");
			cliente1.setDocumento("72870063");
			cliente1.setFechaNacimiento(new Date(2019, 9, 9));
			cliente1.setLugarNacimiento("LIMA");
			cliente1.setSexo('M');
			cliente1.setObservacion("Sin obervacion");
			
			Cliente cliente2 = new Cliente();
			
			cliente2.setNombre("Carlos");
			cliente2.setDocumento("72870064");
			cliente2.setFechaNacimiento(new Date(2019, 9, 9));
			cliente2.setLugarNacimiento("ICA");
			cliente2.setSexo('M');
			cliente2.setObservacion("Sin obervacion");
			
			
			cliente1=clienteRepository.save(cliente1);
			cliente2=clienteRepository.save(cliente2);
			
			//VENDEDORES
			
			Vendedor vendedor1 = new Vendedor();
			vendedor1.setId("V01");
			vendedor1.setNombre("Jose nazaret");
			vendedor1.setDireccion("jr. Breña ");
			vendedor1.setTelefono("95878544");
			vendedor1.setSueldo(1500f);
			vendedor1.setObservacion("Sin obervacion");
			
			Vendedor vendedor2 = new Vendedor();
			vendedor2.setId("V02");
			vendedor2.setNombre("Cesar Navarro");
			vendedor2.setDireccion("jr. Atrica ");
			vendedor2.setTelefono("456789123");
			vendedor2.setSueldo(1600f);
			vendedor2.setObservacion("Con obervacion");
			
			vendedor1=vendedorRepository.save(vendedor1);
			vendedor2=vendedorRepository.save(vendedor2);
			
			
			//Tipos
			
			Tipo tipo1=new Tipo();
			tipo1.setId("T01");
			tipo1.setNombre("MATRIMONIAL");
			
			Tipo tipo2=new Tipo();
			tipo2.setId("T02");
			tipo2.setNombre("NORMAL");
			 
			tipo1=tipoRpository.save(tipo1);
			tipo2=tipoRpository.save(tipo2);
			
			//Habitaciones
			
			Habitacion habitacion1=new Habitacion();
			habitacion1.setId(1);
			habitacion1.setNumeroCamas(2);
			habitacion1.setDescripcion("HABITACION PARA 2");
			habitacion1.setPrecio(1500f);
			habitacion1.setObservacion("Con observaciones");
			
			Habitacion habitacion2=new Habitacion();
			habitacion2.setId(2);
			habitacion2.setNumeroCamas(1);
			habitacion2.setDescripcion("HABITACION PARA 1");
			habitacion2.setPrecio(1000f);
			habitacion2.setObservacion("Con observaciones");
			
			habitacion1=habitacionRepository.save(habitacion1);
			habitacion2=habitacionRepository.save(habitacion2);
			
			
			
			
			//Alquileres
			
			Alquiler alquiler1=new Alquiler();
					alquiler1.setId(1);
					alquiler1.setPrecio(3000);
					alquiler1.setFecha_entrada(new Date(2019, 9, 9));
					alquiler1.setFecha_salida(new Date(2019, 9, 10));
					alquiler1.setEstado("OK");
					alquiler1.setObservacion("SIN OBSERVACION");
					
					Alquiler alquiler2=new Alquiler();
					alquiler2.setId(2);
					alquiler2.setPrecio(3000);
					alquiler2.setFecha_entrada(new Date(2019, 8, 9));
					alquiler2.setFecha_salida(new Date(2019, 8, 10));
					alquiler2.setEstado("NO OK");
					alquiler2.setObservacion("CON OBSERVACOIN");
					
				
					
					//RELACIONES HABITACION-TIPO
					
					habitacion1.setTipo(tipo1);
					habitacion2.setTipo(tipo2);
					
					//RELACION ALQI¿UILERES
					
					alquiler1.setVendedor_id(vendedor1);
					alquiler1.setCliente_id(cliente1);
					alquiler1.setHabitacion_id(habitacion1);
					
					alquiler2.setVendedor_id(vendedor2);
					alquiler2.setCliente_id(cliente2);
					alquiler2.setHabitacion_id(habitacion2);
					
					//grabar
					
					clienteRepository.save(cliente1);
					clienteRepository.save(cliente2);
					
					vendedorRepository.save(vendedor1);
					vendedorRepository.save(vendedor2);
					
					tipoRpository.save(tipo1);
					tipoRpository.save(tipo2);
					
					habitacionRepository.save(habitacion1);
					habitacionRepository.save(habitacion2);
					
					alquilerRepository.save(alquiler1);
					alquilerRepository.save(alquiler2);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
