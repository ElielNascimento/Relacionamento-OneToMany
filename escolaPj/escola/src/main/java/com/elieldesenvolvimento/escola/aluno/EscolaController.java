package com.elieldesenvolvimento.escola.aluno;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elieldesenvolvimento.escola.escola.Aluno;
import com.elieldesenvolvimento.escola.escola.AlunoRepository;
import com.elieldesenvolvimento.escola.escola.AlunoService;

@RestController
@RequestMapping("api/escola")
public class EscolaController {

	@Autowired
	private EscolaService escolaService;

	@GetMapping
	private List<Escola> findAll() {
		return escolaService.findAll();
	}

	@GetMapping("/{id}")
	private Escola findById(@PathVariable Long id) {
		return escolaService.findAllId(id);
	}

	@PostMapping
	private Escola createEscola(@RequestBody Escola escola) {
		return escolaService.createEscola(escola);
	}
}
