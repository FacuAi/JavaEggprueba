
package com.LIBROS.LIBROS.repositorio;

import com.LIBROS.LIBROS.entidades.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepositorio extends JpaRepository<Editorial,String>  {

}
