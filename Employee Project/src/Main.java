public class Main {

    public static void main(String[] args) {
        Employee employeeOne = new Employee( "John Smith", "Austin", 90000, 35);
        Employee employeeTwo = new Employee("Sally Roberts", "New York", 120000, 38);
        Employee employeeThree = new Employee("Ashley Jones", "Austin", 75000, 30);
        Employee employeeFour = new Employee("Jared Conyers", "Dallas", 55000, 33);

        employeeFour.raiseSalary();

        System.out.println(employeeOne.salary);
        System.out.println(employeeTwo.salary);
        System.out.println(employeeThree.salary);
        System.out.println(employeeFour.salary);
    }
}
