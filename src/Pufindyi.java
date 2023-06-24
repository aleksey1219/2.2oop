import java.util.Objects;

public class Pufindyi extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Pufindyi(String name, String fakultet, int conjure, int transgress, int hardworking, int loyal, int honest) {
        super(name, fakultet, conjure, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pufindyi pufindyi = (Pufindyi) o;
        return hardworking == pufindyi.hardworking && loyal == pufindyi.loyal && honest == pufindyi.honest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hardworking, loyal, honest);
    }

    @Override
    public String toString() {
        return super.toString() +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                '}';
    }

    @Override
    public int sum() {
        return super.sum() + hardworking + loyal + honest;
    }

    public void srav(Pufindyi pufindyi) {
        if (this.sum() > pufindyi.sum()) {
            System.out.println(this.getName() + " лучший Пуфиндуец чем " + pufindyi.getName());
        } else {
            System.out.println(pufindyi.getName() + " лучший Пуфиндуец чем " + this.getName());

        }
    }
}
