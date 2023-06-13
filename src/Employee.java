class Employee {
    String firstName;
    String lastName;
    int service;
    int salary;
    static int count = 1;
    int jobID;
    String name;
    boolean isFilled;

    public Employee(String firstName, String lastName, int service, int salary, int jobID) {
        this.salary = salary;
        this.firstName = firstName;
        this.jobID = jobID;
        this.lastName = lastName;
        this.service = service;
        isFilled = false;
        ++count;
    }

    public int getJobID() {
        return jobID;
    }

    public int getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getService() {
        return service;
    }

    @Override
    public String toString() {
        return "Employee [jobID = " + jobID + ", salary = " + salary + ", name = " + lastName + ", firstName = "
                + firstName + ", service = " + service + "]";
    }
}