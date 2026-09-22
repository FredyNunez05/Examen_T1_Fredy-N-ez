/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consola.instituto;

/**
 *
 * @author UCA40411
 */
public class Alumno {
    private String nombre;
    private String tipo_doc;
    private String numero_documento;
    private String nivel_socioeconomico;
    private String beca;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String tipoDocumento, String numeroDocumento) {
    if (tipoDocumento.equalsIgnoreCase("DNI") && numeroDocumento.length() != 8) {
        throw new IllegalArgumentException("El DNI debe tener exactamente 8 dígitos.");
    }
    if (tipoDocumento.equalsIgnoreCase("Carné de Residencia") && numeroDocumento.length() != 11) {
        throw new IllegalArgumentException("El carné de Residencia debe tener exactamente 11 dígitos.");
    }
    this.numero_documento = numeroDocumento;
    }

    public String getNivel_socioeconomico() {
        return nivel_socioeconomico;
    }

    public void setNivel_socioeconomico(String nivel_socioeconomico) {
    if (nivel_socioeconomico == null || nivel_socioeconomico.trim().isEmpty()) {
        throw new IllegalArgumentException("El nivel socioeconómico no puede estar vacío.");
    }
    String nivelMayuscula = nivel_socioeconomico.trim().toUpperCase();
    if (!nivelMayuscula.equals("A") && !nivelMayuscula.equals("B") && !nivelMayuscula.equals("C")) {
        throw new IllegalArgumentException("El nivel socioeconómico debe ser estrictamente A, B o C.");
    }
    this.nivel_socioeconomico = nivelMayuscula;
}

    public String getBeca() {
        return beca;
    }

    public void setBeca(String beca) {
        this.beca = beca;
    }
    
    void verDatos() {
        System.out.println("Alumno: " + this.nombre + "Tipo documento: " + this.tipo_doc + "Nro documento: " + this.numero_documento + "Nivel socioeconómico: " + this.nivel_socioeconomico + "Beca: " + this.beca);
    }
}
