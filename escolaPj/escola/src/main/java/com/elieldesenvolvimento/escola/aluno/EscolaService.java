package com.elieldesenvolvimento.escola.aluno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elieldesenvolvimento.escola.escola.Aluno;
import com.elieldesenvolvimento.escola.escola.AlunoRepository;
import com.elieldesenvolvimento.escola.escola.AlunoService;

@Service
public class EscolaService {

	@Autowired
	public EscolaRepository escolaRepository;

	public List<Escola> findAll() {
		return escolaRepository.findAll();
	}

	public Escola findAllId(Long id) {
		return escolaRepository.findById(id).get();
	}

	public Escola createEscola(Escola escola) {
		return escolaRepository.save(escola);
	}

}
