import java.util.Objects;

public class Slizeren extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;

    public Slizeren(String name, String fakultet, int conjure, int transgress, int cunning, int determination, int ambition) {
        super(name, fakultet, conjure, transgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Slizeren slizeren = (Slizeren) o;
        return cunning == slizeren.cunning && determination == slizeren.determination && ambition == slizeren.ambition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, determination, ambition);
    }

    @Override
    public String toString() {
        return super.toString() +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                '}';
    }

    @Override
    public int sum() {
        return super.sum() + cunning + determination + ambition;
    }

    public void srav(Slizeren slizeren) {
        if (this.sum() > slizeren.sum()) {
            System.out.println(this.getName() + " лучший Слизеринец чем " + slizeren.getName());
        } else {
            System.out.println(slizeren.getName() + " лучший Слизеринец чем " + this.getName());

        }
    }
}
