package Rikkei.academy;

public class FizzBuzz {
    public static String FizzBuzz (int number){
        if(number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        } else if (number % 3 ==0) {
            return "Fizz";
        } else if (number % 5 ==0) {
            return "Buzz";
        }
        return "so ban dau" + number;
        }
    }
