import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in) ;
        System.out.println("Enter your character grade :");
        char grade = cin.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("Excellant");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail");
            default:
                System.out.println("Invalde grade");
        }}
}