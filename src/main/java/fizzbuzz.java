public class fizzbuzz {
    public String out(int i) {
        // TODO Auto-generated method stub
        String result = "";
        if (i % 3 == 0)
            result += "Fizz";
        if (i % 5 == 0)
            result += "Buzz";
        if (result == "")
            result += i;
        return result;
    }
}
