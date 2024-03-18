public class EmployeeBook {
    private Employee[] workers;

    public void printWorker() {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null) {
                System.out.println(workers[i].toString());
            }
        }
    }

    public EmployeeBook(int len) {
        if (len < 0) {
            throw new IllegalArgumentException("Длина не может быть отрицательной");
        }
        this.workers = new Employee[len];
    }


    public float summarize() {
        float count = 0;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null) {
                count += workers[i].getSalary();
            }
        }
        return count;
    }

    public String getMin() {
        String name = "";
        float count = 1000000000f;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null && workers[i].getSalary() < count) {
                count = workers[i].getSalary();
                name = workers[i].toString();
            }
        }
        return name;
    }

    public String getMax() {
        String name = "";
        float count = 0f;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null && workers[i].getSalary() > count) {
                count = workers[i].getSalary();
                name = workers[i].toString();
            }
        }
        return name;
    }

    public float getMiddle() {
        float sum = 0;
        int count = 0;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null) {
                sum += workers[i].getSalary();
                count++;
            }
        }
        if (count > 0) {
            return sum / count;
        } else {
            return -1;

        }

    }

    public void printFIO() {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null) {
                System.out.println(workers[i].getName());
            }
        }
    }

    public void indexTheSalary(float ratio) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null) {
                workers[i].setSalary(workers[i].getSalary() * (ratio / 100));
            }
        }
    }

    // department metods
    public String getMinDepartment(int department) {
        String name = "";
        float count = 1000000000f;
        if (department >= 1 && department <= 5) {
            for (int i = 0; i < workers.length; i++) {
                if (workers[i] != null && workers[i].getSalary() < count && workers[i].getDepartment() == department) {
                    count = workers[i].getSalary();
                    name = workers[i].toString();
                }
            }
            return name;
        } else {
            return null;
        }

    }

    public String getMaxDepartment(int department) {
        String name = "";
        float count = 0f;
        if (department >= 1 && department <= 5) {
            for (int i = 0; i < workers.length; i++) {
                if (workers[i] != null && workers[i].getSalary() > count && workers[i].getDepartment() == department) {
                    count = workers[i].getSalary();
                    name = workers[i].toString();
                }
            }
            return name;
        } else {
            return null;
        }

    }

    public float getSalaryDepartment(int department) {
        int count = 0;
        float sum = 0f;
        if (department >= 1 && department <= 5) {
            for (int i = 0; i < workers.length; i++) {
                if (workers[i] != null && workers[i].getDepartment() == department) {
                    sum += workers[i].getSalary();
                }
            }
            return sum;
        } else {
            return 0;
        }

    }

    public float getMiddleDepartment(int department) {
        int count = 0;
        float sum = 0f;
        if (department >= 1 && department <= 5) {
            for (int i = 0; i < workers.length; i++) {
                if (workers[i] != null && workers[i].getDepartment() == department) {
                    count++;
                    sum += workers[i].getSalary();
                }
            }
            if (count > 0) {
                return sum / count;
            } else {
                return -1;

            }
        } else {
            return 0;
        }

    }

    public void indexTheSalaryDepartment(int department, float ratio) {
        if (department >= 1 && department <= 5) {
            for (int i = 0; i < workers.length; i++) {
                if (workers[i] != null && workers[i].getDepartment() == department) {
                    workers[i].setSalary(workers[i].getSalary() * (ratio / 100));
                }
            }

        }
    }

    public void printDepartment(int department) {
        if (department >= 1 && department <= 5) {
            for (int i = 0; i < workers.length; i++) {
                if (workers[i] != null && workers[i].getDepartment() == department) {
                    System.out.println(workers[i].departmentToString());
                }
            }

        }
    }

    // 3---------------------------------------------
    public void printMinSalary(float count) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null && workers[i].getSalary() < count) {
                System.out.println(workers[i].getId() + " " + workers[i].getName() + " " + workers[i].getSalary());
            }
        }
    }

    public void getMAxSalary(float count) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null && workers[i].getSalary() >= count) {
                System.out.println(workers[i].getId() + " " + workers[i].getName() + " " + workers[i].getSalary());
            }
        }
    }

    public boolean addWorker(Employee employee) {
        boolean flag = false;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] == null) {
                workers[i] = employee;
                flag = true;
                break;
            }

        }
        return flag;
    }

    public void deleteWorker(int id) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getId() == id) {
                workers[i] = null;
                break;
            }
        }


    }

    public String getWorkerId(int id) {
        int flag = -1;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getId() == id) {
                flag = i;
                break;
            }

        }
        if (flag >= 0) {
            return workers[flag].toString();
        } else {
            return null;
        }
    }

}
