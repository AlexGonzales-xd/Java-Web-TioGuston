package com.senati.proyectosenati.entity;
import com.senati.proyectosenati.service.ProductoService;
import jakarta.persistence.*;
//@ Entity le dice a Hibernate que esta clase representa una tabla en la BD
@Entity
// @Table indica el nombre exacto de la tabla en MySQL o MariaDB
@Table(name = "Producto")
public class Producto{
    // @Id marca este campo como la clave primaria de la tabla
    // @GeneratedValue hace que el ID se genere automaticamente (AutoIncrement)
    // @Column(name="cliente_id") indica el nombre exacto de la columna en mysql
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id;
    // nullable= false significa que este campo no puede estar vacio en la BD
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String descripcion;
    // unique=true significa que no puede hacer dos PRODUCTOS con la misma descripcion
    @Column(nullable = false)
    private String precio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }



}

