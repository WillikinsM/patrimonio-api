package com.will.integra.resources;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.will.integra.domain.Patrimonio;
import com.will.integra.service.PatrimonioService;

@CrossOrigin(value = "/*")
@RestController
@RequestMapping(value = "/patrimonio")
public class PatrimonioResource {

	@Autowired
	private PatrimonioService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Patrimonio> findById(@PathVariable Integer id) {
		Patrimonio obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping
	public ResponseEntity<List<Patrimonio>> findAll() {
		List<Patrimonio> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	
	@PostMapping
	public ResponseEntity<Patrimonio> create(@Valid @RequestBody Patrimonio obj) {
		obj = service.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getNumeroTombo()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Patrimonio> update(@Valid @PathVariable Integer id, @RequestBody Patrimonio newObj) {
		Patrimonio obj1 = service.update(id, newObj);
		return ResponseEntity.ok().body(obj1);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
