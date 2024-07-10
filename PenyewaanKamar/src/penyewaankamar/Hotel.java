/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penyewaankamar;

/**
 *
 * @author TOSHIBA
 */
public class Hotel extends PenyewaanKamar {
    public String tipeKamar;
    public int hargaKamar;
    public String namaPenyewa;

    public String getTipeKamar() {
        return tipeKamar;
    }

    public void setTipeKamar(String tipeKamar) {
        this.tipeKamar = tipeKamar;
    }

    public int getHargaKamar() {
        return hargaKamar;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public void setNamaPenyewa(String namaPenyewa) {
        this.namaPenyewa = namaPenyewa;
    }
    
    @Override
    double hargaKamar(){
        return  hargaKamar;
    }

    @Override
    void tampil() {
        System.out.println("========================");
        System.out.println("sewa kamar");
        System.out.println("========================");
        System.out.println("pilih tipe kamar yang diinginkan");
        System.out.println("1.Reguler(kapasitas 1 orang) ");
        System.out.println("harga :100.000");
        System.out.println("2.Double Reguler(kapasitas 2 orang)");
        System.out.println("harga :200.000");
        System.out.println("3.Premium(kapasitas 2 orang)");
        System.out.println("harga :250.000");
        System.out.println("4.Deluxe(kapasitas 2 orang)");
        System.out.println("harga :.350.000");
        System.out.println("5.Super Premium(kapasitas 2 orang)");
        System.out.println("harga :500.000");
        
        
    }

    

    

     
    
    
}
