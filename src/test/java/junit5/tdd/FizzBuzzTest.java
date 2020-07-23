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


}