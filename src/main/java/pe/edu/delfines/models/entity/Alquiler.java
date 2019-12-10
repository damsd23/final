package pe.edu.delfines.models.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "alquileres")
public class Alquiler {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "precio")
	private Integer precio;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_entrada")	
	private Date fecha_entrada;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_salida")	
	private Date fecha_salida;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "observacion")
	private String observacion;
	
	@JsonIgnoreProperties("alquiler")
	@ManyToOne
	@JoinColumn(name = "vendedor_id")
	private Vendedor vendedor_id;
	
	@JsonIgnoreProperties("alquiler")
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente_id;
	
	@JsonIgnoreProperties("alquiler")
	@ManyToOne
	@JoinColumn(name = "habitacion_id")
	private Habitacion habitacion_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Date getFecha_entrada() {
		return fecha_entrada;
	}

	public void setFecha_entrada(Date fecha_entrada) {
		this.fecha_entrada = fecha_entrada;
	}

	public Date getFecha_salida() {
		return fecha_salida;
	}

	public void setFecha_salida(Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Vendedor getVendedor_id() {
		return vendedor_id;
	}

	public void setVendedor_id(Vendedor vendedor_id) {
		this.vendedor_id = vendedor_id;
	}

	public Cliente getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(Cliente cliente_id) {
		this.cliente_id = cliente_id;
	}

	public Habitacion getHabitacion_id() {
		return habitacion_id;
	}

	public void setHabitacion_id(Habitacion habitacion_id) {
		this.habitacion_id = habitacion_id;
	}
	
	
}
