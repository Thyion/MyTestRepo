package pl.infoshare.lesson11;

import pl.infoshare.lesson6.exercise4.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Ala");
        lista.add("Kasia");
        lista.add("Basia");
        lista.add("Archibald");


        for (String item : lista){
            if(item.startsWith("A"))
                System.out.println(item);
        }

        lista.forEach(s -> System.out.println(s));

        System.out.println(lista.stream().filter(p -> p.startsWith("A")).collect(Collectors.toList()));
        List<String> subLista = lista.stream().filter(p -> p.startsWith("A")).collect(Collectors.toList());
        System.out.println(subLista);

        Employee e1 = new Employee("Tomasz","Kowalik", "IT", 699);
        Employee e2 = new Employee("Joanna","Kowalik", "IT", 699);
        Employee e3 = new Employee("Janusz","Kowalik", "IT", 699);
        Employee e4 = new Employee("Piotr","Kowalik", "IT", 699);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);

        List<Employee> employeeStartWithJ = employeeList.stream().filter(employee -> employee.getName().startsWith("J")).collect(Collectors.toList());
        List<String> imiona = employeeList.stream().map(Employee::getName).filter(p -> p.startsWith("P")).collect(Collectors.toList());
        System.out.println(imiona);
        System.out.println(employeeStartWithJ);


    }
}
