public class Main {

    public static void main(String[] args) {


        employee workers1 = new employee(12, "Andrey", 1);
        employee workers2 = new employee(35, "Mikel", 2);
        employee workers3 = new employee(156, "Stepan", 3);
        employee workers4 = new employee(98, "Dasha", 4);
        employee workers5 = new employee(987, "Roma", 5);
        employee workers6 = new employee(765, "Serjey", 5);
        employeeBook crut = new employeeBook(6);
        crut.addWorker(workers1);
        crut.addWorker(workers2);
        crut.addWorker(workers3);
        crut.addWorker(workers4);
        crut.addWorker(workers5);
        crut.addWorker(workers6);
        crut.getWorker();
    }



}

