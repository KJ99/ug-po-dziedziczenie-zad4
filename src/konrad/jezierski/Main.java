package konrad.jezierski;

public class Main {

    public static void main(String[] args) {
        Punkt2D p1 = new Punkt2D();
        Punkt2D p2 = new Punkt2D(10, 20);
        Punkt3D p3 = new Punkt3D();
        Punkt3D p4 = new Punkt3D(10, 20, 30);

        p1.wypisz();
        p2.wypisz();
        p3.wypisz();
        p4.wypisz();
    }
}
