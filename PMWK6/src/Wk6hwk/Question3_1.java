package Wk6hwk;
/*3.1 Declare one instance and one static variable.
    3.2 Declare one instance method.
    3.3 Declare one static method.
    3.4 Call both instance and static variables into both instance and static methods inside the  print statement.
    3.5 Declare the Main method.
    3.6 Call both instance and static methods into the Main method and run the programme.
*/
public class Question3_1 {
    int num = 5; static int num1 = 10; // Declare one instance and one static variable.

    public static void main(String[]args)
    { //3.5 Declare the Main method.

        add();

        Question3_1 z1 = new Question3_1();   //3.6 Call both instance and
                                            // static methods into the Main method and run the programme.
        z1.subtraction();

    }
    public static void add() // 3.3 Declare one static method.
    {
    Question3_1 z = new Question3_1();
        System.out.println(num1 + z.num);   //3.4 Call both instance and static variables
                                            // into both instance and static methods inside the  print statement.
    }

    public void subtraction()// 3.2 Declare one instance method.
    {
        System.out.println(num1-num); //3.4 Call both instance and static variables
                                      // into both instance and static methods inside the  print statement.
    }



}
