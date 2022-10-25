public class FizzBuzz {
    public String getFizzyBuzz(int number){
    String result = "";
    if(number%3==0 && number%5!=0){
        result="Fizz";
    }
    else if(number%5==0 && number%3!=0){
        result="Buzz";
    }
    else if(number%5==0 && number%3==0)
    {
        result="Fizzbuzz";
    }
    else if(number%5!=0 && number%3!=0)
    {
        result ="Boom";
    }
    return result;
    }
}
