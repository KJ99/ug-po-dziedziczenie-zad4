package konrad.jezierski;

public class Punkt3D extends Punkt2D {
    private int z;
    public Punkt3D() {
        super();
        this.z = 0;
    }
    public Punkt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void wypisz() {
        System.out.printf("(%d, %d, %d)\n", this.x, this.y, this.z);
    }
}
