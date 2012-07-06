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
 * Persona generated by hbm2java
 */
@Entity
@Table(name = "persona", schema = "web", uniqueConstraints = {
		@UniqueConstraint(columnNames = "idcliente"),
		@UniqueConstraint(columnNames = "idlogin"),
		@UniqueConstraint(columnNames = "idproveedor"),
		@UniqueConstraint(columnNames = "identificacion") })
public class Persona implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8287606914986205196L;
	private int idpersona;
	private Proveedor proveedor;
	private Login login;
	private Cliente cliente;
	private String identificacion;
	private String nombres;
	private String apellidos;
	private char genero;
	private Set<?> transaccioncontables = new HashSet<Object>(0);

	public Persona() {
	}

	public Persona(int idpersona, Login login, String identificacion,
			String nombres, String apellidos, char genero) {
		this.idpersona = idpersona;
		this.login = login;
		this.identificacion = identificacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.genero = genero;
	}

	public Persona(int idpersona, Proveedor proveedor, Login login,
			Cliente cliente, String identificacion, String nombres,
			String apellidos, char genero, Set<?> transaccioncontables) {
		this.idpersona = idpersona;
		this.proveedor = proveedor;
		this.login = login;
		this.cliente = cliente;
		this.identificacion = identificacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.genero = genero;
		this.transaccioncontables = transaccioncontables;
	}

	@Id
	@Column(name = "idpersona", unique = true, nullable = false)
	public int getIdpersona() {
		return this.idpersona;
	}

	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idproveedor", unique = true)
	public Proveedor getProveedor() {
		return this.proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idlogin", unique = true, nullable = false)
	public Login getLogin() {
		return this.login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idcliente", unique = true)
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Column(name = "identificacion", unique = true, nullable = false, length = 20)
	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	@Column(name = "nombres", nullable = false, length = 50)
	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	@Column(name = "apellidos", nullable = false, length = 50)
	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Column(name = "genero", nullable = false, length = 1)
	public char getGenero() {
		return this.genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	public Set<?> getTransaccioncontables() {
		return this.transaccioncontables;
	}

	public void setTransaccioncontables(Set<?> transaccioncontables) {
		this.transaccioncontables = transaccioncontables;
	}

}