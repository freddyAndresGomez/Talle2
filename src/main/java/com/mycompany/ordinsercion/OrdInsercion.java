/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordinsercion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author YULIETH
 */
public class OrdInsercion {
    
    static Scanner scan = new Scanner(System.in);
        
    private static  ArrayList<Libros > librosls = new ArrayList();

    public static void main(String[] args) {
       
         System.out.println("Escribir numero de libros  a ingresar ");
        int  jk = scan.nextInt();
         scan.nextLine();
        
        for (int i = 0; i < jk ; i++) {
            System.out.println("digite el titulo del libro"+(i+1));
            String nombrelibro= scan.nextLine();
               librosls.add(new Libros(nombrelibro));
        } 
        System.out.println("Listado de libros  ");
          mostrar();
       
        System.out.println("lista ordenada");
        ordenarinsercion(librosls);
        mostrar();
       
    }
    public static void mostrar() {
        for (Libros libro :  librosls) {
            System.out.println(libro.getTitulo());

        }
    }
    
     public static void ordenarinsercion (ArrayList<Libros>librosls){
         int n = librosls.size();
        for (int i = 1; i < n; ++i) {
            
             Libros key = librosls.get(i);
             int j = i -1;
             
             while(j>= 0 && compareStrings(librosls.get(j).getTitulo(),key.getTitulo())>0){
                 librosls.set(j+1,librosls.get(j));
                 j = j -1 ;
                 
             }
             librosls.set(j +1, key);
        }
    }
     
     public static int compareStrings(String a,String b){
         
         int Cl = Math.min(a.length(),b.length());
         for (int i = 0; i < Cl; i++) {
             if(a.charAt(i)<b.charAt(i)){
                 return -1 ;
             }else if (a.charAt(i)>b.charAt(i)){
                 return 1 ;
             }
         }
         return a.length() - b.length();
     }
}
