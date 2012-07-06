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
 * Statuspedido generated by hbm2java
 */
@Entity
@Table(name = "statuspedido", schema = "web", uniqueConstraints = @UniqueConstraint(columnNames = "codigo"))
public class Statuspedido implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8415705607913226784L;
	private int idstatuspedido;
	private String codigo;
	private String descripcion;
	private Set<?> pedidoStatuspedidos = new HashSet<Object>(0);
	private Set<?> pedidos = new HashSet<Object>(0);

	public Statuspedido() {
	}

	public Statuspedido(int idstatuspedido, String codigo) {
		this.idstatuspedido = idstatuspedido;
		this.codigo = codigo;
	}

	public Statuspedido(int idstatuspedido, String codigo, String descripcion,
			Set<?> pedidoStatuspedidos, Set<?> pedidos) {
		this.idstatuspedido = idstatuspedido;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.pedidoStatuspedidos = pedidoStatuspedidos;
		this.pedidos = pedidos;
	}

	@Id
	@Column(name = "idstatuspedido", unique = true, nullable = false)
	public int getIdstatuspedido() {
		return this.idstatuspedido;
	}

	public void setIdstatuspedido(int idstatuspedido) {
		this.idstatuspedido = idstatuspedido;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "statuspedido")
	public Set<?> getPedidoStatuspedidos() {
		return this.pedidoStatuspedidos;
	}

	public void setPedidoStatuspedidos(Set<?> pedidoStatuspedidos) {
		this.pedidoStatuspedidos = pedidoStatuspedidos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "statuspedido")
	public Set<?> getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(Set<?> pedidos) {
		this.pedidos = pedidos;
	}

}