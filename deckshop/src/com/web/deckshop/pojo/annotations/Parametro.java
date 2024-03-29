package com.web.deckshop.pojo.annotations;

// Generated 05/07/2012 04:39:51 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
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
 * Parametro generated by hbm2java
 */
@Entity
@Table(name = "parametro", schema = "web", uniqueConstraints = @UniqueConstraint(columnNames = {
		"idparametropadre", "idparametro" }))
public class Parametro implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3692162277535106105L;
	private int idparametro;
	private Parametro parametro;
	private String codigo;
	private BigDecimal valor;
	private String descripcion;
	private Set<?> parametros = new HashSet<Object>(0);

	public Parametro() {
	}

	public Parametro(int idparametro, String codigo, BigDecimal valor) {
		this.idparametro = idparametro;
		this.codigo = codigo;
		this.valor = valor;
	}

	public Parametro(int idparametro, Parametro parametro, String codigo,
			BigDecimal valor, String descripcion, Set<?> parametros) {
		this.idparametro = idparametro;
		this.parametro = parametro;
		this.codigo = codigo;
		this.valor = valor;
		this.descripcion = descripcion;
		this.parametros = parametros;
	}

	@Id
	@Column(name = "idparametro", unique = true, nullable = false)
	public int getIdparametro() {
		return this.idparametro;
	}

	public void setIdparametro(int idparametro) {
		this.idparametro = idparametro;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idparametropadre")
	public Parametro getParametro() {
		return this.parametro;
	}

	public void setParametro(Parametro parametro) {
		this.parametro = parametro;
	}

	@Column(name = "codigo", nullable = false, length = 10)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "valor", nullable = false, precision = 18, scale = 4)
	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Column(name = "descripcion", length = 50)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parametro")
	public Set<?> getParametros() {
		return this.parametros;
	}

	public void setParametros(Set<?> parametros) {
		this.parametros = parametros;
	}

}
