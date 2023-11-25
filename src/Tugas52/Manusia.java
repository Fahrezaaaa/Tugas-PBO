package Tugas52;

/*
 * Nama Kelompok : -Dava Pratma			(221106042987)
 * 				  -Fahreza Aldi Wildan  (221106042853)
 * Kelas : Reguler A
 * Program 52. Siapa kamu : untuk menampilkan identitas siapa kamu
 */

public class Manusia {
	  protected String nama;
	    protected int umur;

	    public String getNama() {
	        return nama;
	    }

	    public void setNama(String nama) {
	        this.nama = nama;
	    }

	    public int getUmur() {
	        return umur;
	    }

	    public void setUmur(int umur) {
	        this.umur = umur;
	    }
	    
	    public void siapaKamu(){
	        System.out.println("Saya Manusia"); 
	    }
	    

}
