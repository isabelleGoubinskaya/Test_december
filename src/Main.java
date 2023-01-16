import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {

        int allSalaryCost = 0;
        Employee[] emp = new Employee[10] ;

        emp[0] = new Employee("Isabelle", "Goubinskaya", 5, 789456, 1);
        emp[1] = new Employee("Andrei", "Gefer", 4, 1, 2);
        emp[2] = new Employee("qds", "Lourson", 4, 11212, 3);
        emp[3] = new Employee("Ouidqsnie", "Lourson", 4, 11212, 3);
        emp[4] = new Employee("kjhjk", "Lourson", 4, 0, 3);
        emp[5] = new Employee("sdqf", "Lourson", 4, 1155212, 3);
        emp[6] = new Employee("ytrj", "Lourson", 4, 46, 3);
        emp[7] = new Employee("dhf", "Lourson", 4, 11778212, 3);
        emp[8] = new Employee("Ouigfnie", "Lourson", 4, 862, 3);
        emp[9] = new Employee("qsdfqsd", "Lourson", 4, 5676753, 3);


        emp[0].showData();
        emp[1].showData();
        emp[2].showData();
        int globalAmount = 0;

        for (int i =0; i < emp.length; i++){
            globalAmount = globalAmount + emp[i].salary;
        }
        //allSalaryCost = emp[0].salary + emp[1].salary + emp[2].salary;
        System.out.println("The global amount of all salary is : " + globalAmount);

        int min = 0;
        int max =0;

        for (int i =0; i < emp.length; i++){
            if (max < emp[i].salary){
                max = emp[i].salary;

            }
        }

        for (int i =0; i < emp.length; i++){
            if (min > emp[i].salary){
                min = emp[i].salary;

            }
        }

        System.out.println("minimum salary is " + min);
        System.out.println("maximum salary is " + max);

        int averageSalary =0;
        averageSalary = globalAmount / 10;
        System.out.println("average salary is " + averageSalary);

        System.out.println("fullname of employee " + emp[0].jobID + " " + emp[0].firstName + " " + emp[0].lastName);
        System.out.println("fullname of employee " + emp[1].jobID + " " + emp[1].firstName + " " + emp[1].lastName);
        System.out.println("fullname of employee " + emp[2].jobID + " " + emp[2].firstName + " " + emp[2].lastName);
        System.out.println("fullname of employee " + emp[3].jobID + " " + emp[2].firstName + " " + emp[2].lastName);
        System.out.println("fullname of employee " + emp[4].jobID + " " + emp[2].firstName + " " + emp[2].lastName);
        System.out.println("fullname of employee " + emp[5].jobID + " " + emp[2].firstName + " " + emp[2].lastName);
        System.out.println("fullname of employee " + emp[6].jobID + " " + emp[2].firstName + " " + emp[2].lastName);
        System.out.println("fullname of employee " + emp[7].jobID + " " + emp[2].firstName + " " + emp[2].lastName);
        System.out.println("fullname of employee " + emp[8].jobID + " " + emp[2].firstName + " " + emp[2].lastName);
        System.out.println("fullname of employee " + emp[9].jobID + " " + emp[2].firstName + " " + emp[2].lastName);

    }


}

