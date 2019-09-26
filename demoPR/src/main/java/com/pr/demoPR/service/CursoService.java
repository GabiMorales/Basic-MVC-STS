package com.pr.demoPR.service;

import java.util.List;

import com.pr.demoPR.entity.Curso;

public interface CursoService {

	public abstract List<Curso> listAllCursos();
	public abstract Curso addCurso(Curso curso);
	public abstract int removeCurso(int id);
	public abstract Curso updateCurso(Curso curso);
}
