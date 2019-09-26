package com.pr.demoPR.converter;

import org.springframework.stereotype.Component;

import com.pr.demoPR.entity.Curso;
import com.pr.demoPR.model.CursoModel;

@Component("cursoConverter")
public class CursoConverter {
	
	//Entity --> Model
	
	public CursoModel entityModel(Curso curso){
		CursoModel cursoModel = new CursoModel();
		cursoModel.setName(curso.getName());
		cursoModel.setDescription(curso.getDescription());
		cursoModel.setPrice(curso.getPrice());
		cursoModel.setHours(curso.getHours());
		return cursoModel;
	}
	
	//Model --> entity
	
	public Curso model2Entity(CursoModel cursoModel) {
		Curso curso = new Curso();
		curso.setName(cursoModel.getName());
		curso.setDescription(cursoModel.getDescription());
		curso.setPrice(cursoModel.getPrice());
		curso.setHours(cursoModel.getHours());
		return curso;
	}
	
}
