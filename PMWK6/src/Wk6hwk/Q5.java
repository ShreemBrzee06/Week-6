package Wk6hwk;
/*Write a program for a calculator with addition, subtraction, multiplication, and division  methods all with parameters and use string concatenation methods.
(Note: Two static  and Two instance methods.)
 * */
public class Q5 {

    public static void main(String[]args)
    {   Q5 t = new Q5();
        add(5,5);
        sub(10,5);
        t.mul(5,5);
        t.div(5,5);


    }

    public static void add(int a, int b)
    {
        System.out.println("Addition:" +a+b);
    }

    public static void sub(int a, int b)
    {
        System.out.println("Subtraction:" +(a-b));
    }

    public void mul(int a , int b)
    {   Q5 t = new Q5();
        System.out.println("Multiplication:" +(a*b));
    }

    public void div(int a, int b)
    {   Q5 t = new Q5();
        System.out.println("Division:" +(a/b));
    }




}
