package pl.infoshare.lesson8.homework;

import java.io.IOException;

public class StudentService {
    private ClassesService classesService;
    public StudentService(){
        classesService = new ClassesService();
    }

    public void createNewStudent() throws IOException {

        if(FileService.listOfClasses.isEmpty()){
            System.out.println("Musisz najpierw stworzyć jakąkolwiek klase...");
            classesService.createNewClasses();
        } else {
            int q = classesService.choseClass();
            Student student = generateStudentFromUserInput();
            FileService.listOfClasses.get(q).students.add(student);
        }
    }
    public Student generateStudentFromUserInput() {
        ConsoleInputReader consoleInputReader = new ConsoleInputReader();
        return new Student(
                consoleInputReader.getFieldFromUserInput("name"),
                consoleInputReader.getFieldFromUserInput("surName"),
                true,
                Integer.parseInt(consoleInputReader.getFieldFromUserInput("Index number"))
        );
    }
    public void anyClassesExist(){

    }
//
//    public void deleteEmployee() throws IOException {
//        MenuService menuService = new MenuService();
//
//        Employee employee = generateDeleteEmployeeFromUserInput();
//
//            if (employee.getDepartment().equals("IT")) {
//                for(Employee employee1:FileService.listOfItEmployee) {
//                    if (employee.getName().equals(employee1.getName()) && employee.getSurName().equals(employee1.getSurName())) {
//                        FileService.listOfItEmployee.remove(employee1);
//                        System.out.println("Usunięto pracownika : " + employee1.getName() + " " + employee1.getSurName() + " z dzialu " + employee1.getDepartment() + ".");
//                        menuService.start();
//                    }
//                }
//                System.out.println("Nie ma takiego pracownika");
//            } else if (employee.getDepartment().equals("HR")) {
//                for(Employee employee1:FileService.listOfHrEmployee) {
//                    if (employee.getName().equals(employee1.getName()) && employee.getSurName().equals(employee1.getSurName())) {
//                        FileService.listOfHrEmployee.remove(employee1);
//                        System.out.println("Usunięto pracownika : " + employee1.getName() + " " + employee1.getSurName() + " z dzialu " + employee1.getDepartment() + ".");
//                        menuService.start();
//                    }
//                }
//                System.out.println("Nie ma takiego pracownika");
//            } else {
//                System.out.println("Nie ma takiego pracownika.");
//
//
//            }
//
//        menuService.start();
//
//    }


//    public Employee generateDeleteEmployeeFromUserInput() {
//        ConsoleInputReader consoleInputReader = new ConsoleInputReader();
//        return new Employee(
//                consoleInputReader.getFieldFromUserInput("name"),
//                consoleInputReader.getFieldFromUserInput("surName"),
//                consoleInputReader.getFieldFromUserInput("department")
//                )
//        ;
//    }

}
