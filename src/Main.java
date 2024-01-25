import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //! Reference Types / Objects
        int age = 12;
        Point pointA = new Point(10, 10); 
    }

    private void primitives(){
        //! primitives
        int numOne = 1;
        double numTwo = 3.3;
        double result = numOne + numTwo;

        boolean isAdult = true;
        char a = 'a';
        byte b = 127;
        short shNum = 32000;

    }
    private void strings(){
        String text = "hello!";
        System.out.println(text.toUpperCase());
        System.out.println(text.isBlank());
        System.out.println(text.length());
    }
}