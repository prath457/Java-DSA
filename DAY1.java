1. Program To Print Hello World

  public class Hello World{
  public static void main(String args[]){
  System.out.println("Hello World!");
  }
}

 2. Perform Arithmetic Operations on Two Numbers

  public class Operations{
  public static void main(String args[]){
  int a = 10, b = 5;
  System.out.println("Addition: " + (a + b));
  System.out.println("Subtraction: " + (a - b));
  System.out.println("Multplication: " + (a * b));
  System.out.println("Devision: " + (a / b));
  System.out.println("Module: " + (a % b));
  }
}
                                  
3. Accept Values from User and Display Them

  import java.util.Scanner;
public class acceptname{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int num = sc.nextInt();

    System.out.println("Enter a name: ");
    String name = sc.name();

    System.out.println("number" + num);
    System.out.println("Name" + name);
  }
}

4. Accept 5 Subjects Marks, Calculate Total and Average

  import java.util.Scanner;
  public class average{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter marks of Subject1: ");
      int m1 = sc.nextInt();
      System.out.println("Enter marks of Subject2: ");
      int m2 = sc.nextInt();
      System.out.println("Enter marks of Subject3: ");
      int m3 = sc.nextInt();
      System.out.println("Enter marks of Subject4: ");
      int m4 = sc.nextInt();
      System.out.println("Enter marks of Subject5: ");
      int m5 = sc.nextInt();

      int total= m1 + m2 + m3 + m4 + m5;
      float average = total/5f;

      System.out.println("Total marks= " + total);
      System.out.println("average marks= " + average);
    }
  }

5. Calculate Square and Square Root of a Number

  import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        double square = num * num;
        double sqrt = Math.sqrt(num);

        System.out.println("Square: " + square);
        System.out.println("Square Root: " + sqrt);
    }
}
  
6. Swap 2 Numbers With Temporary Variable
  
public class SwapWithTemp {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}

      
      
      
