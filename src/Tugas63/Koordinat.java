package Tugas63;

/*
 * Nama Kelompok : -Dava Pratma			(221106042987)
 * 				  -Fahreza Aldi Wildan  (221106042853)
 * Kelas : Reguler A
 * Program 63.Gradien Garis Lurus : untuk menampilkan Garis Garis Gradient
 */


public class Koordinat implements GarisLurus {
    private int x1, y1, x2, y2;
    
    public Koordinat(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }
   
    public int hitungGradien() {
        return (y2 - y1) / (x2 - x1);
    }
    public static void main(String[] args) {
        Koordinat koordinat1 = new Koordinat(2, 10, 5, 7);
        System.out.println("Garis yang melalui titik (" + koordinat1.getX1() 
                + "," + koordinat1.getY1() + ") dan (" + koordinat1.getX2() 
                + "," + koordinat1.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + koordinat1.hitungGradien());
        
        System.out.println();
        
        Koordinat koordinat2 = new Koordinat(5, 1, 3, 12);
        System.out.println("Garis yang melalui titik (" + koordinat2.getX1() 
                + "," + koordinat2.getY1() + ") dan (" + koordinat2.getX2() 
                + "," + koordinat2.getY2() + ")");
        System.out.println("memiliki gradien sebesar " + koordinat2.hitungGradien());
    }
    
}