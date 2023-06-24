import java.util.Objects;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name, String fakultet, int conjure, int transgress, int nobility, int honor, int courage) {
        super(name, fakultet, conjure, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Gryffindor that = (Gryffindor) o;
        return nobility == that.nobility && honor == that.honor && courage == that.courage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, courage);
    }

    @Override
    public String toString() {
        return super.toString() +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                '}';
    }

    @Override
    public int sum() {
        return super.sum() + nobility + honor + courage;
    }

    public void srav(Gryffindor gryffindor) {
        if (this.sum() > gryffindor.sum()) {
            System.out.println(this.getName() + " лучший Грифиндорец чем " + gryffindor.getName());
        } else {
            System.out.println(gryffindor.getName() + " лучший Грифиндорец чем " + this.getName());

        }
    }
}
