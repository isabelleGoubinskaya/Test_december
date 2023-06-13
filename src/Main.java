import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] emp = new Employee[10];

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

        System.out.println("Original array:");
        displayArray(emp);

        reverseArray(emp);

        System.out.println("Reversed array:");
        displayArray(emp);
    }

    public static void reverseArray(Object[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            Object temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static void displayArray(Object[] array) {
        for (Object item : array) {
            if (item != null) {
                System.out.println(item.toString());
            }
        }
    }
}