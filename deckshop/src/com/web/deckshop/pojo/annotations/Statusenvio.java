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
 * Statusenvio generated by hbm2java
 */
@Entity
@Table(name = "statusenvio", schema = "web", uniqueConstraints = @UniqueConstraint(columnNames = "codigo"))
public class Statusenvio implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5919737263983479956L;
	private int idstatusenvio;
	private String codigo;
	private String descripcion;
	private Set<?> envioStatusenvios = new HashSet<Object>(0);
	private Set<?> envios = new HashSet<Object>(0);

	public Statusenvio() {
	}

	public Statusenvio(int idstatusenvio, String codigo) {
		this.idstatusenvio = idstatusenvio;
		this.codigo = codigo;
	}

	public Statusenvio(int idstatusenvio, String codigo, String descripcion,
			Set<?> envioStatusenvios, Set<?> envios) {
		this.idstatusenvio = idstatusenvio;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.envioStatusenvios = envioStatusenvios;
		this.envios = envios;
	}

	@Id
	@Column(name = "idstatusenvio", unique = true, nullable = false)
	public int getIdstatusenvio() {
		return this.idstatusenvio;
	}

	public void setIdstatusenvio(int idstatusenvio) {
		this.idstatusenvio = idstatusenvio;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "statusenvio")
	public Set<?> getEnvioStatusenvios() {
		return this.envioStatusenvios;
	}

	public void setEnvioStatusenvios(Set<?> envioStatusenvios) {
		this.envioStatusenvios = envioStatusenvios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "statusenvio")
	public Set<?> getEnvios() {
		return this.envios;
	}

	public void setEnvios(Set<?> envios) {
		this.envios = envios;
	}

}
