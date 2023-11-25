package Tugas57;

/*
 * Nama Kelompok : -Dava Pratma			(221106042987)
 * 				  -Fahreza Aldi Wildan  (221106042853)
 * Kelas : Reguler A
 * Program 57.Vechile : Untuk Menampilkan informasi Sepeda & Skateboard
 */

public class Bicycle extends Vechile {
	 private int myGearCount;
	    
	    public Bicycle(){
	        System.out.println("Bicycle");
	    }

	    public int getMyGearCount() {
	        return myGearCount;
	    }

	    public void setMyGearCount(int myGearCount) {
	        this.myGearCount = myGearCount;
	    }
}
