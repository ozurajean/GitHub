package com.web.deckshop.pojo.annotations;

// Generated 05/07/2012 04:39:51 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Banco generated by hbm2java
 */
@Entity
@Table(name = "banco", schema = "web")
public class Banco implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5225924022962031472L;
	private int idbanco;
	private String nombre;
	private Set<?> proveedors = new HashSet<Object>(0);

	public Banco() {
	}

	public Banco(int idbanco, String nombre) {
		this.idbanco = idbanco;
		this.nombre = nombre;
	}

	public Banco(int idbanco, String nombre, Set<?> proveedors) {
		this.idbanco = idbanco;
		this.nombre = nombre;
		this.proveedors = proveedors;
	}

	@Id
	@Column(name = "idbanco", unique = true, nullable = false)
	public int getIdbanco() {
		return this.idbanco;
	}

	public void setIdbanco(int idbanco) {
		this.idbanco = idbanco;
	}

	@Column(name = "nombre", nullable = false, length = 20)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "banco")
	public Set<?> getProveedors() {
		return this.proveedors;
	}

	public void setProveedors(Set<?> proveedors) {
		this.proveedors = proveedors;
	}

}
