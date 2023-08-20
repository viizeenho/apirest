package com.projeto.ada.apirest.service;

import com.projeto.ada.apirest.model.Detran;
import com.projeto.ada.apirest.repository.DetranRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetranService {

    private final DetranRepository detranRepository;

    @Autowired
    public DetranService(DetranRepository detranRepository) {
        this.detranRepository = detranRepository;
    }

    public List<Detran> getAllDetrans() {
        return detranRepository.findAll();
    }

    public Optional<Detran> getDetranById(Long id) {
        return detranRepository.findById(id);
    }

    public Detran saveDetran(Detran detran) {
        return detranRepository.save(detran);
    }

    public void deleteDetran(Long id) {
        detranRepository.deleteById(id);
    }
}
