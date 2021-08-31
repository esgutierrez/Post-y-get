/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.dto.contactoDTO;
/**
 *
 * @author USER
 */
public class contactoDAO {
    private static final List<contactoDTO> lista = new ArrayList<>();

    public contactoDAO() {
    }
    
    public boolean crear(contactoDTO c){
         if(c!=null){
             lista.add(c);
         return true;
    }else{
             return false;
         }
}
    public List<contactoDTO> readAll(){
        List<contactoDTO> obj = null;
        obj=contactoDAO.lista;
        return obj;
    }
}
