package zivali;
public class Main {
    public static void main(String[] args) {       
        Pes p = new Pes("Rex", 5, "rjava", "zlati prinasalec", 2);
        izpis(p);
        System.out.println("Pasma je "+ p.getPasma() + ".");
        p.nahrani();
        p.sprehod();    
        System.out.println("Sitost je " + p.getSitost() + ".");
        p.lajanje();           
    }

    private static void izpis(Zival x) {
        System.out.println("Ime je " + x.getIme() + ".");
	    System.out.println("Starost je " + x.getStarost() + " let.");
	    System.out.println("Barva je " + x.getBarva() + ".");
    }
}
