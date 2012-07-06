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
 * Material generated by hbm2java
 */
@Entity
@Table(name = "material", schema = "web", uniqueConstraints = @UniqueConstraint(columnNames = "codigo"))
public class Material implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7775589650560521072L;
	private int idmaterial;
	private String codigo;
	private String descripcion;
	private Set<?> productoMaterials = new HashSet<Object>(0);

	public Material() {
	}

	public Material(int idmaterial, String codigo) {
		this.idmaterial = idmaterial;
		this.codigo = codigo;
	}

	public Material(int idmaterial, String codigo, String descripcion,
			Set<?> productoMaterials) {
		this.idmaterial = idmaterial;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.productoMaterials = productoMaterials;
	}

	@Id
	@Column(name = "idmaterial", unique = true, nullable = false)
	public int getIdmaterial() {
		return this.idmaterial;
	}

	public void setIdmaterial(int idmaterial) {
		this.idmaterial = idmaterial;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "material")
	public Set<?> getProductoMaterials() {
		return this.productoMaterials;
	}

	public void setProductoMaterials(Set<?> productoMaterials) {
		this.productoMaterials = productoMaterials;
	}

}