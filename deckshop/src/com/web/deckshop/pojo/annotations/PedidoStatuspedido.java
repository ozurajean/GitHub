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
 * PedidoStatuspedido generated by hbm2java
 */
@Entity
@Table(name = "pedido_statuspedido", schema = "web")
public class PedidoStatuspedido implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5560249805598437889L;
	private int idpedidoStatuspedido;
	private Statuspedido statuspedido;
	private Pedido pedido;
	private Date fecha;
	private String comentarios;

	public PedidoStatuspedido() {
	}

	public PedidoStatuspedido(int idpedidoStatuspedido,
			Statuspedido statuspedido, Pedido pedido, Date fecha) {
		this.idpedidoStatuspedido = idpedidoStatuspedido;
		this.statuspedido = statuspedido;
		this.pedido = pedido;
		this.fecha = fecha;
	}

	public PedidoStatuspedido(int idpedidoStatuspedido,
			Statuspedido statuspedido, Pedido pedido, Date fecha,
			String comentarios) {
		this.idpedidoStatuspedido = idpedidoStatuspedido;
		this.statuspedido = statuspedido;
		this.pedido = pedido;
		this.fecha = fecha;
		this.comentarios = comentarios;
	}

	@Id
	@Column(name = "idpedido_statuspedido", unique = true, nullable = false)
	public int getIdpedidoStatuspedido() {
		return this.idpedidoStatuspedido;
	}

	public void setIdpedidoStatuspedido(int idpedidoStatuspedido) {
		this.idpedidoStatuspedido = idpedidoStatuspedido;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idstatuspedido", nullable = false)
	public Statuspedido getStatuspedido() {
		return this.statuspedido;
	}

	public void setStatuspedido(Statuspedido statuspedido) {
		this.statuspedido = statuspedido;
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
	@Column(name = "fecha", nullable = false, length = 29)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "comentarios", length = 500)
	public String getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

}