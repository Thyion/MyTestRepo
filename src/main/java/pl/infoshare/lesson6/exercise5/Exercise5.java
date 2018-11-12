package pl.infoshare.lesson6.exercise5;
import java.io.IOException;
public class Exercise5 {
    public static void main(String[] args) throws IOException{    
        FileService.readEmployees();
        new MenuService().start();   
    }       
}
       
