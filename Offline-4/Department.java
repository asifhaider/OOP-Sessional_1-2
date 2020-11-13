public class Department {

    private int id;
    private String name;
    private Employee [] employees;
    private int employeeCount;

    // add your code here
    // there can be at most 20 departments

    public static Department [] departments = new Department [20];
    public static int departmentCount = 0;

    // you are not allowed to write any other constructor

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
        this.employees = new Employee[10];

        // add your code here

        employeeCount = 0;
        addDepartment(this);

    }

    public static void addDepartment (Department d)
    {
        departments[departmentCount++] = d;
    }

    public void addEmployee (Employee e)
    {
        employees[employeeCount++] = e;
    }

    public double getDepartmentSalary ()
    {
        double total = 0;
        for (int i = 0; i<employeeCount; i++)
        {
            total += employees[i].getSalary();
        }

        return total;
    }

    public Employee getMaxSalaryEmployee ()
    {
        double maxSalary = employees[0].getSalary();
        Employee e = new Employee(employees[0].getId(), employees[0].getName(), employees[0].getSalary());
        for (int i = 1; i< employeeCount; i++)
        {
            if (maxSalary < employees[i].getSalary())
            {
                maxSalary = employees[i].getSalary();
                e = employees[i];
            }
        }
        return e;
    }

    public static double getTotalSalary ()
    {
        double total = 0;
        for (int i=0; i<departmentCount; i++)
        {
            total += departments[i].getDepartmentSalary();
        }
        return total;
    }

}