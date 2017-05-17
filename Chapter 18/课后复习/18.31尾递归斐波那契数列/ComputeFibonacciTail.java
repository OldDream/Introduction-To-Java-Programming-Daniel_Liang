import java.util.Scanner; 

public class ComputeFibonacciTail {
  /** Main method */
  private static int counter = 0;
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an index for the Fibonacci number: ");
    long index = input.nextLong();

    long startTime = System.currentTimeMillis();    //获取当前时间

    long[] resultAry = {0, 1};
    // Find and display the Fibonacci number
    long result = fib(index, 1, resultAry); //改为尾递归
    System.out.println("Fibonacci number at index " + index + " is " + result);
    System.out.println("Called fib " + counter + " times.");

    long endTime = System.currentTimeMillis();
    System.out.println("程序运行时间："+(endTime-startTime)+"ms");
  }

  /** The method for finding the Fibonacci number */
  public static long fib(long index, long high, long[] result) {
    counter++;
    if (high < index) {
      long temp = result[1];
      result[1] = result[0] + result[1];
      result[0] = temp;
      return fib(index, high + 1, result);
    }
    else if (high > index) {    //Base Case.
      return result[0];
    }
    else if (index == 1) {
      return result[1];
    }
    else
      return result[1];






    /*counter++;
    if (index == 0)
      return result = 0;
    else if (index == 1) // Base case
      return result = 1;
    else if() { // Reduction and recursive calls
      return result = fib(index - 1, result) + fib(index - 2, result);
    }*/
  }
}
