package com.projeto_integrador.projeto_integrador.modules.subjects.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto_integrador.projeto_integrador.modules.subjects.repository.SubjectRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class DeleteSubjectById {

    @Autowired
    SubjectRepository repository;
    
    public void execute(Long id) {
        if (this.repository.existsById(id)) {
            this.repository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Subject not found");
        }
    }
}
