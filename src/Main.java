import java.util.Collections;
import java.util.Scanner; import java.util.Arrays;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {

        int allSalaryCost = 0;
        Employee[] emp = new Employee[10] ;

        emp[0] = new Employee("Isabelle", "Goubinskaya", 5, 789456, 1);
        emp[1] = new Employee("Andrei", "Gefer", 4, 1, 2);
        emp[2] = new Employee("Ouinie", "Lourson", 4, 11212, 3);

        emp[0].showData();
        emp[1].showData();
        emp[2].showData();

        allSalaryCost = emp[0].salary + emp[1].salary + emp[2].salary;
        System.out.println("The global amount of all salary is : " + allSalaryCost);

        int min = 0;
        int max =0;

        // I don't understand why it doesn't work, it seems that i can't parse my array properly
        /*

        for (int i =0; i < emp.length; i++){
            if (min < emp[i].salary){

                min = emp[i].salary;

            }
        }

        */

        if(emp[0].salary < emp[1].salary && emp[0].salary < emp[2].salary) {
            min = emp[0].salary;
        } else if (emp[1].salary < emp[0].salary && emp[1].salary < emp[2].salary) {
            min = emp[1].salary;
        }else {
            min = emp[2].salary;
        }

        if(emp[0].salary > emp[1].salary && emp[0].salary > emp[2].salary) {
            max = emp[0].salary;
        } else if (emp[1].salary > emp[0].salary && emp[1].salary > emp[2].salary) {
            max = emp[1].salary;
        }else {
            min = emp[2].salary;
        }

        System.out.println("minimum salary is " + min);
        System.out.println("maximum salary is " + max);

        int averageSalary =0;
        averageSalary = emp[0].salary + emp[1].salary + emp[2].salary;
        averageSalary = averageSalary /3;
        System.out.println("average salary is " + averageSalary);

        System.out.println("fullname of employee " + emp[0].jobID + " " + emp[0].firstName + " " + emp[0].lastName);
        System.out.println("fullname of employee " + emp[1].jobID + " " + emp[1].firstName + " " + emp[1].lastName);
        System.out.println("fullname of employee " + emp[2].jobID + " " + emp[2].firstName + " " + emp[2].lastName);
    }


}

