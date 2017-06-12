public class EvenorOdd {
    
    public static void main(String[] args){
        System.out.println("2 is " + even_or_odd(2));
        System.out.println("3 is " + even_or_odd(3));
    }

    public static String even_or_odd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

}
