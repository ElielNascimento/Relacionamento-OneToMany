package com.elieldesenvolvimento.escola.turma;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurmaService {

	@Autowired
	public TurmaRepository turmaRepository;
	
	public List<Turma> findAll (){
		return turmaRepository.findAll();
	}
	public Turma findAllId (Long id) {
		return turmaRepository.findById(id).get();
	}
	
	public Turma createEscola (Turma escola) {
		return turmaRepository.save(escola);
	}
}
