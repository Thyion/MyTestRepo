package pl.infoshare.lesson6.exercise4;

import java.util.HashMap;
import java.util.Map;
import pl.infoshare.lesson6.exercise3.Pacjent;


public class EmployeeJudge {
    
    public EmployeeJudge() {
//       mapa = new HashMap<>();
    }
    public String judgeTheEmployeeSalary(Employee employee){
        if (employee.getSalary()<3000)
            return "NISKO";
        if (employee.getSalary()>3000&&employee.getSalary()<5000)
            return "SREDNIO";
        else
            return "WYSOKO";
        
    }
    
    private Employees employees;
          
   
}
