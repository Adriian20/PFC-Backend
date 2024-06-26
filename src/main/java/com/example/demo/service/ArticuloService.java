package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ArticuloDTO;

public interface ArticuloService {
    
    List<ArticuloDTO> getAll();

    ArticuloDTO findById(ArticuloDTO articuloDTO);

    void updateStock(Long id);

    List<ArticuloDTO> findByCategoria(Long categoriaId);
}
