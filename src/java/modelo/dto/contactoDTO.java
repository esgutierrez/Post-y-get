/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package modelo.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author USER
 */
public class contactoDTO implements Serializable{

    private String nombre;
    private String correo;
    private String comentario;
    private String asunto;

    public contactoDTO(String nombre, String correo, String asunto, String comentario) {
        this.nombre = nombre;
        this.correo = correo;
        this.comentario = comentario;
        this.asunto = asunto;
    }

    public contactoDTO() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + "Asunto=" + asunto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.correo);
        hash = 37 * hash + Objects.hashCode(this.comentario);
        hash = 37 * hash + Objects.hashCode(this.asunto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final contactoDTO other = (contactoDTO) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.comentario, other.comentario)) {
            return false;
        }
        if (!Objects.equals(this.asunto, other.asunto)) {
            return false;
        }
        return true;
    }

}
