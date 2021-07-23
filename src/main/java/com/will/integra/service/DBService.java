package com.will.integra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import com.will.integra.domain.Marca;
import com.will.integra.domain.Patrimonio;
import com.will.integra.domain.Usuario;
import com.will.integra.repositories.MarcaRepository;
import com.will.integra.repositories.PatrimonioRepository;
import com.will.integra.repositories.UsuarioRepository;

@Service
public class DBService {

	@Autowired
	private PatrimonioRepository pRepository;

	@Autowired
	private MarcaRepository mRepository;

	@Autowired
	private UsuarioRepository uRepository;

	public void instanciaBaseDeDados() {

		Patrimonio pat1 = new Patrimonio("teste1", "destest", null);
		Patrimonio pat2 = new Patrimonio("teste2", "destest2", null);
		Patrimonio pat3 = new Patrimonio("teste3", "destest3", null);

		Marca l1 = new Marca("dell", null, pat2);
		Marca l2 = new Marca("asus", null, pat1);
		Marca l3 = new Marca("samsung", null, pat3);

		Usuario us1 = new Usuario(null,"test1", "email1", "senha1");
		Usuario us2 = new Usuario(null,"test2", "email2", "senha2");
		Usuario us3 = new Usuario(null,"test3", "email3", "senha3");

		pat1.getMarcaId().addAll(Arrays.asList(l2));
		pat2.getMarcaId().addAll(Arrays.asList(l1));
		pat3.getMarcaId().addAll(Arrays.asList(l3));

		this.pRepository.saveAll(Arrays.asList(pat1, pat2, pat3));
		this.mRepository.saveAll(Arrays.asList(l1, l2, l3));
		this.uRepository.saveAll(Arrays.asList(us1, us2, us3));

	}

}
