/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Juan José
 */
public class Clase41 {
     public static void main(String[] args) {
       
//         var contador = 0;
         
//         while (contador < 2) {
 //            System.out.println("contador = " + contador);
 //            contador++;
         
 
// 
//           var contador=0;
//           do{
//               System.out.println("contador = " + contador);
//               contador ++;
//          } while (contador < 10); 
inicio:
for ( var contador = 0 ; contador <3  ;contador++ ) {
    
    if( contador % 2 == 0){
    continue inicio ;
}
   
    System.out.println("contador = " + contador);
    
}

     }
}
