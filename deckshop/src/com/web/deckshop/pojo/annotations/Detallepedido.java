package com.web.deckshop.pojo.annotations;

// Generated 05/07/2012 04:39:51 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Detallepedido generated by hbm2java
 */
@Entity
@Table(name = "detallepedido", schema = "web")
public class Detallepedido implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5632680471071568710L;
	private int iddetallepedido;
	private Statusdetallepedido statusdetallepedido;
	private ProductoProveedor productoProveedor;
	private Pedido pedido;
	private short cantidad;
	private double precio;
	private String numerorma;
	private String descripcionrma;
	private Date fecharma;
	private Set<?> detalleenvios = new HashSet<Object>(0);
	private Set<?> detallefacturas = new HashSet<Object>(0);

	public Detallepedido() {
	}

	public Detallepedido(int iddetallepedido,
			Statusdetallepedido statusdetallepedido,
			ProductoProveedor productoProveedor, Pedido pedido, short cantidad,
			double precio) {
		this.iddetallepedido = iddetallepedido;
		this.statusdetallepedido = statusdetallepedido;
		this.productoProveedor = productoProveedor;
		this.pedido = pedido;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public Detallepedido(int iddetallepedido,
			Statusdetallepedido statusdetallepedido,
			ProductoProveedor productoProveedor, Pedido pedido, short cantidad,
			double precio, String numerorma, String descripcionrma,
			Date fecharma, Set<?> detalleenvios, Set<?> detallefacturas) {
		this.iddetallepedido = iddetallepedido;
		this.statusdetallepedido = statusdetallepedido;
		this.productoProveedor = productoProveedor;
		this.pedido = pedido;
		this.cantidad = cantidad;
		this.precio = precio;
		this.numerorma = numerorma;
		this.descripcionrma = descripcionrma;
		this.fecharma = fecharma;
		this.detalleenvios = detalleenvios;
		this.detallefacturas = detallefacturas;
	}

	@Id
	@Column(name = "iddetallepedido", unique = true, nullable = false)
	public int getIddetallepedido() {
		return this.iddetallepedido;
	}

	public void setIddetallepedido(int iddetallepedido) {
		this.iddetallepedido = iddetallepedido;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idstatusdetallepedido", nullable = false)
	public Statusdetallepedido getStatusdetallepedido() {
		return this.statusdetallepedido;
	}

	public void setStatusdetallepedido(Statusdetallepedido statusdetallepedido) {
		this.statusdetallepedido = statusdetallepedido;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idproducto_proveedor", nullable = false)
	public ProductoProveedor getProductoProveedor() {
		return this.productoProveedor;
	}

	public void setProductoProveedor(ProductoProveedor productoProveedor) {
		this.productoProveedor = productoProveedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpedido", nullable = false)
	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Column(name = "cantidad", nullable = false)
	public short getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(short cantidad) {
		this.cantidad = cantidad;
	}

	@Column(name = "precio", nullable = false, scale = 0)
	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Column(name = "numerorma", length = 10)
	public String getNumerorma() {
		return this.numerorma;
	}

	public void setNumerorma(String numerorma) {
		this.numerorma = numerorma;
	}

	@Column(name = "descripcionrma", length = 100)
	public String getDescripcionrma() {
		return this.descripcionrma;
	}

	public void setDescripcionrma(String descripcionrma) {
		this.descripcionrma = descripcionrma;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecharma", length = 13)
	public Date getFecharma() {
		return this.fecharma;
	}

	public void setFecharma(Date fecharma) {
		this.fecharma = fecharma;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "detallepedido")
	public Set<?> getDetalleenvios() {
		return this.detalleenvios;
	}

	public void setDetalleenvios(Set<?> detalleenvios) {
		this.detalleenvios = detalleenvios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "detallepedido")
	public Set<?> getDetallefacturas() {
		return this.detallefacturas;
	}

	public void setDetallefacturas(Set<?> detallefacturas) {
		this.detallefacturas = detallefacturas;
	}

}