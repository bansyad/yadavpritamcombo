package com.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.books.dtos.AuthorDto;
import com.books.services.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorControllers {

	@Autowired
	private AuthorService authorService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createAuthor(@RequestBody AuthorDto authorDto) {
		authorService.createAuthor(authorDto);

	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public AuthorDto getAuthorById(@RequestParam(value = "id", required = true) Long authorId,
			@RequestParam(value = "name", required = false) String name) {
		System.out.println("id : " + authorId + " , name : " + name);
		return authorService.getAuthorById(authorId);
	}
	
	 @RequestMapping(value ="/{id}/detail", method = RequestMethod.GET) public
	  AuthorDto getAuthorFromId( @PathVariable(value="id") Long authorId,
	  
	  @RequestHeader(value="auth-token") String authToken) {
	  System.out.println("auth token : " + authToken); 
	  return authorService.getAuthorFromId(authorId); }

	
		
}