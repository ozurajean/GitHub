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
 * Formapago generated by hbm2java
 */
@Entity
@Table(name = "formapago", schema = "web", uniqueConstraints = @UniqueConstraint(columnNames = "codigo"))
public class Formapago implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9104917435400616130L;
	private int idformapago;
	private String codigo;
	private String descripcion;
	private Set<?> formapagoClientes = new HashSet<Object>(0);

	public Formapago() {
	}

	public Formapago(int idformapago, String codigo, String descripcion) {
		this.idformapago = idformapago;
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public Formapago(int idformapago, String codigo, String descripcion,
			Set<?> formapagoClientes) {
		this.idformapago = idformapago;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.formapagoClientes = formapagoClientes;
	}

	@Id
	@Column(name = "idformapago", unique = true, nullable = false)
	public int getIdformapago() {
		return this.idformapago;
	}

	public void setIdformapago(int idformapago) {
		this.idformapago = idformapago;
	}

	@Column(name = "codigo", unique = true, nullable = false, length = 10)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "descripcion", nullable = false, length = 50)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "formapago")
	public Set<?> getFormapagoClientes() {
		return this.formapagoClientes;
	}

	public void setFormapagoClientes(Set<?> formapagoClientes) {
		this.formapagoClientes = formapagoClientes;
	}

}