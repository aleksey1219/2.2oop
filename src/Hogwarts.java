import java.util.Objects;

public class Hogwarts {
    private String name;
    private String fakultet;
    private int conjure;
    private int transgress;

    public Hogwarts(String name, String fakultet, int conjure, int transgress) {
        this.name = name;
        this.fakultet = fakultet;
        this.conjure = conjure;
        this.transgress = transgress;
    }

    public int getConjure() {
        return conjure;
    }

    public void setConjure(int conjure) {
        this.conjure = conjure;
    }

    public int getTransgress() {
        return transgress;
    }

    public void setTransgress(int transgress) {
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFakultet() {
        return fakultet;
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return conjure == hogwarts.conjure && transgress == hogwarts.transgress && Objects.equals(name, hogwarts.name) && Objects.equals(fakultet, hogwarts.fakultet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conjure, transgress, name, fakultet);
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", fakultet='" + fakultet + '\'' +
                ", conjure=" + conjure +
                ", transgress=" + transgress +
                '}';
    }

    public int sum() {
        return conjure + transgress;
    }

    public void srav(Hogwarts fak) {
        if (this.sum() > fak.sum()) {
            System.out.println(this.name + " сильнее чем " + fak.getName());
        } else {
            System.out.println(fak.getName() + " сильнее чем " + this.name);

        }

    }
}

