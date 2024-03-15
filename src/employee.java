public class employee {
    private int id;
    private float salary;
    private String name;
    private int department;
    private static int count = 0;

    public employee(float salary, String name, int department) {
        this.id = count;
        count += 1;
        this.salary = salary;
        this.name = name;
        this.department = department;
    }

    // гетеры
    public int getId() {
        return id;
    }

    public float getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }
    // сеттеры

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


    public void setDepartment(int department) {
        if (department >= 1 && department <= 5) {
            this.department = department;
        } else {
            System.out.println("Введите номер департамента от 1 до 5");
        }
    }

    // контракты equals and hashCode
    @Override
    public boolean equals(Object other) {
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        employee c = (employee) other;
        return id == c.getId();
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + ' ' + this.department + ' ' + this.salary;
    }

    public String departmentToString() {
        return this.id + " " + this.name + ' ' + ' ' + this.salary;
    }


}
