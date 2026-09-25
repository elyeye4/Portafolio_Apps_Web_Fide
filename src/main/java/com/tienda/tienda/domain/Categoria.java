/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.tienda.tienda.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
/**
 *
 * @author Juan Jose
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="categoria")
public class Categoria {
    private Integer idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;
}
