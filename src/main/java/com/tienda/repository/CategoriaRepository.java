/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.repository;

import com.tienda.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Juan Jose
 */

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
    // Crea consulta derivada para recuperar los registros de categorías activas
    public List<Categoria> findByActivoTrue();
    
}
