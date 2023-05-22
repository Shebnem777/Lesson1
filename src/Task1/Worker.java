package Task1;

import java.time.LocalDate;

abstract class Worker {
    private String name;
    private LocalDate birthDate;

    public Worker(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - birthDate.getYear();
        if (currentDate.getMonthValue() < birthDate.getMonthValue()
                || (currentDate.getMonthValue() == birthDate.getMonthValue()
                && currentDate.getDayOfMonth() < birthDate.getDayOfMonth())) {
            age--;
        }
        return age;
    }

    public abstract double collectPay();

    public String toString() {
        return name;
    }
}