
package com.LIBROS.LIBROS.repositorio;

import com.LIBROS.LIBROS.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepositorio extends JpaRepository<Autor, String> {
    
}

