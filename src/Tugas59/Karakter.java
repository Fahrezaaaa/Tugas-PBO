package Tugas59;

/*
 * Nama Kelompok : -Dava Pratma			(221106042987)
 * 				  -Fahreza Aldi Wildan  (221106042853)
 * Kelas : Reguler A
 * Program 59.Detective Conan : Untuk Menampilkan informasi karakter dalam detective Conan
 */

public class Karakter {
	 protected String name;
	    protected String from;
	    protected boolean eyeglasses;
	    
	    public Karakter(String name, String from, boolean eyeglasses) {
	        this.name = name;
	        this.from = from;
	        this.eyeglasses = eyeglasses;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getFrom() {
	        return from;
	    }
}


