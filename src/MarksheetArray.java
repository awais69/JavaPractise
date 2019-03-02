import java.util.Scanner;

public class MarksheetArray {
    public static void main(String[] args) {
        int[] marks = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st subject marks");
        marks[0] = s.nextInt();
        System.out.println("Enter 2nd subject marks");
        marks[1] = s.nextInt();
        System.out.println("Enter 3rd subject marks");
        marks[2] = s.nextInt();
        System.out.println("Enter 4th subject marks");
        marks[3] = s.nextInt();
        System.out.println("Enter 5th subject marks");
        marks[4] = s.nextInt();

        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }

        System.out.println("\nTotal Marks : "+total);

        int percentage = (total*100)/500;

        System.out.println("\nYour percentage is : "+percentage);

    }
}
