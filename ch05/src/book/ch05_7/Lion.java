package book.ch05_7;

public class Lion extends Animal implements Predator{
    @Override
    public String getFood(){
        return "banana";
    }

}
