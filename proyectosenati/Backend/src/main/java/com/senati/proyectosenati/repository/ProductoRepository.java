package com.senati.proyectosenati.repository;

// Importamos los drivers, metodos
import com.senati.proyectosenati.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Anotaciones @repository interfaz como la capa de acceso a la base de datos
@Repository

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    //No necesitamos escribir nada aqui
    // JpaRepository ya tiene todo_lo_basico
}
