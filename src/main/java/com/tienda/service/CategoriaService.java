/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Categoria;
import com.tienda.repository.CategoriaRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Juan Jose
 */
@Service
@RequiredArgsConstructor
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;
    
    //Leer registros de tabla categoría
    @Transactional(readOnly=true)
    public List<Categoria> getCategorias(boolean activo){ //El flag si true devuelve categorias activas, else todas.
        if(activo){
            return categoriaRepository.findByActivoTrue();
        }
        else{
            return categoriaRepository.findAll();
        }
    }
}
