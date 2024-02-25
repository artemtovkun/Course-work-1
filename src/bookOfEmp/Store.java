package bookOfEmp;

public class Store {
    private final Employee[] employeeCorp = new Employee[10];
    public Store() {
        employeeCorp[0] = new Employee("Павлов", "Яков", "Константинович", 3, 110_514.16);
        employeeCorp[1] = new Employee("Зборщиков", "Альберт", "Денисович", 2, 82_116.25);
        employeeCorp[2] = new Employee("Бурейко", "Эдуард", "Антонович", 2, 95_864.79);
        employeeCorp[3] = new Employee("Гулямов", "Артур", "Алексеевич", 4, 99_875.87);
        employeeCorp[4] = new Employee("Кирилличев", "Дмитрий", "Юрьевич", 1, 78_513.45);
        employeeCorp[5] = new Employee("Форостовский", "Ян", "Александрович", 5, 107_915.63);
        employeeCorp[6] = new Employee("Мултановский", "Артур", "Робертович", 3, 82_164.57);
        employeeCorp[7] = new Employee("Зефиров", "Олег", "Петрович", 2, 99_115.08);
        employeeCorp[8] = new Employee("Самоквасов", "Антон", "Ефимович", 5, 107_416.84);
        employeeCorp[9] = new Employee("Гомеров", "Вячеслав", "Степанович", 1, 88_636.75);
    }
    public void printAllEmp() {
        for (Employee employee : employeeCorp) {
            System.out.println(employee);
        }
    }
    public double calculateAllSal() {
        double salaries = 0;
        for (Employee employee : employeeCorp) {
            salaries += employee.getSalary();
        }
        return salaries;
    }
    public Employee calculateMinEmp() {
        Employee calculateMinEmp = employeeCorp[0];
        for (Employee employee : employeeCorp) {
            if (employee.getSalary() < calculateMinEmp.getSalary()) {
                calculateMinEmp = employee;
            }
        }
        return calculateMinEmp;
    }
    public Employee calculateMaxEmp() {
        Employee calculateMaxEmp = employeeCorp[0];
        for (Employee employee : employeeCorp) {
            if (employee.getSalary() > calculateMaxEmp.getSalary()) {
                calculateMaxEmp = employee;
            }
        }
        return calculateMaxEmp;
    }
    public double calculateMediumSal() {
        double allSal = calculateAllSal();
        return  allSal / employeeCorp.length;
    }
    public void  printFullName() {
        for (Employee employee : employeeCorp) {
            System.out.println(employee.printFullName());
        }
    }
}