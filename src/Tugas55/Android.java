package Tugas55;

/*
 * Nama Kelompok : -Dava Pratma			(221106042987)
 * 				  -Fahreza Aldi Wildan  (221106042853)
 * Kelas : Reguler A
 * Program 55.HandPhone : Untuk Menampilkan informasi Handphone
 */

public class Android extends Handphone {
	 private String keyStore;
	    
	    public Android(String man, String os, String model, int harga){
	        this.manufacture = man;
	        this.operatingSystem = os;
	        this.model = model;
	        this.harga = harga;
	    }

	    public String getKeyStore() {
	        return keyStore;
	    }

	    public void setKeyStore(String keyStore) {
	        this.keyStore = keyStore;
	    }
	    
	    
}
