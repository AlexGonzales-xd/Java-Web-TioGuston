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

![FIGMA](AQUI_VA_TU_IMAGEN_DE_FIGMA)

**Link:** [Ver diseño en Figma](https://www.figma.com/file/tu-link)

---

## 🗄️ Base de datos (Firebase Firestore)

### Diagramas

![Diagrama Entidad Relacion](AQUI_VA_TU_DIAGRAMA_ER)
![Modelo Relacional](AQUI_VA_TU_MODELO_RELACIONAL)
![Arquitectura Firebase](AQUI_VA_TU_ARQUITECTURA_FIREBASE)

### Colecciones

**usuarios** (id, nombre, correo, contraseña, rol, fecha)

**productos** (id, nombre, categoria, descripcion, precio)

**ventas** (id, id_usuario, fecha, total, detalles)

**contadores** (nextProductoId, nextUsuarioId, nextVentaId)

### Ejemplo producto

```json
{
  "id": 1,
  "nombre": "Arroz Chaufa",
  "categoria": "Chifa",
  "precio": 12.00
}
Relaciones
USUARIO (1) → (N) VENTA → contiene → (N) PRODUCTO
const firebaseConfig = {
  apiKey: "TU_API_KEY",
  authDomain: "tu-proyecto.firebaseapp.com",
  projectId: "tu-proyecto",
  storageBucket: "tu-proyecto.firebasestorage.app",
  messagingSenderId: "123456789",
  appId: "1:123456789:web:abcdef123456"
};
rules_version = '2';
service cloud.firestore {
  match /databases/{database}/documents {
    match /{document=**} {
      allow read, write: if true;
    }
  }
}
git clone https://github.com/tu-usuario/restaurante-tio-guston.git
