package com.senati.proyectosenati.controller;

import com.senati.proyectosenati.entity.Producto;
import com.senati.proyectosenati.service.ProductoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

//3 ANOTACIONES
//Indica que esta clase maneja peticiones HTTPS y DEVUELVE JSON
@RestController
// Define la URL base de todos los END-POINT de esta clase
@RequestMapping("api/productos")
// Esta anotacionpermite que el front-end pueda llamar a esta API
// Si ponemos esto,el navegador bloquea las peticiones por politicas CORS
@CrossOrigin(origins = "*")
public class ProductoController {
    // Declaramos una variable Definida
    // Incectamos el servicio para acceder a la logica del negocio
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;}


            // GET /api/producto -> devuelve todos los productos en formato JSON
            @GetMapping
            public List<Producto> listar() {return productoService.listarTodos();}



            // POST /api/productos -> para guardar un producto
            @PostMapping
            public ResponseEntity<Producto> crear (@RequestBody Producto producto){
            return ResponseEntity.ok(productoService.crearProducto(producto));
        }

            // Delete /API/Producto{id} -> Elimina un producto por su id
            @DeleteMapping("/{id}")
            public ResponseEntity<?> eliminarProductos(@PathVariable Long id){

            productoService.eliminarProductos(id);
            return ResponseEntity.ok("Producto eliminado");
        }
        }