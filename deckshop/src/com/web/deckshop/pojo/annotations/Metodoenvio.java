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
 * Metodoenvio generated by hbm2java
 */
@Entity
@Table(name = "metodoenvio", schema = "web", uniqueConstraints = @UniqueConstraint(columnNames = "codigo"))
public class Metodoenvio implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8889395789103561061L;
	private int idmetodoenvio;
	private String codigo;
	private String descripcion;
	private Set<?> envios = new HashSet<Object>(0);

	public Metodoenvio() {
	}

	public Metodoenvio(int idmetodoenvio, String codigo) {
		this.idmetodoenvio = idmetodoenvio;
		this.codigo = codigo;
	}

	public Metodoenvio(int idmetodoenvio, String codigo, String descripcion,
			Set<?> envios) {
		this.idmetodoenvio = idmetodoenvio;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.envios = envios;
	}

	@Id
	@Column(name = "idmetodoenvio", unique = true, nullable = false)
	public int getIdmetodoenvio() {
		return this.idmetodoenvio;
	}

	public void setIdmetodoenvio(int idmetodoenvio) {
		this.idmetodoenvio = idmetodoenvio;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "metodoenvio")
	public Set<?> getEnvios() {
		return this.envios;
	}

	public void setEnvios(Set<?> envios) {
		this.envios = envios;
	}

}
