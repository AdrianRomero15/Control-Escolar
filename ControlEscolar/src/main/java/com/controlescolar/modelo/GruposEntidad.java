package com.controlescolar.modelo;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="grupos")
public class GruposEntidad {
	@Autowired
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private String nombregrupo;
private String cicloinicial;
private int idcarrera;
private int fechainiciocuatrimestre	;
public String getNombregrupo() {
	return nombregrupo;
}
public void setNombregrupo(String nombregrupo) {
	this.nombregrupo = nombregrupo;
}
public String getCicloinicial() {
	return cicloinicial;
}
public void setCicloinicial(String cicloinicial) {
	this.cicloinicial = cicloinicial;
}
public int getIdcarrera() {
	return idcarrera;
}
public void setIdcarrera(int idcarrera) {
	this.idcarrera = idcarrera;
}
public int getFechainiciocuatrimestre() {
	return fechainiciocuatrimestre;
}
public void setFechainiciocuatrimestre(int fechainiciocuatrimestre) {
	this.fechainiciocuatrimestre = fechainiciocuatrimestre;
}
@Override
public String toString() {
	return "GruposEntidad [nombregrupo=" + nombregrupo + ", cicloinicial=" + cicloinicial + ", idcarrera=" + idcarrera
			+ ", fechainiciocuatrimestre=" + fechainiciocuatrimestre + "]";
}

}
