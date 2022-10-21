package com.example.DOANTHIMYLINH_42200191402.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DOANTHIMYLINH_42200191402.entity.Subject;
import com.example.DOANTHIMYLINH_42200191402.service.SubjectService;

@RestController
public class SubjectController {

	@Autowired
	private SubjectService subjectService;

	@GetMapping("/subject")
	List<Subject> getList() {
		return subjectService.getDS();
	}

	@PostMapping("/subject")
	Subject insert(@RequestBody Subject subject) {
		subjectService.save(subject);
		return subject;
	}

}
