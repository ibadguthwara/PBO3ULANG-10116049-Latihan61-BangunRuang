/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3ulang.pkg10116049.latihan61.bangunruang;

import java.text.DecimalFormat;

/**
 *
 * @author ibadguthwara
 * NAMA              : M. Ibad Guthwara
 * KELAS             : PBO 3 ULANG
 * NIM               : 10116049
 * DESKRIPSI PROGRAM : Membuat Program Menentukan Volume Bangun Ruang
 *  
 */
public class PBO3ULANG10116049Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Bola bola = new Bola();
       bola.setJari2(7);
       Kerucut kerucut = new Kerucut();
       kerucut.setTinggi(9);
       kerucut.setJari2(14);
       Tabung tabung = new Tabung();
       tabung.setJari2(10);
       tabung.setTinggi(21);
       
       DecimalFormat df = new DecimalFormat("#.#");
       System.out.println("Volume Bola    : " + df.format(bola.volume()) + 
                          " cm");
       System.out.println("Volume Kerucut : " + Math.round(kerucut.volume()) +
                          " cm");
       System.out.println("Volume Tabung  : " + Math.round(tabung.volume()) +
                          " cm");
    }
    
}
