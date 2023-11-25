package Tugas58;

/*
 * Nama Kelompok : -Dava Pratma			(221106042987)
 * 				  -Fahreza Aldi Wildan  (221106042853)
 * Kelas : Reguler A
 * Program 58. Kurang tambah: untuk menampilkan Hasil penjumlahan dan selisih
 */

public class SelisihBilangan extends Bilangan{	    
    public void tampilSelisih(){
        int selisih = getX() - getY();
        System.out.println("Hasil Selisih "+getX()+" - "+getY()+" = "+ selisih);
	    }   
    
    public static void main(String[] args) {
        
        JumlahBilangan x = new JumlahBilangan();
        SelisihBilangan y = new SelisihBilangan();
        
        x.tampilHasilJumlah();
        y.tampilSelisih();
    }
    
}