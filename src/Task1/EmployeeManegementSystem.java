package Task1;

import java.time.LocalDate;

public class EmployeeManegementSystem {
    public static void main(String[] args) {
        // Create a salaried employee
        SalariedEmployee salariedEmployee = new SalariedEmployee("Agil Aghamirzayev", LocalDate.of(1990, 1, 15),
                "EMP001", 60000.0);

        System.out.println("1-ci işçi: " + salariedEmployee);
        System.out.println("yaşı: " + salariedEmployee.getAge());
        salariedEmployee.performJob();
        System.out.println("aylıq gəliri: $" + salariedEmployee.collectPay());

        System.out.println();

        // Create an hourly employee
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Shabnam Shibliyeva", LocalDate.of(1995, 5, 8),
                "EMP002", 20.0, 40.0);

        System.out.println("2-ci işçi: " + hourlyEmployee);
        System.out.println("yaşı: " + hourlyEmployee.getAge());
        hourlyEmployee.performJob();
        System.out.println("həftəlik gəliri: $" + hourlyEmployee.collectPay());
    }
}
