
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ThinkPad
 */
import java.util.Scanner;
public class tugaskedua {
    



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //membuat objek dari class modul2
        tugaskedua mt = new tugaskedua();
        
        System.out.println("=== PROGAM MENGHITUNG VOLUME BANGUN ===");
        //input diameter dan tinggi (sekali saja)
        System.out.print("Masukkan diameter\t: ");
        double d = input.nextDouble();
        System.out.print("Masukkan tinggi \t: ");
        double t = input.nextDouble();
        
        //memanggil semua modul2 volume
        double tabung = mt.volume_tabung(d, t);
        double kerucut = mt.volume_kerucut(d, t);
        double bola =mt.volume_bola(d);
        
        //menampilkan hasil ke console
    System.out.println("\n--------- HASIL PERHIYUNGAN ---------");
    System.out.println("Volume Tabung \t= " + tabung);
    System.out.println("Volume Kerucut \t= " + kerucut);
    System.out.println("Volume Bola \t= " + bola );
        
        
    }
    double volume_tabung (double d,double t) {
        double r = d / 2;
        return Math.PI *r * r * t;
    }
    double volume_kerucut (double d, double t) {
        double r = d/ 2;
        return (1.0 /3 ) * Math.PI *r *r *t;
    }
    double volume_bola (double d) {
        double r = d / 2;
        return (4.0 /3) * Math.PI *r * r *r;
    
    }
        
       
    
   
       
    
    
}

}
