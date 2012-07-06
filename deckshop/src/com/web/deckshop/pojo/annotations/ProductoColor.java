package com.web.deckshop.pojo.annotations;

// Generated 05/07/2012 04:39:51 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * ProductoColor generated by hbm2java
 */
@Entity
@Table(name = "producto_color", schema = "web", uniqueConstraints = @UniqueConstraint(columnNames = {
		"idproducto", "idcolor" }))
public class ProductoColor implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1215339131429538829L;
	private int idproductoColor;
	private Color color;
	private Producto producto;
	private short stock;

	public ProductoColor() {
	}

	public ProductoColor(int idproductoColor, Color color, Producto producto,
			short stock) {
		this.idproductoColor = idproductoColor;
		this.color = color;
		this.producto = producto;
		this.stock = stock;
	}

	@Id
	@Column(name = "idproducto_color", unique = true, nullable = false)
	public int getIdproductoColor() {
		return this.idproductoColor;
	}

	public void setIdproductoColor(int idproductoColor) {
		this.idproductoColor = idproductoColor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idcolor", nullable = false)
	public Color getColor() {
		return this.color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idproducto", nullable = false)
	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Column(name = "stock", nullable = false)
	public short getStock() {
		return this.stock;
	}

	public void setStock(short stock) {
		this.stock = stock;
	}

}