package Tugas61;

/*
 * Nama Kelompok : -Dava Pratma			(221106042987)
 * 				  -Fahreza Aldi Wildan  (221106042853)
 * Kelas : Reguler A
 * Program 61.Bangun Ruang : untuk menampilkan Volume Bangun Ruang
 */

public  abstract class BangunRuang {
	 protected float jariJari;
	    
	    public BangunRuang(float jariJari){
	        this.jariJari = jariJari;
	    }
	    
	    public abstract float hitungVolume();
	    
	    public void tampil(){
	        System.out.printf("Volume : %.0f cm%n", Math.ceil(hitungVolume()));
	    }
	    
}
