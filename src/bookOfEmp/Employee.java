package bookOfEmp;

public class Employee {
    private final String name;
    private final String surname;
    private final String patronymic;
    private int department;
    private double salary;
    public static int idCount = 1; // id
    private final int id;
    public  Employee(String surname, String name, String patronymic, int department, double  salary) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = idCount++;
    }
    public String getSurname() {
        return surname;
    }
    public String getName() {
        return name;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public int getDepartment() {
        return department;
    }
    public double getSalary() {
        return salary;
    }
    public int getId() {
        return id;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee " +
                "surname = '" + surname + '\'' +
                ", name = '" + name + '\'' +
                ", patronymic = '" + patronymic + '\'' +
                ", department = " + department +
                ", salary = " + salary +
                ", id = " + id;
    }
    public String printFullName() {
        return "Employee " +
                "surname = '" + surname + '\'' +
                ", name = '" + name + '\'' +
                ", patronymic = '" + patronymic + '\'';
    }
}