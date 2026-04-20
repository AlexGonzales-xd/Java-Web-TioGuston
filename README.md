
---

## 🎨 Diseño UI/UX (Figma)

![FIGMA](https://www.figma.com/file/tu-link-aqui)

*Link del diseño en Figma: [Ver diseño](https://www.figma.com/file/tu-link)*

---

## 🗄️ Base de datos (Firebase Firestore)

El sistema cuenta con 4 colecciones principales:

| Colección | Descripción |
|-----------|-------------|
| **usuarios** | Almacena administradores y empleados |
| **productos** | Almacena la carta del restaurante |
| **ventas** | Registro de cada venta realizada |
| **contadores** | Control de IDs automáticos |

### Estructura de colecciones

#### 📌 Colección: `usuarios`

| Campo | Tipo | Descripción |
|-------|------|-------------|
| id | number | Identificador único |
| nombre | string | Nombre completo |
| correo | string | Correo electrónico |
| contraseña | string | Contraseña de acceso |
| rol | string | administrador / empleado |
| fecha | string | Fecha de registro |

#### 📌 Colección: `productos`

| Campo | Tipo | Descripción |
|-------|------|-------------|
| id | number | Identificador único |
| nombre | string | Nombre del plato |
| categoria | string | Chifa / Regional / Criollo / Marino / Bebidas |
| descripcion | string | Descripción del plato |
| precio | number | Precio en soles |

#### 📌 Colección: `ventas`

| Campo | Tipo | Descripción |
|-------|------|-------------|
| id | number | Identificador único |
| id_usuario | number | ID del vendedor |
| fecha | string | Fecha y hora de la venta |
| total | number | Monto total de la venta |
| detalles | array | Lista de productos vendidos |

#### 📌 Colección: `contadores`

| Documento | Descripción |
|-----------|-------------|
| nextProductoId | Siguiente ID para productos |
| nextUsuarioId | Siguiente ID para usuarios |
| nextVentaId | Siguiente ID para ventas |

### Ejemplo de documento en `productos`

```json
{
  "id": 1,
  "nombre": "Arroz Chaufa",
  "categoria": "Chifa",
  "descripcion": "Arroz frito con pollo, huevo y sillao",
  "precio": 12.00
}
