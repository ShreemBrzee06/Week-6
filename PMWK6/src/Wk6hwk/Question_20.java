package Wk6hwk;
/*
 20.1 Declare Spain as static variable.
 20.2 Declare United Kingdom as instance variable.
 20.3 Declare instance method name homeCountry()and call static variable.
 20.4 Declare static method name holidays() and call instance variable
 20.5 Call both methods in main method.

 */
public class Question_20 {//20.1 Declare Spain as static variable.
    //20.2 Declare United Kingdom as instance variable.
    static String sp = "Spain";
    String ctry = "United Kingdom";

    public static void main(String[]args)
    {//20.5 Call both methods in main method.
        Question_20 h1 = new Question_20();
        h1.homeCountry();
        holidays();

    }

    public void homeCountry()
    {//.3 Declare instance method name homeCountry()and call static variable.
        System.out.println(sp);
    }
    public static void holidays()
    {//20.4 Declare static method name holidays() and call instance variable
        Question_20 h = new Question_20();
        System.out.println(h.ctry);


    }



}
