package com.books.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.books.dtos.AuthorDto;

@Service
public class AuthorService {

	public void createAuthor(AuthorDto authorDto) {
		System.out.println(authorDto.toString());
	}

	public AuthorDto getAuthorById(Long id) {

		AuthorDto author = new AuthorDto();
		author.setName("HBK");
		author.setGenre("Drama");
		author.setCountry("UNknown");

		return author;
	}

	public AuthorDto getAuthorFromId(Long Id) {
		AuthorDto author = new AuthorDto();
		author.setName("bhk");
		author.setGenre("suspense");
		author.setCountry("UNknown");

		return author;

	}
}