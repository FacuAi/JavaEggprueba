package com.LIBROS.LIBROS.servicios;
import com.LIBROS.LIBROS.entidades.Autor;
import com.LIBROS.LIBROS.entidades.Editorial;
import com.LIBROS.LIBROS.entidades.Libro;
import com.LIBROS.LIBROS.exepciones.MiExeption;
import com.LIBROS.LIBROS.repositorio.AutorRepositorio;
import com.LIBROS.LIBROS.repositorio.EditorialRepositorio;
import com.LIBROS.LIBROS.repositorio.LibroRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServicio {

    @Autowired
    private LibroRepositorio libroRepositorio;
    @Autowired
    private AutorRepositorio autorRepositorio;
    @Autowired
    private EditorialRepositorio editorialrepositorio;
    
    
@Transactional
    public void crearLibro(Long isbn, String titulo, Integer Ejemplares, String iDAutor, String IdEditorial) throws MiExeption{
        validar(isbn, titulo, Ejemplares, IdEditorial, iDAutor);

        Autor autor = autorRepositorio.findById(iDAutor).get();
        Editorial editorial = editorialrepositorio.findById(IdEditorial).get();
        Libro libro = new Libro();
        
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplares(Ejemplares);
        libro.setAlta(new Date());

        libro.setAutor(autor);
        libro.setEditorial(editorial);
        libroRepositorio.save(libro);
        
    }

    public Libro getOne(Long isbn) {

        return libroRepositorio.getOne(isbn);
    
    }


    public List<Libro> Listarlibros(){

     List<Libro> libros = new ArrayList<>();
     
     libros = libroRepositorio.findAll();
        return libros;
    }



    @Transactional
       public void modificarLibro (Long isbn, String titulo, String iDAutor, String IdEditorial, Integer ejemplares) throws MiExeption{
        validar(isbn, titulo, ejemplares, IdEditorial, iDAutor);
        
    Optional<Libro> respuesta = libroRepositorio.findById(isbn);
        Optional<Autor> respuestaAutor = autorRepositorio.findById(iDAutor);
            Optional<Editorial> respuestaEditorial = editorialrepositorio.findById(IdEditorial);
            Autor autor = new Autor();
            Editorial editorial = new Editorial();
            
            
               if (respuestaAutor.isPresent()) {
               autor = respuestaAutor.get();
           }
               
                    if (respuestaEditorial.isPresent()) {
               editorial = respuestaEditorial.get();
           }
    
           if (respuesta.isPresent()) {
               Libro libro = respuesta.get();
               libro.setTitulo(titulo);
               libro.setAutor(autor);
               libro.setEditorial(editorial);
               libro.setEjemplares(ejemplares);
               libroRepositorio.save(libro);
               
           }
    
}
       private void validar( Long isbn, String titulo,Integer Ejemplares, String IdEditorial, String iDAutor) throws MiExeption{

        if (isbn == null) {
            throw new MiExeption("El isbn no puede ser nulo");
        
    }
        if (titulo.isEmpty()|| titulo == null ) {
            throw new MiExeption("El Titulo no puede ser nulo o  estar vacio");    
    }
         if (Ejemplares == null ) {
            throw new MiExeption("Los ejemplares no pueden estar vacio");    
    }
           if (iDAutor.isEmpty()|| iDAutor == null ) {
            throw new MiExeption("El iDAutor no puede ser nulo o  estar vacio");    
    }
           if (IdEditorial.isEmpty()||IdEditorial==null) {
         throw new MiExeption("El iDEditorial no puede ser nulo o  estar vacio");    
    }
       }
}