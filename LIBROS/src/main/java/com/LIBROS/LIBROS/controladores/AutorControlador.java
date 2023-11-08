
package com.LIBROS.LIBROS.controladores;

import com.LIBROS.LIBROS.entidades.Autor;
import com.LIBROS.LIBROS.exepciones.MiExeption;
import com.LIBROS.LIBROS.servicios.AutorServicio;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/autor")//localhost:8080/autor/
public class AutorControlador {
    @Autowired  
    private AutorServicio autorServicio;
    
    @GetMapping("/registrar")//localhost:8080/autor/registrar
    public String registrar(){
        
        return "autor_form.html";
    }

    
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre){
    
       try {
            autorServicio.crearAutor(nombre);
        } catch (MiExeption ex) {
            Logger.getLogger(AutorControlador.class.getName()).log(Level.SEVERE, null, ex);
           return "autor_form.html";
        }

       return "index.html";
    }
    
    
    
    @GetMapping("/lista")
    public String listar(ModelMap modelo){
        
        List <Autor> autores = autorServicio.ListarAutor();
        modelo.addAttribute("autores", autores);
        return "autor_list.html";
                
    }//http://localhost:8080/#
 @GetMapping("/modificar/{id}")
 public String modificar(@PathVariable String id, ModelMap modelo){

modelo.put("autor", autorServicio.getOne(id));
return "autor_modificar.html";
 }
 
  @PostMapping("/modificar/{id}")
 public String modificar(@PathVariable String id,String nombre ,ModelMap modelo){

        try {
            autorServicio.modificarAutor(nombre, id);
            
            return "redirect:../lista";
        } catch (MiExeption ex) {
           modelo.put("error", ex.getMessage());
           return "autor_modificar.html";
        }

 }
 
  
}
