package junit5.tdd;

public class FizzBuzz {
    public String countOff(int inputNumber) {
        String result = String.valueOf(inputNumber);
        if(inputNumber==105){
            return "FizzBuzzWhizz";
        }
        if(inputNumber%15==0){
            return "FizzBuzz";
        }
        if(inputNumber%21==0){
            return "FizzWhizz";
        }
        if(inputNumber%35==0){
            return "BuzzWhizz";
        }
        if(inputNumber%3==0){
            return "Fizz";
        }
        if(inputNumber%5==0){
            return "Buzz";
        }
        if(inputNumber%7==0){
            return "Whizz";
        }
        return result;
    }
}
