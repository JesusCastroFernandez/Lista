/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JESUS
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Integer> Numeros;
        
        Numeros=new ArrayList<>();
        
        Numeros.add(1);
        Numeros.add(15);
        Numeros.add(21);
        
        Numeros.remove(1); // Elimina el número de la posición 1
        
        System.out.println("La primera posición de la lista la ocupa el número: " + Numeros.get(1));
        
        System.out.println("--------------------");
        
         List<String> Nombres;
        
        Nombres=new ArrayList<>();
        
        Nombres.add("España, Francia, Alemania");
        Nombres.add("Francia");
        Nombres.add("Alemania");
        
        System.out.println("El tamaño de la lista es: " + Nombres.size());
        
        System.out.println("¿La lista contiene el nombre de Francia?: " + Nombres.contains("Francia"));
        
        System.out.println("El dato de la posición 0 es: " + Nombres.get(0));
        
        for (String n : Nombres) {
        
            System.out.println("Nombres: " + n);
            
        }
        
        
    }
    
}
