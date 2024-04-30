package ex;

class Calculator {
    int value;

    Calculator() {
        this.value=0;
    }

    void add(int val){
        this.value+=val;
    }

    int getValue(){
        return this.value;
    }

    boolean idOdd(int val){
        if(val%2!=0){
            return true;
        }
        return false;
    }

    double avg(int[] vals){
        int sum=0;
        for(int val : vals){
            sum+=val;
        }
        return (double)sum/vals.length;
    }

}

class UpgradeCaculator extends Calculator {
    void minus(int val){
        this.value-=val;
    }

}

class MaxLimitCalculator extends UpgradeCaculator {
    void add(int val){
        this.value+=val;

        if(this.value>100){
            this.value=100;
        }
    }


}



public class Sample {
    public static void main(String[] args) {

        MaxLimitCalculator cal = new MaxLimitCalculator();
        cal.add(10);
        cal.minus(3);
        System.out.println(cal.getValue());

        cal.add(100);
        System.out.println(cal.getValue());

        System.out.println(cal.idOdd(3));
        System.out.println(cal.idOdd(4));

        int[] data ={1,3,5,7,10};
        System.out.println(cal.avg(data));


        //q5. 4. 동일한 리스트 객체이기 때문
        //q6. Integer 자료형에 값이 대입되지 않을 경우 null이기 때문에 생성자를 만들고 초깃값을 설정해야한다.
        //q8. 
    }
}
