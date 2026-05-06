/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspertama;

import javax.swing.JOptionPane;

/**
 *
 * @author ThinkPad
 */
import javax.swing.JOptionPane;
public class tugasketiga {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */





    /**
     * @param args the command line arguments
     */
    
    
    static double LuasPersegiPanjang(double panjang,double Lebar) {
        return panjang * Lebar;
    }
    static double  LuasSegitiga(double Alas,double Tinggi){
        return 0.5 * Alas * Tinggi;
    }
    static double LuasLingkaran(double r){
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    double p =Double.parseDouble(JOptionPane.showInputDialog("Masukkan Panjang :"));
    double I =Double.parseDouble(JOptionPane.showInputDialog("Masukkan Lebar :"));
    double luasPP =LuasPersegiPanjang(p,I);
    
    double a =Double.parseDouble(JOptionPane.showInputDialog("Masukkan Alas :"));
    double t =Double.parseDouble(JOptionPane.showInputDialog("Masukkan Tinggi :"));
    double luasS =LuasSegitiga(a,t);
    
    double r =Double.parseDouble(JOptionPane.showInputDialog("Masukkan Jari Jari :"));
    double luasL =LuasLingkaran(r);
    
    String hasil =
            "luas persegi panjang = "+luasPP+
            "\nluas segitia = "+luasS +
            "\nluas lingkaran = "+String.format("%.2f", luasL);
    
    JOptionPane.showMessageDialog(null, hasil);
    }
    
}


