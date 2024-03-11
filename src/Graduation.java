import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();

        int counter = 1;
        int excluded = 0;
        double sum = 0;
        while(counter <= 12){
            double grade = Double.parseDouble(scanner.nextLine());

            if(grade < 4.00){
                excluded++;
                if(excluded >= 2){
                    System.out.printf("%s has been excluded at %d grade", studentName, counter);
                    break;
                }
                continue;
            }
            sum = sum + grade;
            counter++;
        }
        if(excluded < 2 ) {
            System.out.printf("%s graduated. Average grade: %.2f", studentName, sum / 12);
        }
    }
}
