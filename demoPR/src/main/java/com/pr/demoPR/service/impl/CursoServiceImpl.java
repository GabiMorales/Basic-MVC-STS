package com.pr.demoPR.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.pr.demoPR.entity.Curso;
import com.pr.demoPR.repository.CursoJpaRepository;
import com.pr.demoPR.service.CursoService;

@Service("cursoServiceImpl")
public class CursoServiceImpl implements CursoService {

	private static final Log LOG = LogFactory.getLog(CursoServiceImpl.class);
	
	@Autowired
	@Qualifier("cursoJpaRepository")
	private CursoJpaRepository cursoJpaRepository;
	
	@Override
	public List<Curso> listAllCursos() {
		LOG.info("Call: " + "listAllCurso()");
		return cursoJpaRepository.findAll();
	}

	@Override
	public Curso addCurso(Curso curso) {
		return cursoJpaRepository.save(curso);
	}

	@Override
	public int removeCurso(int id) {
		cursoJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public Curso updateCurso(Curso curso) {
		return cursoJpaRepository.save(curso);
	}

}
