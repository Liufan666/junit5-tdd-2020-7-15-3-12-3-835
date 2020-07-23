package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class FizzBuzzTest {
    @Test
    public void should_return_1_when_count_off_given_1(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 1;
        //when
        String result = fizzBuzz.countOff(inputNumber);
        //then
        assertEquals("1",result);
    }
    @Test
    public void should_return_fizz_when_count_off_given_3(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 3;
        //when
        String result = fizzBuzz.countOff(inputNumber);
        //then
        assertEquals("Fizz",result);
    }
    @Test
    public void should_return_buzz_when_count_off_given_5(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 5;
        //when
        String result = fizzBuzz.countOff(inputNumber);
        //then
        assertEquals("Buzz",result);
    }
    @Test
    public void should_return_fizzbuzz_when_count_off_given_15(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 15;
        //when
        String result = fizzBuzz.countOff(inputNumber);
        //then
        assertEquals("FizzBuzz",result);
    }
    @Test
    public void should_return_whizz_when_count_off_given_7(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 7;
        //when
        String result = fizzBuzz.countOff(inputNumber);
        //then
        assertEquals("Whizz",result);
    }
    @Test
    public void should_return_fizzwhizz_when_count_off_given_21(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int inputNumber = 21;
        //when
        String result = fizzBuzz.countOff(inputNumber);
        //then
        assertEquals("FizzWhizz",result);
    }


}