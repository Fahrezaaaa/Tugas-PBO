package Tugas61;

/*
 * Nama Kelompok : -Dava Pratma			(221106042987)
 * 				  -Fahreza Aldi Wildan  (221106042853)
 * Kelas : Reguler A
 * Program 61.Bangun Ruang : untuk menampilkan Volume Bangun Ruang
 */

public class BolaBasket extends BangunRuang {
    
	  public BolaBasket(float jarijari) {
	        super(jarijari);
	    }

	   
	    public float hitungVolume() {
	        return (float) (4/3f * Math.PI * Math.pow(jariJari, 3));
	    }
	    
    
    
    
}
