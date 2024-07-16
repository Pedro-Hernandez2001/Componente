# COMPONENTE NO VISUAL: VALIDACIONES PARA JAVA

### Descripción
Este componente Java permite realizar validaciones comunes, tales como validación de números de teléfono, URL, tarjetas de crédito, CURP y NSS. Está diseñado para ser usado en aplicaciones Java.
El componente se compone de una clase principal, `noVisual`, que ofrece métodos para realizar estas validaciones.

### Usos
1. Aplicaciones de Gestión de Usuarios: Ideal para sistemas de gestión de usuarios que requieren la validación de información personal, como teléfonos y CURP, asegurando que los datos ingresados sean correctos y válidos.
2. Sistemas de Seguridad: Útil en herramientas de seguridad que necesiten validar información crítica, como números de tarjetas de crédito y URL, ayudando a prevenir fraudes y errores.
4. Entornos de Desarrollo: Como un componente JAR reutilizable, facilita a los desarrolladores implementar validaciones estándar en sus proyectos, ahorrando.

### Características
- Validación de Teléfonos: Verifica que el número de teléfono tenga 10 dígitos.
- Validación de URL: Comprueba que la URL tenga un formato válido.
- Validación de Tarjetas de Crédito: Asegura que el número de tarjetas tenga 16 dígitos.
- Validación de CURP: Valida el formato correcto de un CURP mexicano.
- Validación de NSS: Verifica que el número de seguridad social siga el formato correcto.

### Requisitos
- Java JDK 8 o Superior: Compatible con versiones modernas de Java.
# API
### Descripción
El componente `noVisual` es una clase no visual que proporciona métodos para validar información crítica en aplicaciones Java. Su propósito es asegurar que los datos ingresados por los usuarios cumplan con los formatos requeridos, mejorando la integridad y seguridad de los datos.

### Campos
| Tipo | Campo | Descripción |
|------|-------|-------------|
| `String` | `telefono` | contiene los numeoros para validar |
| `String` | `url` | Contiene las url para validar |
| `String` | `tarjeta` | Contiene los dígitos de las tarejtas|
| `String` | `curp` | Contiene el cur para validar |
| `String` | `nss` | Contiene el numero de seguro social para validar |

### Métodos
| Nombre | Tipo de Dato que Retorna | Tipo de dato que recibe | Descripción |
|--------|--------|-------------------------|-------------|
| `validacionTelefono` | `boolean` | `int telefono` | Verifica si el número de teléfono tiene 10 dígitos. |
| `validacionURL` | `boolean` | `String url` | Verifica si la URL tiene un formato válido. |
| `validacionTarjetas` | `boolean` | `String tarjetaCredito` | Verifica si el número de tarjeta de crédito tiene 16 dígitos. |
| `validacionCURP` | `boolean` | `String curp` | Verifica si el CURP tiene un formato válido. |
| `validacionNSS` | `boolean` | `String nss` | Verifica si el número de seguridad social tiene el formato correcto. |

# Instalación
#### 1.- Descargamos el .zip (este zip conndra el jar)
![image](https://github.com/user-attachments/assets/d6c22bd5-0896-4bd9-b600-592edaeb927d)
#### 2.- Utilizaremos el de MiClases.jar para poder hacer las validaciones
#### 3.- Para poder usarlo, lo agredaremos dentro de nuestro proyecto
#### 4.- Nos dirigimos a la carpeta de Libraries
![image](https://github.com/user-attachments/assets/a67c083a-36eb-484a-95e9-e2837c4eacc6)
#### 5.- Damos click derecho, presionamos en Add JAR/Folder
![image](https://github.com/user-attachments/assets/32c62c67-77c8-4329-acdf-3568795b47fe)
#### 6.- Buscamos nuestro Jar ya previamente descargado(llamado MisClases.jar) y lo agregamos
![image](https://github.com/user-attachments/assets/8248416f-3699-4ec8-b9f4-f05848091050)
#### 7.- Nos quedará de la siguiente manera (esto dependera de las librerias que esten usando)
![image](https://github.com/user-attachments/assets/59d04c08-6c26-46a6-adb7-102d0a95a785)
# Aplicación
#### 1.- Para poder usarlo correctamente debemos agregar la siguinte linea de codigo
   ```Java
 import ComponenteNoVisual.noVisual;
   ```
#### 2.- Para demostración utilizaremos el metodo de validar los 16 numero de las tarjetas
![image](https://github.com/user-attachments/assets/7c8ebd0d-cc78-45a7-83f4-89247738e065)
#### 3.- Al boton  ` Aceptar `  le asignanremos el evento actionPerformed 
#### 4.- Dentro de el ponemos lo siguiente

```
noVisual validar = new noVisual();
        String tarjeta = txtTarjeta.getText();
        boolean valitarjeta = validar.validacionTarjetas(tarjeta);

        if (valitarjeta) {
            JOptionPane.showMessageDialog(null, "Tarjeta valida");
        } else {
            JOptionPane.showMessageDialog(null, "Tarjeta invalida");
        }
````
#### 5.- Ejecutamos el programa y vemos los resultados

>Datos Correctos


![image](https://github.com/user-attachments/assets/cd68bc7a-8cf1-4523-90b7-2b98c2b45fc5)




![image](https://github.com/user-attachments/assets/1280a633-599e-4354-9246-a1adbed5b857)


>Datos incorrecto



![image](https://github.com/user-attachments/assets/4b12989c-1fb6-4d25-a6a0-22330f595b97)

#### 6.- Para validar el numero del telefono
```
noVisual validar = new noVisual();
String telefono = txtTelefono.getText();
boolean valitelefono = validar.validacionTelefono(Integer.parseInt(telefono));

if (valitelefono) {
    JOptionPane.showMessageDialog(null, "Teléfono válido");
} else {
    JOptionPane.showMessageDialog(null, "Teléfono inválido");
}
```
#### 7.- Para validar la url
```
noVisual validar = new noVisual();
String url = txtURL.getText();
boolean valiurl = validar.validacionURL(url);

if (valiurl) {
    JOptionPane.showMessageDialog(null, "URL válida");
} else {
    JOptionPane.showMessageDialog(null, "URL inválida");
}
```
#### 8.- Para validar la CURP
```
noVisual validar = new noVisual();
String curp = txtCURP.getText();
boolean valicurp = validar.validacionCURP(curp);

if (valicurp) {
    JOptionPane.showMessageDialog(null, "CURP válida");
} else {
    JOptionPane.showMessageDialog(null, "CURP inválida");
}
```
#### 9.- Para validar del NSS
```
noVisual validar = new noVisual();
String nss = txtNSS.getText();
boolean valinss = validar.validacionNSS(nss);

if (valinss) {
    JOptionPane.showMessageDialog(null, "NSS válido");
} else {
    JOptionPane.showMessageDialog(null, "NSS inválido");
}
```
# Video
### Puedes guiarte del funcionameinto visual en el siguiente enlace.... 



