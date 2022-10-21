package com.example.DOANTHIMYLINH_42200191402.service;

import java.util.List;

import com.example.DOANTHIMYLINH_42200191402.entity.Subject;

public interface SubjectService {
	List<Subject> getDS();
	void save(Subject subject);
}
