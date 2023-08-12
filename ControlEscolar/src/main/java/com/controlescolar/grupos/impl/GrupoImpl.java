package com.controlescolar.grupos.impl;

import org.springframework.stereotype.Service;

import com.controlescolar.grupos.service.IGrupoService;
import com.controlescolar.modelo.GruposEntidad;
@Service
public class GrupoImpl implements IGrupoService {

	@Override
	public void insertaGrupos(GruposEntidad grupos) {
		// TODO Auto-generated method stub
		System.out.println("hice mi primera impresion");
	}

}
