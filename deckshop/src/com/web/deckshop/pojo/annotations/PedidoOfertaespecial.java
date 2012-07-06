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
import javax.persistence.UniqueConstraint;

/**
 * PedidoOfertaespecial generated by hbm2java
 */
@Entity
@Table(name = "pedido_ofertaespecial", schema = "web", uniqueConstraints = @UniqueConstraint(columnNames = {
		"idpedido", "idofertaespecial" }))
public class PedidoOfertaespecial implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1607611583902762712L;
	private int idpedidoOfertaespecial;
	private Ofertaespecial ofertaespecial;
	private Pedido pedido;
	private Date fechaubicacionpedido;
	private short cantidad;
	private double totaldescuento;

	public PedidoOfertaespecial() {
	}

	public PedidoOfertaespecial(int idpedidoOfertaespecial,
			Ofertaespecial ofertaespecial, Pedido pedido,
			Date fechaubicacionpedido, short cantidad, double totaldescuento) {
		this.idpedidoOfertaespecial = idpedidoOfertaespecial;
		this.ofertaespecial = ofertaespecial;
		this.pedido = pedido;
		this.fechaubicacionpedido = fechaubicacionpedido;
		this.cantidad = cantidad;
		this.totaldescuento = totaldescuento;
	}

	@Id
	@Column(name = "idpedido_ofertaespecial", unique = true, nullable = false)
	public int getIdpedidoOfertaespecial() {
		return this.idpedidoOfertaespecial;
	}

	public void setIdpedidoOfertaespecial(int idpedidoOfertaespecial) {
		this.idpedidoOfertaespecial = idpedidoOfertaespecial;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idofertaespecial", nullable = false)
	public Ofertaespecial getOfertaespecial() {
		return this.ofertaespecial;
	}

	public void setOfertaespecial(Ofertaespecial ofertaespecial) {
		this.ofertaespecial = ofertaespecial;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpedido", nullable = false)
	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaubicacionpedido", nullable = false, length = 29)
	public Date getFechaubicacionpedido() {
		return this.fechaubicacionpedido;
	}

	public void setFechaubicacionpedido(Date fechaubicacionpedido) {
		this.fechaubicacionpedido = fechaubicacionpedido;
	}

	@Column(name = "cantidad", nullable = false)
	public short getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(short cantidad) {
		this.cantidad = cantidad;
	}

	@Column(name = "totaldescuento", nullable = false, scale = 0)
	public double getTotaldescuento() {
		return this.totaldescuento;
	}

	public void setTotaldescuento(double totaldescuento) {
		this.totaldescuento = totaldescuento;
	}

}
