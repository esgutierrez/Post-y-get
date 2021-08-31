/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.dto.usuarioDTO;

/**
 *
 * @author USER
 */
public class usuarioDAO {
     private static final List<usuarioDTO> lista = new ArrayList<>();

    public usuarioDAO() {
        
    }
    public void datosPrueba(){
        usuarioDTO usu = new usuarioDTO("123", "Juan", "ju@gmail.com", "juan123", usuarioDTO.ADMIN);
        usuarioDTO usu2 = new usuarioDTO("456", "Luisa", "lu@gmail.com", "luisa456", usuarioDTO.CLIENTE);
        usuarioDTO usu3 = new usuarioDTO("789", "Martin", "martin@gmail.com", "martin789", usuarioDTO.VENDEDOR);
        lista.add(usu);
        lista.add(usu2);
        lista.add(usu3);
    }
    public boolean crear(usuarioDTO c){
         if(c!=null){
             lista.add(c);
         return true;
    }else{
             return false;
         }
}
    public List<usuarioDTO> readAll(){
        List<usuarioDTO> obj = null;
        obj=usuarioDAO.lista;
        return obj;
    }
}
