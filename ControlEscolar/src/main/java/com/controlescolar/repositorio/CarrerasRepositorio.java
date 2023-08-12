package com.controlescolar.repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.controlescolar.modelo.CarrerasEntidad;

public interface CarrerasRepositorio extends CrudRepository<CarrerasEntidad, Integer>{
 
 
}
