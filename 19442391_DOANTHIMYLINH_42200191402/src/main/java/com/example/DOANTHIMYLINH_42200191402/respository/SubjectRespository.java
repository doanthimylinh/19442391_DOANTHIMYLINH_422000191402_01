package com.example.DOANTHIMYLINH_42200191402.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DOANTHIMYLINH_42200191402.entity.Subject;


@Repository
public interface SubjectRespository extends JpaRepository<Subject, String> {

}
