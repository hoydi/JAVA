package book.ch05_7;

public class Tiger extends Animal implements Predator {
    @Override
    public String getFood(){
        return "apple";
    }

}
