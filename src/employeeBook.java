public class employeeBook {
    private employee[] workers;

    public void getWorker() {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null) {
                System.out.println(workers[i].toString());
            }
        }
    }

    public employeeBook(int len) {
        this.workers = new employee[len];

    }


    public float sum() {
        float count = 0;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null) {
                count += workers[i].getSalary();
            }
        }
        return count;
    }

    public String min() {
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

    public String max() {
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

    public float middle() {
        float sum = 0;
        int count = 0;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null) {
                sum += workers[i].getSalary();
                count++;
            }
        }
        return sum / count;
    }

    public void getFIO() {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null) {
                System.out.println(workers[i].getName());
            }
        }
    }

    public void indexing(float ratio) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null) {
                workers[i].setSalary(workers[i].getSalary() * (ratio / 100));
            }
        }
    }

    // department metods
    public String minDepartment(int department) {
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

    public String maxDepartment(int department) {
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

    public float middleDepartment(int department) {
        int count = 0;
        float sum = 0f;
        if (department >= 1 && department <= 5) {
            for (int i = 0; i < workers.length; i++) {
                if (workers[i] != null && workers[i].getDepartment() == department) {
                    count++;
                    sum += workers[i].getSalary();
                }
            }
            return sum / count;
        } else {
            return 0;
        }

    }

    public void indexDepartment(int department, float ratio) {
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
    public void minCount(float count) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null && workers[i].getSalary() < count) {
                System.out.println(workers[i].getId() + " " + workers[i].getName() + " " + workers[i].getSalary());
            }
        }
    }

    public void maxCount(float count) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] != null && workers[i].getSalary() >= count) {
                System.out.println(workers[i].getId() + " " + workers[i].getName() + " " + workers[i].getSalary());
            }
        }
    }

    public boolean addWorker(employee employee) {
        int flag = 0;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i] == null) {
                workers[i] = employee;
                flag = 1;
                break;
            }

        }
        if (flag == 1) {
            return true;
        } else {
            return false;
        }
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
        int flag = 0;
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getId() == id) {
                flag = i;
                break;
            }

        }
        if (flag != 0) {
            return workers[flag].toString();
        } else {
            return null;
        }
    }

}
