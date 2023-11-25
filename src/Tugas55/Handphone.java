package Tugas55;

/*
 * Nama Kelompok : -Dava Pratma			(221106042987)
 * 				  -Fahreza Aldi Wildan  (221106042853)
 * Kelas : Reguler A
 * Program 55.HandPhone : Untuk Menampilkan informasi Handphone
 */

public class Handphone {
	    protected String manufacture;
	    protected String operatingSystem;
	    protected String model;
	    protected int harga;
	    
	    public Handphone(){
	    
	        
	    }
	    
	    public void displayProduct(){
	        System.out.println("Manufatur : "+manufacture);
	        System.out.println("OS : "+operatingSystem);
	        System.out.println("Model : "+model);
	        System.out.println("Harga : "+harga);
	    }
	    
}
