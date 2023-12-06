package Tugas61;

/*
 * Nama Kelompok : -Dava Pratma			(221106042987)
 * 				  -Fahreza Aldi Wildan  (221106042853)
 * Kelas : Reguler A
 * Program 61.Bangun Ruang : untuk menampilkan Volume Bangun Ruang
 */

public class Kerucut extends BangunRuang {
	  private float tinggi;

	    public Kerucut(float jarijari, float tinggi) {
	        super(jarijari);
	        this.tinggi = tinggi;
	    }

	    @Override
	    public float hitungVolume() {
	        return (float) (1/3f * Math.PI * Math.pow(jariJari, 2) * tinggi);
    }
}
