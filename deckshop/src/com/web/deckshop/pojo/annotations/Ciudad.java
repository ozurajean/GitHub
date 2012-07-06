package com.web.deckshop.pojo.annotations;

// Generated 05/07/2012 04:39:51 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Ciudad generated by hbm2java
 */
@Entity
@Table(name = "ciudad", schema = "web")
public class Ciudad implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8059124501676786742L;
	private int idciudad;
	private Estadoprovincia estadoprovincia;
	private String nombre;
	private String descripcion;
	private Set<?> direccionclientes = new HashSet<Object>(0);

	public Ciudad() {
	}

	public Ciudad(int idciudad, Estadoprovincia estadoprovincia, String nombre) {
		this.idciudad = idciudad;
		this.estadoprovincia = estadoprovincia;
		this.nombre = nombre;
	}

	public Ciudad(int idciudad, Estadoprovincia estadoprovincia, String nombre,
			String descripcion, Set<?> direccionclientes) {
		this.idciudad = idciudad;
		this.estadoprovincia = estadoprovincia;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.direccionclientes = direccionclientes;
	}

	@Id
	@Column(name = "idciudad", unique = true, nullable = false)
	public int getIdciudad() {
		return this.idciudad;
	}

	public void setIdciudad(int idciudad) {
		this.idciudad = idciudad;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idestadoprovincia", nullable = false)
	public Estadoprovincia getEstadoprovincia() {
		return this.estadoprovincia;
	}

	public void setEstadoprovincia(Estadoprovincia estadoprovincia) {
		this.estadoprovincia = estadoprovincia;
	}

	@Column(name = "nombre", nullable = false, length = 50)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion", length = 100)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ciudad")
	public Set<?> getDireccionclientes() {
		return this.direccionclientes;
	}

	public void setDireccionclientes(Set<?> direccionclientes) {
		this.direccionclientes = direccionclientes;
	}

}
