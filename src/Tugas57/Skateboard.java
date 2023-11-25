package Tugas57;

/*
 * Nama Kelompok : -Dava Pratma			(221106042987)
 * 				  -Fahreza Aldi Wildan  (221106042853)
 * Kelas : Reguler A
 * Program 57.Vechile : Untuk Menampilkan informasi Sepeda & Skateboard
 */

public class Skateboard extends Vechile {
	 public double myBoardLength;
	    
	    public Skateboard(){
	        System.out.println("Skateboard");  
	    }

	    public double getMyBoardLength() {
	        return myBoardLength;
	    }

	    public void setMyBoardLength(double myBoardLength) {
	        this.myBoardLength = myBoardLength;
	    }
	    
	    public static void main(String[] args) {
	        
	        Bicycle x = new Bicycle();       
	        
	        x.setMyBrand("Trek Bike");
	        x.setMyModel("7.4FX");
	        x.setMyGearCount(23);
	        
	        System.out.println("Brand : "+x.getMyBrand());
	        System.out.println("Model : "+x.getMyModel());
	        System.out.println("Jumlah Gear : "+x.getMyGearCount());
	        System.out.println("");
	        
	        Skateboard y = new Skateboard();
	        
	        y.setMyBrand("Ally Skate");
	        y.setMyModel("Rocket");
	        y.setMyBoardLength(54.5);
	        
	        System.out.println("Brand : "+y.getMyBrand());
	        System.out.println("Model : "+y.getMyModel());
	        System.out.println("Jumlah Gear : "+y.getMyBoardLength());
	        
	    }
	    
}
