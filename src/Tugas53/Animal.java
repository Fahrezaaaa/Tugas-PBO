package Tugas53;

/*
 * Nama Kelompok : -Dava Pratma			(221106042987)
 * 				  -Fahreza Aldi Wildan  (221106042853)
 * Kelas : Reguler A
 * Program 53.Rabbit : untuk menampilkan Identitas Hewan
 */

public class Animal {

	 protected boolean vegetarian;
	    protected String eats;
	    protected int noOfLegs;
	    
	    public Animal(){
	        
	    }
	    
	    public boolean isVegetarian(){
	        if(vegetarian) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	    
	    public String getEats(){
	        return eats;
	    }
	    
	    public int getNoOfLegs(){
	        return noOfLegs;
	    }

	}

