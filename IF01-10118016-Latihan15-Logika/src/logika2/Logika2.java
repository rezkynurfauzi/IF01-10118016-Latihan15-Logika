/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logika2;

/**
 *
 * Nama : Rezky Nur Fauzi
 * NIM  : 10118016  
 * Kelas: IF-1 
 * Deskripsi Program : Menampilkan Logika dengan menggunakan boolean pada Java
 */
public class Logika2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean a = true;
        boolean b = false;
        
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a = " + !a);
        System.out.println("!(a && b) = " + !(a && b));
    }
    
}
