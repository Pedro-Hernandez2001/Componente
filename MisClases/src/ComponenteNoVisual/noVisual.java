/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponenteNoVisual;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author pedro
 */
public class noVisual {

    public boolean validacionTelefono(int telefono) {

        String numer = Integer.toString(telefono);
        return numer.length() == 10;
    }

    public boolean validacionURL(String url) {
        return url.matches("^(https?:\\/\\/)?([\\w\\d]+\\.)*[\\w\\d]+\\.([a-zA-Z]{2,6}\\.)?[a-zA-Z]{2,6}(\\/\\S*)?$");
    }

    public boolean validacionTarjetas(String tarjetaCredito) {
        return tarjetaCredito.matches("^\\d{16}$");
    }

    /*  public boolean validacionCodigoPostal(int codigoPostal) {

        String numer = Integer.toString(codigoPostal);
        return numer.length() == 5;
    }*/
    public boolean validacionCURP(String curp) {
        return curp.matches("^[A-Z]{4}\\d{6}[HM][A-Z]{6}\\d{1}$");
    }

    public boolean validacionNSS(String nss) {
        return nss.matches("^\\d{10}-\\d{1}$");
    }

    public String convertirAMayusculas(String texto) {
        return texto.toUpperCase();
    }

    public boolean validacionCodigoPostal(int codigoPostal) {
        // Convertir el código postal a cadena y verificar la longitud
        String numer = Integer.toString(codigoPostal);
        if (numer.length() != 5) {
            return false;
        }

        String filePath = "ruta/al/archivo/codigos_postales.txt";

        // Leer el archivo 
        Set<String> validCPs = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                validCPs.add(line.trim());
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de texto: " + e.getMessage());
            return false;
        }
        

        return validCPs.contains(numer);
    }

}
