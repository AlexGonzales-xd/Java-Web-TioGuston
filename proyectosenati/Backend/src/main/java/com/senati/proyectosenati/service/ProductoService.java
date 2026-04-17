package com.senati.proyectosenati.service;

import com.senati.proyectosenati.entity.Producto;
import com.senati.proyectosenati.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;
//Importamos la anotacion @service
//Esto es la capa de la logica de negocio, aqui va las validaciones, calculos, etc.
@Service
public class ProductoService {
    //Inyectamos el repositorio para poder acceder a la base de datos
    private final ProductoRepository productoRepository;

    //Constructor: spring inyecta automaticamente el repositorio(las dependencias)
    public ProductoService(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    }
    //Retorna o recive la lista de todos los productos
    public List<Producto> listarTodos(){
        return productoRepository.findAll(); }
    // Crear un producto
public Producto crearProducto(Producto producto){
        return productoRepository.save(producto);
}
    //Elimina el producto por ID
    public void eliminarProductos(Long id){
        productoRepository.deleteById(id);
    }
}
