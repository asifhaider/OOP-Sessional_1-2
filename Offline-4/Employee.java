public class Employee {

    private int id;
    private String name;
    private double salary;

    // you are not allowed to write any other constructor

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary ()
    {
        return salary;
    }

}