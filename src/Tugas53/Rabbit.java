package Tugas53;
import java.util.Scanner;

/*
 * Nama Kelompok : -Dava Pratma			(221106042987)
 * 				  -Fahreza Aldi Wildan  (221106042853)
 * Kelas : Reguler A
 * Program 53.Rabbit : untuk menampilkan Identitas Hewan
 */

public class Rabbit extends Animal {
	private String Color;
	private String Name;
	
	 public Rabbit(String name,boolean veg,String food,int Legs, String Color) {
		        this.Name = name;
		        this.Color = Color;
		        this.vegetarian = veg;
		        this.eats = food;
		        this.noOfLegs = Legs;
		    }
		    
		    public String getColor(){
		        return Color;
		    }
		    public String getName(){
		        return Name;
		    }
		    public static void main(String[] args) {
		    	
		    	 Scanner scan = new Scanner(System.in);
		        Rabbit Rabbit = new Rabbit("Peter", false, "Grass", 4, "grey");
		        Rabbit.isVegetarian();
		        Rabbit.getEats();
		        Rabbit.getNoOfLegs();
		        
		        System.out.println("Hello, his name is "+Rabbit.getName());
		        System.out.println(Rabbit.getName()+" is vegetarian? "+Rabbit.isVegetarian());
		        System.out.println(Rabbit.getName()+" eat "+Rabbit.getEats());
		        System.out.println(Rabbit.getName()+" has "+Rabbit.noOfLegs+" legs");
		        System.out.println(Rabbit.getName()+" color is "+Rabbit.getColor());
		       
		    }
		    
		}
	
