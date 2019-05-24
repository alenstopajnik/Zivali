package zivali;
public class Main {
    public static void main(String[] args) {       
        Pes p = new Pes("Rex", 5, 20, 1, 3);
        System.out.println(p); /* Program izpise ime in starost iz glavnega razreda ter priporocen dnevni vnos kalorij, porabo kalorij in priporoceno stevilo kalorij na obrok iz izpeljanega razreda. */
        p.lajez();
    }
}
