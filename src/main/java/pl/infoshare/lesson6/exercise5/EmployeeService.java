package pl.infoshare.lesson6.exercise5;


import java.io.IOException;


public class EmployeeService {
    
    public EmployeeService(){
        
    }
   
    public void createNewEmployee() throws IOException {
        //MenuService menuService = new MenuService();
        //Wywolaj metode, ktora poprosi o username i password i przypisz nowy obiekt do zmiennej
        Employee employee = generateEmployeeFromUserInput();
        //dodanie pracownika do listy
        if (employee.getDepartment().equals("IT")) {
            FileService.listOfItEmployee.addLast(employee);        
        }else             
        if (employee.getDepartment().equals("HR")) {
            FileService.listOfHrEmployee.addLast(employee);
        }           
        else{
            employee = generateEmployeeFromUserInput();
        }    
        
    }
    
    public void deleteEmployee() throws IOException {
        MenuService menuService = new MenuService();
        //Wywolaj metode, ktora poprosi o username i password i przypisz nowy obiekt do zmiennej
        Employee employee = generateDeleteEmployeeFromUserInput();
        //dodanie pracownika do listy
        if (employee.getDepartment().equals("IT")) {
            for(Employee employee1:FileService.listOfHrEmployee){
                if(employee.getName().equals(employee1.getName())&&employee.getSurName().equals(employee1.getSurName()))
                    FileService.listOfHrEmployee.remove(employee1);
                    System.out.println("Usunięto pracownika : " + employee1.getName() + " " + employee1.getSurName() + " z dzialu " + employee1.getDepartment() + ".");
                       
            }
        }else             
        if (employee.getDepartment().equals("HR")) {
            for(Employee employee1:FileService.listOfHrEmployee){
                if(employee.getName().equals(employee1.getName())&&employee.getSurName().equals(employee1.getSurName()))
                    FileService.listOfHrEmployee.remove(employee1);
                    System.out.println("Usunięto pracownika : " + employee1.getName() + " " + employee1.getSurName() + " z dzialu " + employee1.getDepartment() + ".");
            }
        }           
        else{
            System.out.println("Nie ma takiego pracownika.");
            menuService.start();
            
        }    
        
    }
    
    public Employee generateEmployeeFromUserInput() {
        ConsoleInputReader consoleInputReader = new ConsoleInputReader();
        return new Employee(
                consoleInputReader.getFieldFromUserInput("name"),
                consoleInputReader.getFieldFromUserInput("surName"),
                consoleInputReader.getFieldFromUserInput("department"),
                Integer.parseInt(consoleInputReader.getFieldFromUserInput("salary"))
        );
    }
    
    public Employee generateDeleteEmployeeFromUserInput() {
        ConsoleInputReader consoleInputReader = new ConsoleInputReader();
        return new Employee(
                consoleInputReader.getFieldFromUserInput("name"),
                consoleInputReader.getFieldFromUserInput("surName"),
                consoleInputReader.getFieldFromUserInput("department")
                )
        ;
    }

}
