package com.example.DOANTHIMYLINH_42200191402.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DOANTHIMYLINH_42200191402.entity.Subject;
import com.example.DOANTHIMYLINH_42200191402.respository.SubjectRespository;

@Service
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	private SubjectRespository subjectRespository;

	@Override
	public List<Subject> getDS() {
		// TODO Auto-generated method stub
		return subjectRespository.findAll();
	}

	@Override
	public void save(Subject subject) {
		subjectRespository.save(subject);

	}


}
