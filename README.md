## TRELLO
Más info en [mi tablero de trello](https://trello.com/invite/b/69a1f845293c48098087a8c8/ATTI02027801cb453a6d213e1f3af08e56fc1D2E7705/restaurantepolleriamisquizaso)

(<a href="https://ibb.co/vCd8p0Bj"><img src="https://i.ibb.co/KcsHdTGr/imagen-de-trelo.png" alt="imagen-de-trelo" border="0"></a>)

---

# 🍗 Restaurante Pollería Tío Gustón

![Estado](https://img.shields.io/badge/Estado-En%20Desarrollo-yellow)
![Firebase](https://img.shields.io/badge/Firebase-Conectado-blue)
![Version](https://img.shields.io/badge/Version-1.0.0-green)
![License](https://img.shields.io/badge/License-MIT-green)
![Responsive](https://img.shields.io/badge/Responsive-Si-brightgreen)

Sistema web para la gestión de ventas, productos y usuarios de una pollería/restaurante. Desarrollado como proyecto final del curso de Desarrollo Web en SENATI.

---

## 📝 Descripción del negocio

| Campo | Valor |
|-------|-------|
| **Nombre** | Restaurante Pollería Tío Gustón |
| **Giro** | Restaurante - Comida (Chifa, Regional, Criollo, Marino) |
| **Tamaño** | Pequeña empresa, familiar |
| **Contexto** | Restaurante donde se venden platos típicos, pollo a la brasa, chifa, etc. |
| **Justificación** | Reemplazar el registro manual en cuaderno por un sistema digital en la nube |

---

## ❌ Problema y solución

| Problema | Solución |
|----------|----------|
| Registro en cuaderno/papel | Sistema web con Firebase |
| Errores en cálculos | Sistema automatizado |
| Pérdida de información | Datos en la nube |
| Sin control de empleados | Roles (admin/empleado) |
| Acceso limitado | Accesible desde cualquier dispositivo |

---

## 📋 Requerimientos Funcionales

| Código | Descripción |
|--------|-------------|
| RF01 | Iniciar sesión con correo y contraseña |
| RF02 | Diferenciar entre administrador y empleado |
| RF03 | CRUD de productos (admin) |
| RF04 | CRUD de usuarios (admin) |
| RF05 | Registrar ventas con carrito |
| RF06 | Historial de ventas |
| RF07 | Dashboard con estadísticas |
| RF08 | Filtrar productos por categoría |
| RF09 | Datos guardados en Firebase |
| RF10 | Diseño responsive |

---

## 📋 Requerimientos No Funcionales

| Código | Tipo | Descripción |
|--------|------|-------------|
| RNF01 | Rendimiento | Carga en menos de 3 segundos |
| RNF02 | Usabilidad | Interfaz intuitiva |
| RNF03 | Seguridad | Solo usuarios autorizados |
| RNF04 | Disponibilidad | 24/7 en la nube |
| RNF05 | Adaptabilidad | Celular, tablet y PC |

---

## 🛠️ Stack completo y Tecnologías

| Herramienta | Uso |
|-------------|-----|
| Trello | Gestión del proyecto |
| Figma | Diseño UI/UX |
| Firebase Firestore | Base de datos en la nube |
| VS Code | Desarrollo |
| Git & GitHub | Control de versiones |
| Netlify | Hosting |
| HTML5, CSS3, JavaScript | Frontend |

---

## 📁 Estructura del proyecto
restaurante-tio-guston/
├── index.html
├── dashboard.html
├── README.md
└── screenshots/
├── login.png
├── dashboard.png
├── productos.png
├── nueva-venta.png
└── usuarios.png

---

## 🎨 Diseño UI/UX (Figma)

<a href="https://ibb.co/qYYsbKNM"><img src="https://i.ibb.co/9HHTR6b9/imagen-2026-04-20-113445234.png" alt="imagen-2026-04-20-113445234" border="0"></a>

**Link:**([https://www.figma.com/file/tu-link](https://www.figma.com/design/xzqAc98md3yEOfGO4PqP7j/PAGINA-WEB?node-id=0-1&t=if1JuIGiS675F5vi-1))

---

## 🗄️ Base de datos (Firebase Firestore)

### Diagramas de Entidad

<a href="https://ibb.co/MxwzgbhZ"><img src="https://i.ibb.co/VcnFLdNJ/IMG-RELACION-DE-ENTIDAD.png" alt="IMG-RELACION-DE-ENTIDAD" border="0"></a>



<a href="https://ibb.co/ynNkbnXs"><img src="https://i.ibb.co/wNdQxNR6/IMG-TABLA-ENTIDAD.png" alt="IMG-TABLA-ENTIDAD" border="0"></a>

### Colecciones

**usuarios** (id, nombre, correo, contraseña, rol, fecha)

**productos** (id, nombre, categoria, descripcion, precio)

**ventas** (id, id_usuario, fecha, total, detalles)

**contadores** (nextProductoId, nextUsuarioId, nextVentaId)

