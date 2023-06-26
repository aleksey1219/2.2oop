import java.util.Objects;

public class Cogtevran extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;

    public Cogtevran(String name, String fakultet, int conjure, int transgress, int smart, int wise, int witty) {
        super(name, fakultet, conjure, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cogtevran cogtevran = (Cogtevran) o;
        return smart == cogtevran.smart && wise == cogtevran.wise && witty == cogtevran.witty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), smart, wise, witty);
    }

    @Override
    public String toString() {
        return super.toString() +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                '}';
    }

    @Override
    public int sum() {
        return super.sum() + smart + wise + witty;
    }


    public void srav(Cogtevran cogtevran) {
        if (this.sum() > cogtevran.sum()) {
            System.out.println(this.getName() + " лучший Когтевранец чем " + cogtevran.getName());
        } else {
            System.out.println(cogtevran.getName() + " лучший Когтевранец чем " + this.getName());

        }
    }
}
