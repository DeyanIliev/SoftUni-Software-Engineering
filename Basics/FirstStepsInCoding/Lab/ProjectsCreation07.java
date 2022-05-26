package Basics.FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ProjectsCreation07 {
    public static void main(String[] args) {
        //От конзолата се четат 2 реда:
        //1.	Името на архитекта - текст
        //2.	Брой на проектите, които трябва да изготви - цяло число в интервала [0 … 100]
        //На конзолата се отпечатва:
        //•	"The architect {името на архитекта} will need {необходими часове} hours to complete {брой на проектите} project/s."


        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int projects = Integer.parseInt(scanner.nextLine());

        int hours = projects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hours, projects);

    }
}
