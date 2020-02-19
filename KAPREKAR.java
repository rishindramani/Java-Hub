import java.util.Scanner;
public class KAPREKAR {
// main method begins execution of this class
public static void main(int n) {
int square, temp, counter = 0, rem, quo;
temp = n;
square = n * n;
while (n != 0) {
counter++;
n = n / 10;
}
rem = square % ((int) Math.pow(10, counter));
quo = square / ((int) Math.pow(10, counter));
if ((rem + quo) == temp) {
System.out.println(temp + " is a kaprekar number ");
} else {
System.out.println(temp + " is not a kaprekar number ");
}
} // end method main
} // end class