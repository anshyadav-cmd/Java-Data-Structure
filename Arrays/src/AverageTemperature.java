import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many days' temperature? ");
        int noDays = scanner.nextInt();
        int [] temperatures = new int[noDays];

        int sum = 0;
        for(int i = 0; i < noDays ; i++) {
            System.out.print("Day " + (i + 1) + "'s high temperature: ");
            temperatures[i] = scanner.nextInt();
            sum += temperatures[i];
        }
        float average = sum / noDays;
        System.out.println("Average = " + average);
    }
}
