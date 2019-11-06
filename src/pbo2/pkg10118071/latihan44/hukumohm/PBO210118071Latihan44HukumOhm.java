/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan44.hukumohm;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menghitung
 *                     tegangan dengan hukum ohm
 * 
 */
public class PBO210118071Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Baterai baterai1 = new Baterai();
        Baterai baterai = new Baterai(3, 12);
        
        System.out.println("Kuat Arus \t : " + baterai.getKuatArus() + " ampere");
        System.out.println("Hambatan \t : " + baterai.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan \t : " + baterai.hitungTegangan() + " volt");
        
    }
    
}
