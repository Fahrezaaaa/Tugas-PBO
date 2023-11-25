package Tugas59;


/*
 * Nama Kelompok : -Dava Pratma			(221106042987)
 * 				  -Fahreza Aldi Wildan  (221106042853)
 * Kelas : Reguler A
 * Program 59.Detective Conan : Untuk Menampilkan informasi karakter dalam detective Conan
 */

public class KarakterPendukung extends Karakter {
	  private String related;

	    public KarakterPendukung(String related, String name, String from, boolean eyeglasses) {
	        super(name, from, eyeglasses);
	        this.related = related;
	    }
	    
	    public String getRelated() {
	        return related;
	    }

	    public void TampilKarakter() {
	        
	        System.out.println("\nNama : " + name);
	        System.out.println("-----");
	        System.out.println("Dari : " + from);
	        if(eyeglasses) {
	            System.out.println("Kecamata : Iya");
	        } else {
	            System.out.println("Kecamata : Tidak");
	        }
	        System.out.println("Hubungan dengan tokoh utama : " + related);
	        System.out.println();
	    }  
	    
}
