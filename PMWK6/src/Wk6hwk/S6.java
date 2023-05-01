package Wk6hwk;
/*Write a java program which replace a “I@love@java” to “we love java”
Expected output: We love java*/
public class S6 {
    public static void main(String[] args)
    {
        String a = "I@love@java";
        String b = a.replace("@"," ");
        String c= b.replace("I","We");
        System.out.println("Expected output:" + " "+ c);

    }
}
