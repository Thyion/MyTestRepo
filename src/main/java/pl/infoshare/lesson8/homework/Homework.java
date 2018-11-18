package pl.infoshare.lesson8.homework;


import java.io.IOException;

public class Homework {

    public static void main(String[] args) throws IOException {
        FileService.readClasses();
        new MenuService().start();
    }

}
