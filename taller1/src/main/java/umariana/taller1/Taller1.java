/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umariana.taller1;

import java.util.ArrayList;
import java.util.Scanner;
import mundo.Tarea;

/**
 *
 * 
 */
public class Taller1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Tarea> misTareas = new ArrayList<>();

        boolean activo = true;
        do{
            
            System.out.println("---Menu de opciones---------");
            System.out.println("---1.Agregar tarea----------");
            System.out.println("---2.Mostrar tarea----------");
            System.out.println("---3.Terminar programa------");
            System.out.println("---Seleccione una opcion----");
            System.out.println("----------------------------");
            
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el id de la tarea");
                    int id=sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Ingrese la descripcion de la tarea");
                    String descripcion = sc.nextLine();
                    
                    System.out.println("Ingrese la prioridad de 1-5");
                    int prioridad = sc.nextInt();
                    
                   //Creacion del objeto y llenar la informacion 
                   Tarea nuevaTarea = new Tarea(id,descripcion,prioridad); 
                   //Almacenar el objeto en la contenedora
                   misTareas.add(nuevaTarea);
                   System.out.println("Tarea agregada satisfactoriamente ");
                   
                    break;
                case 2:
                    System.out.println("TAREAS REGISTRADAS");
                    for (Tarea t: misTareas) {
                        System.out.println("id: " + "" + t.getIdTarea() );
                        System.out.println("descripcion: " + "" + t.getDescripcion());
                        System.out.println("prioridad: " + "" + t.getPrioridad());
                    }
                    break;
                case 4:
                    
                    activo = false; System.out.println("Programa Terminado");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    
            }
            
        }while(activo);
    }
}
