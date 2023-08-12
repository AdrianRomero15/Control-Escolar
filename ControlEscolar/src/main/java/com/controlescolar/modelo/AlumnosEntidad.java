package com.controlescolar.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
@Entity
@Table(name="alumnos")
public class AlumnosEntidad {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)


private int id;
	@NotEmpty
	@NotNull
	private String nombre;
	@NotEmpty
	@NotNull
	private String primerapp;
	@NotEmpty
	@NotNull
	private String segundoapp;
	@NotEmpty
	@NotNull
	private String numero;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerapp() {
		return primerapp;
	}
	public void setPrimerapp(String primerapp) {
		this.primerapp = primerapp;
	}
	public String getSegundoapp() {
		return segundoapp;
	}
	public void setSegundoapp(String segundoapp) {
		this.segundoapp = segundoapp;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "SistemaEntidad [id=" + id + ", nombre=" + nombre + ", primerapp=" + primerapp + ", segundoapp="
				+ segundoapp + ", numero=" + numero + "]";
	}

	
}
