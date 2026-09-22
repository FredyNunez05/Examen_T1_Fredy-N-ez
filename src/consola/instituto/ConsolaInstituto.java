/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consola.instituto;
import java.util.Scanner;
/**
 *
 * @author UCA40411
 */
public class ConsolaInstituto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
         AlumnoController controlador = new AlumnoController();
         boolean siguiente = true;
         
         while (siguiente) {
            try {
                System.out.println("\n--- REGISTRO DE ALUMNO ---");
                Alumno alumno = new Alumno();

                System.out.print("Nombre completo: ");
                alumno.setNombre(scanner.nextLine());

                System.out.print("Tipo de documento (DNI / Carné de Residencia): ");
                String tipoDoc = scanner.nextLine();
                alumno.setTipo_doc(tipoDoc);

                System.out.print("Número de documento: ");
                String numDoc = scanner.nextLine();

                alumno.setNumero_documento(tipoDoc, numDoc); 

                System.out.print("Nivel socioeconómico (A, B, C): ");
                alumno.setNivel_socioeconomico(scanner.nextLine());

                System.out.print("Tipo de beca (Ninguna / Parcial / Total): ");
                alumno.setBeca(scanner.nextLine());

                controlador.agregarAlumno(alumno);
                System.out.println("¡Alumno guardado con éxito!");

            } catch (IllegalArgumentException e) {

                System.out.println("Error de validación: " + e.getMessage());
                System.out.println("Por favor, intente registrar al alumno de nuevo.");
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado de ingreso.");
            }

            System.out.print("¿Desea registrar otro alumno? (si/no): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("no")) {
                siguiente = false;
            }
        }
    }
    
}
