import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Hogwarts h1 = new Hogwarts("Волендеморт ", "хогвардтс", random.nextInt(101), random.nextInt(101));
        System.out.println(h1);
        Gryffindor h5 = new Gryffindor("harry", "Gryffindor", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Gryffindor h2 = new Gryffindor("Гермиона ", "Gryffindor", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        System.out.println(h2);
        h1.srav(h2);
        Cogtevran h4 = new Cogtevran("Чжоу ", "cogtevran", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Cogtevran h3 = new Cogtevran("Падма ", "cogtevran", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        h4.srav(h3);
        h4.srav(h2);
        Slizeren h6 = new Slizeren("Драко  ", "Slizeren", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Slizeren h8 = new Slizeren("Грэхэм  ", "Slizeren", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Pufindyi h9 = new Pufindyi("Захария   ", "Pufindyi", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
        Pufindyi h10 = new Pufindyi("Седрик   ", "Pufindyi", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101));
    }
}