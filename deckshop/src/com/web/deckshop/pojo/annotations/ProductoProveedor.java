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
 * ProductoProveedor generated by hbm2java
 */
@Entity
@Table(name = "producto_proveedor", schema = "web", uniqueConstraints = @UniqueConstraint(columnNames = {
		"id_producto", "id_proveedor" }))
public class ProductoProveedor implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4026031929301858813L;
	private int idproductoProveedor;
	private Producto producto;
	private Proveedor proveedor;
	private double precio;
	private short stock;
	private Set<?> ofertaespecials = new HashSet<Object>(0);
	private Set<?> detallepedidos = new HashSet<Object>(0);

	public ProductoProveedor() {
	}

	public ProductoProveedor(int idproductoProveedor, Producto producto,
			Proveedor proveedor, double precio, short stock) {
		this.idproductoProveedor = idproductoProveedor;
		this.producto = producto;
		this.proveedor = proveedor;
		this.precio = precio;
		this.stock = stock;
	}

	public ProductoProveedor(int idproductoProveedor, Producto producto,
			Proveedor proveedor, double precio, short stock,
			Set<?> ofertaespecials, Set<?> detallepedidos) {
		this.idproductoProveedor = idproductoProveedor;
		this.producto = producto;
		this.proveedor = proveedor;
		this.precio = precio;
		this.stock = stock;
		this.ofertaespecials = ofertaespecials;
		this.detallepedidos = detallepedidos;
	}

	@Id
	@Column(name = "idproducto_proveedor", unique = true, nullable = false)
	public int getIdproductoProveedor() {
		return this.idproductoProveedor;
	}

	public void setIdproductoProveedor(int idproductoProveedor) {
		this.idproductoProveedor = idproductoProveedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_producto", nullable = false)
	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_proveedor", nullable = false)
	public Proveedor getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@Column(name = "precio", nullable = false, scale = 0)
	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Column(name = "stock", nullable = false)
	public short getStock() {
		return this.stock;
	}

	public void setStock(short stock) {
		this.stock = stock;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productoProveedor")
	public Set<?> getOfertaespecials() {
		return this.ofertaespecials;
	}

	public void setOfertaespecials(Set<?> ofertaespecials) {
		this.ofertaespecials = ofertaespecials;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productoProveedor")
	public Set<?> getDetallepedidos() {
		return this.detallepedidos;
	}

	public void setDetallepedidos(Set<?> detallepedidos) {
		this.detallepedidos = detallepedidos;
	}

}
