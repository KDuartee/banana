/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.banana.ui;

import java.util.Scanner;

/**
 *
 * @author alumnog
 */
public class Main {
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese los nombres de los alumnos");
        
        String oracion = sc.nextLine();
        
        String[] alumnos = oracion.split(",");
        for(String a : alumnos){
//            System.out.println(a);
            String[] alumno = a.split(" ");
            String id = alumno[0];
            String primerNombre = alumno[3];
            String primerApellido = alumno[1];
            
            System.out.println("ID: "+id+"\n Primer nombre: "+primerNombre+"\n Primer apellido: "+primerApellido+"\n");
            
        
        
        
        }
                
            
    
    
    }
    
    
}
