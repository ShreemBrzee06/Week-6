package Wk6hwk;
/* 18.1 Declare your council name as static variables.
 18.2 Declare your house number as instance variables.
 18.3 Declare one instance method name borough() and call Static variable
 18.4 Declare static method name address() and call instance variable
 18.5 Call both user defined methods into main method.
*/
public class Question_18
{   //18.1 Declare your council name as static variables.
    // 18.2 Declare your house number as instance variables.
    static String council = "Harrow"; int HN = 5;

    public static void main(String []args)
    { //18.5 Call both user defined methods into main method.
        Question_18 D1 = new Question_18();
        address();
        D1.borough();

    }
    public void borough()
    {//18.3 Declare one instance method name borough() and call Static variable
        System.out.println(council);
    }

    public static void address()
    {//18.4 Declare static method name address() and call instance variable
        Question_18 D = new Question_18();
        System.out.println(D.HN);

    }


}
