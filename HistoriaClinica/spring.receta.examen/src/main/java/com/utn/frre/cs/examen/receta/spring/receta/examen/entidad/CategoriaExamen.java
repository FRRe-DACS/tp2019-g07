package com.utn.frre.cs.examen.receta.spring.receta.examen.entidad;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Categoria examen: Representa la categoria a la que puede pertenecer un examen
 * 
 * @author Gonza
 * @version 1.0
 */

@Entity
@Table(name = "Categoria_Examen")
public class CategoriaExamen {

	/**
	 * Es el id que identifica un tipo examen en particular
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_EXAMEN")
	private Long cod_examen;

	/**
	 * Es la descripcion del tipo de examen
	 */

	private String descripcionExamen;

	/**
	 * Conjunto de estudios que pertenecen a esta categoria de examen
	 */
	@JsonIgnore
	@OneToMany(mappedBy = "categoriaExamen")
	private Set<CategoriaDatosExamen> categoriaDatosExamen;

	
	
	/**
	 * Constructor por defecto de CategoriaExamen
	 */

	public CategoriaExamen() {

	}
	
	/**
	 * Constructor  de CategoriaExamen para un update particular
	 */

	public CategoriaExamen(Long cod_examen, String descripcionExamen, Set<CategoriaDatosExamen> categoriaDatosExamen) {
		super();
		this.cod_examen = cod_examen;
		this.descripcionExamen = descripcionExamen;
		this.categoriaDatosExamen = categoriaDatosExamen;
	}
	
	/**
	 * Constructor   de CategoriaExamen para in insert particular
	 */

	public CategoriaExamen(String descripcionExamen, Set<CategoriaDatosExamen> categoriaDatosExamen) {
		super();
		this.descripcionExamen = descripcionExamen;
		this.categoriaDatosExamen = categoriaDatosExamen;
	}

	//Getters y Setters--------------------------------------------------------------

	public Long getCod_examen() {
		return cod_examen;
	}


	public void setCod_examen(Long cod_examen) {
		this.cod_examen = cod_examen;
	}


	public String getDescripcionExamen() {
		return descripcionExamen;
	}


	public void setDescripcionExamen(String descripcionExamen) {
		this.descripcionExamen = descripcionExamen;
	}


	public Set<CategoriaDatosExamen> getCategoriaDatosExamen() {
		return categoriaDatosExamen;
	}
	

	public void setCategoriaDatosExamen(Set<CategoriaDatosExamen> categoriaDatosExamen) {
		this.categoriaDatosExamen = categoriaDatosExamen;
	}


	 
	
}