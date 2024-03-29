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
 * Color generated by hbm2java
 */
@Entity
@Table(name = "color", schema = "web", uniqueConstraints = @UniqueConstraint(columnNames = "codigo"))
public class Color implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5324025813929055935L;
	private int idcolor;
	private String codigo;
	private String descripcion;
	private Set<?> productoColors = new HashSet<Object>(0);

	public Color() {
	}

	public Color(int idcolor, String codigo) {
		this.idcolor = idcolor;
		this.codigo = codigo;
	}

	public Color(int idcolor, String codigo, String descripcion,
			Set<?> productoColors) {
		this.idcolor = idcolor;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.productoColors = productoColors;
	}

	@Id
	@Column(name = "idcolor", unique = true, nullable = false)
	public int getIdcolor() {
		return this.idcolor;
	}

	public void setIdcolor(int idcolor) {
		this.idcolor = idcolor;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "color")
	public Set<?> getProductoColors() {
		return this.productoColors;
	}

	public void setProductoColors(Set<?> productoColors) {
		this.productoColors = productoColors;
	}

}
