package com.LIBROS.LIBROS.servicios;

import com.LIBROS.LIBROS.entidades.Autor;
import com.LIBROS.LIBROS.exepciones.MiExeption;

import com.LIBROS.LIBROS.repositorio.AutorRepositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServicio {

    @Autowired
    AutorRepositorio autorRepositorio;

    @Transactional
    public void crearAutor(String nombre) throws MiExeption {
        validar(nombre);
        Autor autor = new Autor();
        autor.setNombre(nombre);
        autorRepositorio.save(autor);
    }

    public List<Autor> ListarAutor() {

        List<Autor> autores = new ArrayList<>();

        autores = autorRepositorio.findAll();
        return autores;
    }


public Autor getOne(String id) {

    return autorRepositorio.getOne(id);

}

    @Transactional
    public void modificarAutor(String nombre, String id) throws MiExeption {

        validar(nombre);
        Optional<Autor> respuesta = autorRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            autor.setNombre(nombre);
            autorRepositorio.save(autor);

        }
    }

    private void validar(String nombre) throws MiExeption {

        if (nombre.isEmpty() || nombre == null) {
            throw new MiExeption("El titulo no puede ser nulo o vacio");

        }

    }




    }


