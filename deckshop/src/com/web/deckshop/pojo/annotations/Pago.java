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
 * Pago generated by hbm2java
 */
@Entity
@Table(name = "pago", schema = "web")
public class Pago implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1022156249091935529L;
	private int idpago;
	private Factura factura;
	private Pedido pedido;
	private Statuspago statuspago;
	private FormapagoCliente formapagoCliente;
	private String numeropago;
	private Date fechapago;
	private double valor;
	private Set<?> pagoStatuspagos = new HashSet<Object>(0);

	public Pago() {
	}

	public Pago(int idpago, Pedido pedido, Statuspago statuspago,
			FormapagoCliente formapagoCliente, double valor) {
		this.idpago = idpago;
		this.pedido = pedido;
		this.statuspago = statuspago;
		this.formapagoCliente = formapagoCliente;
		this.valor = valor;
	}

	public Pago(int idpago, Factura factura, Pedido pedido,
			Statuspago statuspago, FormapagoCliente formapagoCliente,
			String numeropago, Date fechapago, double valor, Set<?> pagoStatuspagos) {
		this.idpago = idpago;
		this.factura = factura;
		this.pedido = pedido;
		this.statuspago = statuspago;
		this.formapagoCliente = formapagoCliente;
		this.numeropago = numeropago;
		this.fechapago = fechapago;
		this.valor = valor;
		this.pagoStatuspagos = pagoStatuspagos;
	}

	@Id
	@Column(name = "idpago", unique = true, nullable = false)
	public int getIdpago() {
		return this.idpago;
	}

	public void setIdpago(int idpago) {
		this.idpago = idpago;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idfactura")
	public Factura getFactura() {
		return this.factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpedido", nullable = false)
	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idstatuspago", nullable = false)
	public Statuspago getStatuspago() {
		return this.statuspago;
	}

	public void setStatuspago(Statuspago statuspago) {
		this.statuspago = statuspago;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idformapago_cliente", nullable = false)
	public FormapagoCliente getFormapagoCliente() {
		return this.formapagoCliente;
	}

	public void setFormapagoCliente(FormapagoCliente formapagoCliente) {
		this.formapagoCliente = formapagoCliente;
	}

	@Column(name = "numeropago", length = 20)
	public String getNumeropago() {
		return this.numeropago;
	}

	public void setNumeropago(String numeropago) {
		this.numeropago = numeropago;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechapago", length = 29)
	public Date getFechapago() {
		return this.fechapago;
	}

	public void setFechapago(Date fechapago) {
		this.fechapago = fechapago;
	}

	@Column(name = "valor", nullable = false, scale = 0)
	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pago")
	public Set<?> getPagoStatuspagos() {
		return this.pagoStatuspagos;
	}

	public void setPagoStatuspagos(Set<?> pagoStatuspagos) {
		this.pagoStatuspagos = pagoStatuspagos;
	}

}
