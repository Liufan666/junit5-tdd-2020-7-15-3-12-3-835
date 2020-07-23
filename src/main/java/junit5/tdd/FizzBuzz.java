package junit5.tdd;

public class FizzBuzz {
    public String countOff(int inputNumber) {
        String result = String.valueOf(inputNumber);
        if(inputNumber%3==0){
            return "Fizz";
        }
        if(inputNumber==5){
            return "Buzz";
        }
        return result;
    }
}
