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
 * Statusdetallefactura generated by hbm2java
 */
@Entity
@Table(name = "statusdetallefactura", schema = "web", uniqueConstraints = @UniqueConstraint(columnNames = "codigo"))
public class Statusdetallefactura implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3112085890334824478L;
	private int idstatusdetallefactura;
	private String codigo;
	private String descripcion;
	private Set<?> detallefacturas = new HashSet<Object>(0);

	public Statusdetallefactura() {
	}

	public Statusdetallefactura(int idstatusdetallefactura, String codigo) {
		this.idstatusdetallefactura = idstatusdetallefactura;
		this.codigo = codigo;
	}

	public Statusdetallefactura(int idstatusdetallefactura, String codigo,
			String descripcion, Set<?> detallefacturas) {
		this.idstatusdetallefactura = idstatusdetallefactura;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.detallefacturas = detallefacturas;
	}

	@Id
	@Column(name = "idstatusdetallefactura", unique = true, nullable = false)
	public int getIdstatusdetallefactura() {
		return this.idstatusdetallefactura;
	}

	public void setIdstatusdetallefactura(int idstatusdetallefactura) {
		this.idstatusdetallefactura = idstatusdetallefactura;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "statusdetallefactura")
	public Set<?> getDetallefacturas() {
		return this.detallefacturas;
	}

	public void setDetallefacturas(Set<?> detallefacturas) {
		this.detallefacturas = detallefacturas;
	}

}
