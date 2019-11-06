/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan57.vehicle;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 *                     spesifikasi sepeda dan skateboard
 * 
 */
public class Vehicle {
    private String myBrand;
    private String myModel;

    public Vehicle() {
        
    }
    
    public String getBrand() {
        return myBrand;
    }
    
    public void setBrand(String brand) {
        myBrand = brand;
    }
    
    public String getModel() {
        return myModel;
    }
    
    public void setModel(String model) {
        myModel = model;
    }
}
