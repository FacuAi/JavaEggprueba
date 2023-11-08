package com.LIBROS.LIBROS.controladores;

import com.LIBROS.LIBROS.entidades.Autor;
import com.LIBROS.LIBROS.entidades.Editorial;
import com.LIBROS.LIBROS.entidades.Libro;
import com.LIBROS.LIBROS.exepciones.MiExeption;
import com.LIBROS.LIBROS.servicios.AutorServicio;
import com.LIBROS.LIBROS.servicios.EditorialServicio;
import com.LIBROS.LIBROS.servicios.LibroServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/libro") // localhost:8080/libro/

public class LibroControlador {

    @Autowired
    private LibroServicio libroServicio;

    @Autowired
    private AutorServicio autorServicio;
    @Autowired
    private EditorialServicio editorialServicio;

    @GetMapping("/registrar") // localhost:8080/libro/registrar
    public String registrar(ModelMap modelo) {

        List<Autor> autores = autorServicio.ListarAutor();
        List<Editorial> editoriales = editorialServicio.ListarEditorial();
        modelo.addAttribute("autores", autores);
        modelo.addAttribute("editoriales", editoriales);

        return "libro_form.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam(required = false) Long isbn, @RequestParam String titulo,
            @RequestParam(required = false) Integer ejemplares, @RequestParam String idAutor,
            @RequestParam String idEditorial, ModelMap modelo) {

        try {
            libroServicio.crearLibro(isbn, titulo, ejemplares, idAutor, idEditorial);
            modelo.put("exito", "El libro fue cxargado correctamente");

        } catch (MiExeption ex) {
            modelo.put("error", ex.getMessage());

            List<Autor> autores = autorServicio.ListarAutor();
            List<Editorial> editoriales = editorialServicio.ListarEditorial();
            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);
            return "libro_form.html";
        }

        return "index.html";
    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {
        List<Libro> libros = libroServicio.Listarlibros();
        modelo.addAttribute("libros", libros);

        return "libro_list.html";

    }

     @GetMapping("/modificar/{isbn}")
 public String modificar(@PathVariable Long isbn, ModelMap modelo){

modelo.put("libro", libroServicio.getOne(isbn));

        
List<Autor> autores = autorServicio.ListarAutor();
List<Editorial> editoriales = editorialServicio.ListarEditorial();

modelo.addAttribute("autores", autores);
modelo.addAttribute("editoriales", editoriales);

return "libro_modificar.html";
 }
 
      @PostMapping("/modificar/{isbn}")
    public String modificar(@PathVariable Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial, ModelMap modelo) {
        try {
            List<Autor> autores = autorServicio.ListarAutor();
            List<Editorial> editoriales = editorialServicio.ListarEditorial();
            
            
            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);

            libroServicio.modificarLibro(isbn, titulo, idAutor, idEditorial, ejemplares);
            
                        
            return "redirect:../lista";

        } catch (MiExeption ex) {
   List<Autor> autores = autorServicio.ListarAutor();
            List<Editorial> editoriales = editorialServicio.ListarEditorial();
            modelo.put("error", ex.getMessage());
            
            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);
            
            return "libro_modificar.html";
        }

    }
}
