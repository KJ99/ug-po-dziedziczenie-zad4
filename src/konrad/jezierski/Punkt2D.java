package konrad.jezierski;

public class Punkt2D {
    protected int x;
    protected int y;
    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punkt2D() {
        this.x = 0;
        this.y = 0;
    }

    public void wypisz() {
        System.out.printf("(%d, %d)\n", this.x, this.y);
    }

}
