package com.elieldesenvolvimento.escola.escola;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elieldesenvolvimento.escola.aluno.Escola;
import com.elieldesenvolvimento.escola.aluno.EscolaRepository;

@Service
public class AlunoService {

	@Autowired
	public AlunoRepository alunoRepository;

	@Autowired
	public EscolaRepository escolarRepository;

	public List<Aluno> findAll() {
		return alunoRepository.findAll();
	}

	public Aluno findAllId(Long id) {
		return alunoRepository.findById(id).get();
	}

	public Aluno createEscola(Aluno aluno) {
		return alunoRepository.save(aluno);
	}

	public Aluno associar(Long idEscola, Aluno aluno) {

		Aluno aluno1 = new Aluno();
		aluno1.setNomeAluno(aluno.getNomeAluno());
		aluno1.setCpfAluno(aluno.getCpfAluno());

		alunoRepository.save(aluno);

		Escola escola = escolarRepository.findById(idEscola).get();
		escola.setNome("iraci");
		escola.setCpf("4444");
		escola.getAlunoList().add(aluno);

		escolarRepository.save(escola);

		return aluno;

	}
}
