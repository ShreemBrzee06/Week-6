package Wk6hwk;
/*4.1 Declare two instance and two static variables.
 4.2 Declare one instance method.
 4.3 Declare one static method.
 4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.
 4.5 Declare the Main method.
 4.6 Call both instance and static methods into the Main method and run the programme.
*/
public class Question_4 {
    int num2 = 1,  num3 = 4;  static String l = "I love", j = "Java";  //4.1 Declare two instance and two static variables.


 public static void main(String[]args){ // 4.5 Declare the Main method.
     Question_4 x1 = new Question_4();
     x1.multiplication(); //4.6 Call both instance and static methods into the Main method and run the programme.
     x1.JavaName();
 }
    public void multiplication()// 4.2 Declare one instance method.
    { //4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.

        System.out.println(l +" "+ j);
        System.out.println(num2*num3);
    }

    public static void JavaName() //4.3 Declare one static method.
    { //4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.
        Question_4 x = new Question_4();
        System.out.println(l +" "+ j);
        System.out.println(x.num3 + x.num2);
    }


}

