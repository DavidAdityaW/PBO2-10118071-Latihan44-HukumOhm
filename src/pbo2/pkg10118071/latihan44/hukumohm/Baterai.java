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
public class Baterai {
    
    public Baterai() {
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar");
        System.out.println("akan berbanding lurus dengan beda potensial");
        System.out.println("pada ujung-ujung kawat penghantar tersebut");
        System.out.println("asalkan suhu kawat dijaga konstan.\n");
    }
    
    private float kuatArus;
    private float hambatan;
    
    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }
    
    public float getKuatArus() {
        return kuatArus;
    }
    
    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan() {
        return kuatArus * hambatan;
    }
    
}
