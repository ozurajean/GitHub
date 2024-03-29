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
import javax.persistence.UniqueConstraint;

/**
 * Condicion generated by hbm2java
 */
@Entity
@Table(name = "condicion", schema = "web", uniqueConstraints = @UniqueConstraint(columnNames = "codigo"))
public class Condicion implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 732446123350181667L;
	private int idcondicion;
	private String codigo;
	private String descripcion;
	private Set<?> productoCondicions = new HashSet<Object>(0);

	public Condicion() {
	}

	public Condicion(int idcondicion, String codigo) {
		this.idcondicion = idcondicion;
		this.codigo = codigo;
	}

	public Condicion(int idcondicion, String codigo, String descripcion,
			Set<?> productoCondicions) {
		this.idcondicion = idcondicion;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.productoCondicions = productoCondicions;
	}

	@Id
	@Column(name = "idcondicion", unique = true, nullable = false)
	public int getIdcondicion() {
		return this.idcondicion;
	}

	public void setIdcondicion(int idcondicion) {
		this.idcondicion = idcondicion;
	}

	@Column(name = "codigo", unique = true, nullable = false, length = 10)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "descripcion", length = 50)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "condicion")
	public Set<?> getProductoCondicions() {
		return this.productoCondicions;
	}

	public void setProductoCondicions(Set<?> productoCondicions) {
		this.productoCondicions = productoCondicions;
	}

}
