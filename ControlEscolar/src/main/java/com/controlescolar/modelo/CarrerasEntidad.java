package com.controlescolar.modelo;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="carreras")
public class CarrerasEntidad {
	@Autowired
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String carrera;
private String clave;
private String modalidad;
private int  id_carrera;
private String rvoe;
private String fecha_rvoe;
private Double calificacion_minima;
private Double calificacion_maxima;
private Double calificacion_minima_aprobatoria;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCarrera() {
	return carrera;
}
public void setCarrera(String carrera) {
	this.carrera = carrera;
}
public String getClave() {
	return clave;
}
public void setClave(String clave) {
	this.clave = clave;
}
public String getModalidad() {
	return modalidad;
}
public void setModalidad(String modalidad) {
	this.modalidad = modalidad;
}
public int getId_carrera() {
	return id_carrera;
}
public void setId_carrera(int id_carrera) {
	this.id_carrera = id_carrera;
}
public String getRvoe() {
	return rvoe;
}
public void setRvoe(String rvoe) {
	this.rvoe = rvoe;
}
public String getFecha_rvoe() {
	return fecha_rvoe;
}
public void setFecha_rvoe(String fecha_rvoe) {
	this.fecha_rvoe = fecha_rvoe;
}
public Double getCalificacion_minima() {
	return calificacion_minima;
}
public void setCalificacion_minima(Double calificacion_minima) {
	this.calificacion_minima = calificacion_minima;
}
public Double getCalificacion_maxima() {
	return calificacion_maxima;
}
public void setCalificacion_maxima(Double calificacion_maxima) {
	this.calificacion_maxima = calificacion_maxima;
}
public Double getCalificacion_minima_aprobatoria() {
	return calificacion_minima_aprobatoria;
}
public void setCalificacion_minima_aprobatoria(Double calificacion_minima_aprobatoria) {
	this.calificacion_minima_aprobatoria = calificacion_minima_aprobatoria;
}
@Override
public String toString() {
	return "CarrerasEntidad [id=" + id + ", carrera=" + carrera + ", clave=" + clave + ", modalidad=" + modalidad
			+ ", id_carrera=" + id_carrera + ", rvoe=" + rvoe + ", fecha_rvoe=" + fecha_rvoe + ", calificacion_minima="
			+ calificacion_minima + ", calificacion_maxima=" + calificacion_maxima
			+ ", calificacion_minima_aprobatoria=" + calificacion_minima_aprobatoria + "]";
}

}
