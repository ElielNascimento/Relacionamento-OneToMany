package com.elieldesenvolvimento.escola.escola;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.elieldesenvolvimento.escola.aluno.Escola;

@Entity
@Table(name = "tb_aluno")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeAluno;
	private String cpfAluno;

	public Aluno() {
	}

	public Aluno(String nomeAluno, String cpfAluno) {
		super();
		this.nomeAluno = nomeAluno;
		this.cpfAluno = cpfAluno;
	}


	public String getNomeAluno() {
		return nomeAluno;
	}


	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}


	public String getCpfAluno() {
		return cpfAluno;
	}


	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}


	public Long getId() {
		return id;
	}

}
