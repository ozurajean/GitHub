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
 * Login generated by hbm2java
 */
@Entity
@Table(name = "login", schema = "web", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Login implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8924678258329797928L;
	private int idlogin;
	private String email;
	private String password;
	private Set<?> personas = new HashSet<Object>(0);
	private Set<?> empresas = new HashSet<Object>(0);

	public Login() {
	}

	public Login(int idlogin, String email, String password) {
		this.idlogin = idlogin;
		this.email = email;
		this.password = password;
	}

	public Login(int idlogin, String email, String password, Set<?> personas,
			Set<?> empresas) {
		this.idlogin = idlogin;
		this.email = email;
		this.password = password;
		this.personas = personas;
		this.empresas = empresas;
	}

	@Id
	@Column(name = "idlogin", unique = true, nullable = false)
	public int getIdlogin() {
		return this.idlogin;
	}

	public void setIdlogin(int idlogin) {
		this.idlogin = idlogin;
	}

	@Column(name = "email", unique = true, nullable = false, length = 20)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", nullable = false, length = 20)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "login")
	public Set<?> getPersonas() {
		return this.personas;
	}

	public void setPersonas(Set<?> personas) {
		this.personas = personas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "login")
	public Set<?> getEmpresas() {
		return this.empresas;
	}

	public void setEmpresas(Set<?> empresas) {
		this.empresas = empresas;
	}

}