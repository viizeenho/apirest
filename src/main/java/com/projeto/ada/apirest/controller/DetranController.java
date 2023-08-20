package com.projeto.ada.apirest.controller;


import com.projeto.ada.apirest.model.Detran;
import com.projeto.ada.apirest.service.DetranService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/detran")
public class DetranController {

    private final DetranService detranService;

    @Autowired
    public DetranController(DetranService detranService) {
        this.detranService = detranService;
    }

    @GetMapping
    public List<Detran> getAllDetrans() {
        return detranService.getAllDetrans();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Detran> getDetranById(@PathVariable Long id) {
        Optional<Detran> detran = detranService.getDetranById(id);
        return detran.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Detran createDetran(@RequestBody Detran detran) {
        return detranService.saveDetran(detran);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Detran> updateDetran(@PathVariable Long id, @RequestBody Detran detran) {
        if (!detranService.getDetranById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        detran.setId(id);
        return ResponseEntity.ok(detranService.saveDetran(detran));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDetran(@PathVariable Long id) {
        if (!detranService.getDetranById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        detranService.deleteDetran(id);
        return ResponseEntity.noContent().build();
    }
}
