
package com.LIBROS.LIBROS.servicios;
import com.LIBROS.LIBROS.entidades.Editorial;
import com.LIBROS.LIBROS.exepciones.MiExeption;
import com.LIBROS.LIBROS.repositorio.EditorialRepositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
public class EditorialServicio {   

    @Autowired
    EditorialRepositorio editorialRepositorio; 
    @Transactional
    
    public void crearEditorial (String nombre) throws MiExeption {
        validar(nombre);
        Editorial editorial = new Editorial();
        
        editorial.setNombre(nombre);
        
        editorialRepositorio.save(editorial);
           
}
       public List<Editorial> ListarEditorial(){

     List<Editorial> editoriales = new ArrayList<>();
     
     editoriales = editorialRepositorio.findAll();
        return editoriales;
    }

public Editorial getOne(String id) {

    return editorialRepositorio.getOne(id);

}
    
        @Transactional

    public void modificarEditorial(String id, String nombre) throws MiExeption{
              validar(nombre);
        Optional<Editorial> respuesta = editorialRepositorio.findById(id);
        if (respuesta.isPresent()) {
            
            Editorial editorial = respuesta.get();
            editorial.setNombre(nombre);
            editorialRepositorio.save(editorial);

        }
    }
   
      private void validar(String nombre) throws MiExeption {

        if (nombre.isEmpty() || nombre == null) {
            throw new MiExeption("El titulo no puede ser nulo o vacio");

        }
      }
}

