package org.generation.blogPessoal.controller;

import java.util.List;

import org.generation.blogPessoal.Repository.PostagemRespository;
import org.generation.blogPessoal.model.Postagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@RequestMapping ("/postagens")
@CrossOrigin("*")
public class Postagemcontroller {
	
	@Autowired
	private PostagemRespository repository;
	
	@GetMapping
	public ResponseEntity<List<Postagem>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Postagem> GetById(@PathVariable id){
		return repository.findById(id).map(resp ->ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build();
		
		@GetMapping
		public ResponseEntity<List<Postagem>> GetByTitulo(@PathVariable String postagem){
			String titulo;
			return ResponseEntity.ok(repository.FindAllByTituloContainingIgnoreCase(titulo));
		}
		
				@PostMapping responseEntity<Postagem> post1 (@RequestBody postagem){
					return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
					
					@PutMapping
					public ResponseEntity<Postagem> post (@RequestBody postagem){
						return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}
	
	
				@DeleteMapping ("/{id}")
				public void delete(@PathVariable long id) {
				repository.deleteById(id);
}
