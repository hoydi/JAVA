package book.ch05_7;

public class AnimalMain {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        zookeeper.feed(lion);
        zookeeper.feed(tiger);

    }
}
