package zivali;
public class Main {
    public static void main(String[] args) {       
        Pes p = new Pes("Rex", 5, 20, 1, 3);

        izpis(p); /* Izvede metodo izpis, ki izpise ime in starost. */

        System.out.println( "Priporocen dnevni vnos kalorij je: " + ((int)(p.priporocenDnevniVnosKalorij()) +   /* Program izpise priporocen dnevni vnos kalorij, porabo kalorij in priporoceno stevilo kalorij na obrok. */
         ", poraba kalorij znasa: " + ((int)(p.porabaKalorij()) + 
         ", zato je priporoceno stevilo kalorij na obrok: " + ((int)(p.kalorijeNaObrok()) + "." ))));
    }

    private static void izpis(Zival x) {
        System.out.println("Ime je " + x.getIme() + ".");
	    System.out.println("Starost je " + x.getStarost() + ".");
    }
}
