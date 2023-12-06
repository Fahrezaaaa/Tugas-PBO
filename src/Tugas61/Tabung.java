package Tugas61;

/*
 * Nama Kelompok : -Dava Pratma			(221106042987)
 * 				  -Fahreza Aldi Wildan  (221106042853)
 * Kelas : Reguler A
 * Program 61.Bangun Ruang : untuk menampilkan Volume Bangun Ruang
 */

public class Tabung extends BangunRuang {
	   private float tinggi;

	    public Tabung(float jariJari, float tinggi) {
	        super(jariJari);
	        this.tinggi = tinggi;
	    }

	    @Override
	    public float hitungVolume() {
	        return (float) (Math.PI * tinggi  * Math.pow(jariJari,2));
	    }

	    public static void main(String[] args) {
	        BangunRuang kerucut, tabung, bola;
	        bola = new BolaBasket(7);
	        System.out.println("Volume Bola Basket");
	        bola.tampil();

	        kerucut = new Kerucut(14, 9);
	        System.out.println("Volume Bola Kerucut");
	        kerucut.tampil();

	        tabung = new Tabung(10, 21);
	        System.out.println("Volume Bola Tabung");
	        tabung.tampil();

	    }
}
