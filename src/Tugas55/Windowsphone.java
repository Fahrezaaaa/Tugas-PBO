package Tugas55;

/*
 * Nama Kelompok : -Dava Pratma			(221106042987)
 * 				  -Fahreza Aldi Wildan  (221106042853)
 * Kelas : Reguler A
 * Program 59.Detective Conan : Untuk Menampilkan informasi karakter dalam detective Conan
 */
 

public class Windowsphone extends Handphone  {
	private String wpKeyStore;
    
	 public Windowsphone(String man, String os, String model, int harga){
	        this.manufacture = man;
	        this.operatingSystem = os;
	        this.model = model;
	        this.harga = harga;
	    }

	    public String getWpKeyStore() {
	        return wpKeyStore;
	    }

	    public void setWpKeyStore(String wpKeyStore) {
	        this.wpKeyStore = wpKeyStore;
	    }
	    
	    public static void main(String[] args) {
	       
	        
	        Android android = new Android("Samsung", "Android", "Grand", 3000000);
	        Blackberry blackberry = new Blackberry("BlackB", "RIM", "Curve", 2000000);
	        Windowsphone windows = new Windowsphone("Nokia", "Win8", "Lumia", 1000000);
	        
	        android.displayProduct();
	        android.setKeyStore("234ibfd3840fo");
	        System.out.println("Andorid Key Store : "+android.getKeyStore());
	        System.out.println("");
	        
	        blackberry.displayProduct();
	        blackberry.setPinBB("BHS249");
	        System.out.println("PIN : "+blackberry.getPinBB());
	        System.out.println("");
	        
	        windows.displayProduct();
	        windows.setWpKeyStore("UUUQIJWORJ");
	        System.out.println("Wp Key Store : "+windows.getWpKeyStore());
	        System.out.println("");
	    }

}



