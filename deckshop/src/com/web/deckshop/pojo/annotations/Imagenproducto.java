package com.web.deckshop.pojo.annotations;

// Generated 05/07/2012 04:39:51 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Imagenproducto generated by hbm2java
 */
@Entity
@Table(name = "imagenproducto", schema = "web")
public class Imagenproducto implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 699637755455193870L;
	private int idimagenproducto;
	private Producto producto;
	private byte[] imagen;

	public Imagenproducto() {
	}

	public Imagenproducto(int idimagenproducto, Producto producto, byte[] imagen) {
		this.idimagenproducto = idimagenproducto;
		this.producto = producto;
		this.imagen = imagen;
	}

	@Id
	@Column(name = "idimagenproducto", unique = true, nullable = false)
	public int getIdimagenproducto() {
		return this.idimagenproducto;
	}

	public void setIdimagenproducto(int idimagenproducto) {
		this.idimagenproducto = idimagenproducto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idproducto", nullable = false)
	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Column(name = "imagen", nullable = false)
	public byte[] getImagen() {
		return this.imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

}
