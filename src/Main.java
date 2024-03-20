public class Main {

    public static void main(String[] args) {


        Employee workers1 = new Employee(12, "Andrey", 1);
        Employee workers2 = new Employee(35, "Mikel", 2);
        Employee workers3 = new Employee(156, "Stepan", 3);
        Employee workers4 = new Employee(98, "Dasha", 4);
        Employee workers5 = new Employee(987, "Roma", 5);
        Employee workers6 = new Employee(765, "Serjey", 5);
        EmployeeBook crut = new EmployeeBook(6);
        crut.addWorker(workers1);
        crut.addWorker(workers2);
        crut.addWorker(workers3);
        crut.addWorker(workers4);
        crut.addWorker(workers5);
        crut.addWorker(workers6);

    }



}

