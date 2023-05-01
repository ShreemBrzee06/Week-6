package Wk6hwk;
/*19.1 Declare one of your group member names as instance variable.
 19.2 Declare one of your group member names as static variable.
 19.3 Declare one instance method name with group name (e.g. selenium())and call both global  variables.
 19.4 Declare static method name agile() and call both variable
 19.5 Call both user defined methods into main method.
Note: Declare 1 local variables in all user defined method and main method and print in to statement
*/
public class Question_19
{//19.1 Declare one of your group member names as instance variable.
 //19.2 Declare one of your group member names as static variable.

 String nm1 = "Hemi"; static String nm2 = "Faluben";

 public static void main(String[]args)
 {//19.5 Call both user defined methods into main method.
     String R = "Radhe";
     Question_19 e1 = new Question_19();
     e1.Postman();
     agile();
     System.out.println(R);
 }
 public void Postman()
 {//19.3 Declare one instance method name with group name (e.g. selenium())and call both global  variables.
     String K = "Krisha";
     System.out.println(K);
     System.out.println(nm1);
     System.out.println(nm2);

 }

 public static void agile()
 {//19.4 Declare static method name agile() and call both variable
     String B = "Balaram";
     Question_19 e = new Question_19();
     System.out.println(B);
     System.out.println(e.nm1);
     System.out.println(nm2);


 }

}
