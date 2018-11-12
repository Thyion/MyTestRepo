
package pl.infoshare.lesson6.exercise4;

import java.util.ArrayList;

public class Exercise4 {
    public static void main(String[] args){
        
        Employee employee1 = new Employee("Tomasz", "Kowalik", "HR", 4000);
        Employee employee2 = new Employee("Janusz", "Kowalik", "HR", 51000);
        Employee employee3 = new Employee("Bogdan", "Banan", "IT", 8500);
        Employee employee4 = new Employee("Asia", "Jadak", "IT", 8000);
        Employee employee5 = new Employee("Zosia", "Fiolek", "IT", 9000);
        Employee employee6 = new Employee("Kasia", "Krzyst", "HR", 2000);
        Employee employee7 = new Employee("Basia", "Janik", "HR", 3500);
        
        EmployeeJudge workers = new EmployeeJudge();
        workers.mapa.put(new Employee("Basia", "Janik", "HR", 3500), value);
        workers.mapa.put(employee1, workers.judgeTheEmployeeSalary(employee1));
        workers.mapa.put(employee2, workers.judgeTheEmployeeSalary(employee2));
        workers.mapa.put(employee3, workers.judgeTheEmployeeSalary(employee3));
        workers.mapa.put(employee4, workers.judgeTheEmployeeSalary(employee4));
        workers.mapa.put(employee5, workers.judgeTheEmployeeSalary(employee5));
        workers.mapa.put(employee6, workers.judgeTheEmployeeSalary(employee6));
        workers.mapa.put(employee7, workers.judgeTheEmployeeSalary(employee7));
        
        
        System.out.println(workers.mapa);
        
        ArrayList nisko = new ArrayList();
        nisko.add(workers.mapa.get(employee7));
        System.out.println(workers.mapa.values());
        workers.mapa.values();
        System.out.println(nisko);
                
    }
    
}
