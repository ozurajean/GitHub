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
import javax.persistence.UniqueConstraint;

/**
 * Tipoproducto generated by hbm2java
 */
@Entity
@Table(name = "tipoproducto", schema = "web", uniqueConstraints = @UniqueConstraint(columnNames = {
		"idtipoproductopadre", "idtipoproducto" }))
public class Tipoproducto implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2229426823178805087L;
	private int idtipoproducto;
	private Tipoproducto tipoproducto;
	private String codigo;
	private String descripcion;
	private Set<?> productos = new HashSet<Object>(0);
	private Set<?> tipoproductos = new HashSet<Object>(0);

	public Tipoproducto() {
	}

	public Tipoproducto(int idtipoproducto, String codigo) {
		this.idtipoproducto = idtipoproducto;
		this.codigo = codigo;
	}

	public Tipoproducto(int idtipoproducto, Tipoproducto tipoproducto,
			String codigo, String descripcion, Set<?> productos, Set<?> tipoproductos) {
		this.idtipoproducto = idtipoproducto;
		this.tipoproducto = tipoproducto;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.productos = productos;
		this.tipoproductos = tipoproductos;
	}

	@Id
	@Column(name = "idtipoproducto", unique = true, nullable = false)
	public int getIdtipoproducto() {
		return this.idtipoproducto;
	}

	public void setIdtipoproducto(int idtipoproducto) {
		this.idtipoproducto = idtipoproducto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idtipoproductopadre")
	public Tipoproducto getTipoproducto() {
		return this.tipoproducto;
	}

	public void setTipoproducto(Tipoproducto tipoproducto) {
		this.tipoproducto = tipoproducto;
	}

	@Column(name = "codigo", nullable = false, length = 10)
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoproducto")
	public Set<?> getProductos() {
		return this.productos;
	}

	public void setProductos(Set<?> productos) {
		this.productos = productos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoproducto")
	public Set<?> getTipoproductos() {
		return this.tipoproductos;
	}

	public void setTipoproductos(Set<?> tipoproductos) {
		this.tipoproductos = tipoproductos;
	}

}
