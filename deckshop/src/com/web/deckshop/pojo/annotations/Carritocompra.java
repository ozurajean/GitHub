package com.web.deckshop.pojo.annotations;

// Generated 05/07/2012 04:39:51 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Carritocompra generated by hbm2java
 */
@Entity
@Table(name = "carritocompra", schema = "web")
public class Carritocompra implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4684420535851483979L;
	private int idcarritocompra;
	private Producto producto;
	private Cliente cliente;
	private short cantidad;
	private double precioreferencia;
	private Date fechaagregado;
	private boolean postergado;

	public Carritocompra() {
	}

	public Carritocompra(int idcarritocompra, Producto producto,
			Cliente cliente, short cantidad, double precioreferencia,
			boolean postergado) {
		this.idcarritocompra = idcarritocompra;
		this.producto = producto;
		this.cliente = cliente;
		this.cantidad = cantidad;
		this.precioreferencia = precioreferencia;
		this.postergado = postergado;
	}

	public Carritocompra(int idcarritocompra, Producto producto,
			Cliente cliente, short cantidad, double precioreferencia,
			Date fechaagregado, boolean postergado) {
		this.idcarritocompra = idcarritocompra;
		this.producto = producto;
		this.cliente = cliente;
		this.cantidad = cantidad;
		this.precioreferencia = precioreferencia;
		this.fechaagregado = fechaagregado;
		this.postergado = postergado;
	}

	@Id
	@Column(name = "idcarritocompra", unique = true, nullable = false)
	public int getIdcarritocompra() {
		return this.idcarritocompra;
	}

	public void setIdcarritocompra(int idcarritocompra) {
		this.idcarritocompra = idcarritocompra;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idproducto", nullable = false)
	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idcliente", nullable = false)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Column(name = "cantidad", nullable = false)
	public short getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(short cantidad) {
		this.cantidad = cantidad;
	}

	@Column(name = "precioreferencia", nullable = false, scale = 0)
	public double getPrecioreferencia() {
		return this.precioreferencia;
	}

	public void setPrecioreferencia(double precioreferencia) {
		this.precioreferencia = precioreferencia;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fechaagregado", length = 13)
	public Date getFechaagregado() {
		return this.fechaagregado;
	}

	public void setFechaagregado(Date fechaagregado) {
		this.fechaagregado = fechaagregado;
	}

	@Column(name = "postergado", nullable = false)
	public boolean isPostergado() {
		return this.postergado;
	}

	public void setPostergado(boolean postergado) {
		this.postergado = postergado;
	}

}
