package com.elieldesenvolvimento.escola.escola;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;

	@GetMapping
	private  List <Aluno> findAll (){
		return alunoService.findAll();
	}
	
	@GetMapping("/{id}")
	private Aluno findById (@PathVariable Long id) {
		return alunoService.findAllId(id);
	}
	
	@PostMapping
	private Aluno createEscola(@RequestBody Aluno aluno) {
		return alunoService.createEscola(aluno);
	}
	
	@PostMapping("/{idEscola}")
	private Aluno associar (@PathVariable Long idEscola, @RequestBody Aluno aluno ) {
		return alunoService.associar(idEscola,aluno);
		
	}

}
