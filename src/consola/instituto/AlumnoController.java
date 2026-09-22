/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consola.instituto;

import java.util.ArrayList;

/**
 *
 * @author UCA40411
 */
public class AlumnoController {
    ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    
    public void agregarAlumno(Alumno alumno) {
        this.listaAlumnos.add(alumno);
    }

    public ArrayList<Alumno> obtenerAlumnos() {
        return this.listaAlumnos;
    }
    
    public void listarAlumnos() {
        System.out.println("Los alumnos de la lista son: ");
    }
}
