package com.devsuperior.userdept.entities.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.userdept.entities.User;
import com.devsuperior.userdept.repositories.UserRepository;

@RestController /*Configura a classe para ser um crontrolador e responde por requisições*/
@RequestMapping(value = "/users") /*Qual caminho esse controle vai responder*/
public class UserController {
	
	@Autowired /*anotacao para que nao eu nao precise instacnciar obj new....*/
	private UserRepository repository;
	
	/*Busca todos os usuarios do banco de dados*/
	@GetMapping /*Requisicao que o verbo é o GET*/
	public List<User> findAll(){
		List<User> result = repository.findAll();
		return result;
	}
	
	/*Busca um usuario*/
	@GetMapping(value = "/{id}") /*Requisicao que o verbo é o GET*/
	public User findById(@PathVariable Long id){
		User result = repository.findById(id).get();
		return result;
	}
	
	/*Post - para salvar algo novo*/
	/*@RequestBody vai ser o corpo da requisicao*/
	@PostMapping
	public User insert(@RequestBody User user){
		User result = repository.save(user);
		return result;
	}
	
	
	
}
