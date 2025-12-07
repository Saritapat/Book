package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bs;

	@PostMapping("add")
	public void add(@RequestBody Book b) {
		bs.add(b);
	}

	@GetMapping("display")
	public List<Book> display() {
		return bs.display();
	}

	@DeleteMapping("delete = {id}")
	public void delete(@PathVariable Integer id) {
		bs.delete(id);
	}

	@PutMapping("update/ {id}")
	public void update(@PathVariable Integer id, @RequestBody Book b) {
		// TODO: process PUT request

		bs.update(id, b);
	}
}
