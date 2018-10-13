package pl.infoshare;


import java.util.Scanner;


public class Lesson2 {

    public static void main(String[] args) {

        double a = 90.99;
        System.out.println(a);

        int b = (int) a;
        System.out.println(b);

        char c = 'a';
        System.out.println(c);

        char d = (char) 90;
        System.out.println(d);

        System.out.println(b/a +d);

        System.out.println("Wynik" + b/a +d);
        System.out.println(b/a +d+ "Wynik");



        int agePrim = 25;

        switch (agePrim) {
            case 20: {
                System.out.println("Age is 20");
                break;
            }

            case 21:
            case 22:
            case 23:
            case 24:
            case 26:
            case 27: {
                System.out.println("Age is Different");
                break;
            }


            case 25 : {
                System.out.println("Age is 25");
                break;
            }
            case 30 : {
                System.out.println("Age is 25");
                break;
            }
            default: {
                System.out.println("You are old");
            }

        }
        String aaaa = agePrim > 18 ? "You are old" : "You are old";

        System.out.println(agePrim > 18 ? "You are old" : "You are old");





        System.out.println("-------------------HOMEWORK -----------------------");

        System.out.println("------------");
        System.out.println("Exercise no 1");
        System.out.println("------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi please give me number: ");
        double scan = (double) scanner.nextInt();
        System.out.println("You have number: "+ scan);

        System.out.println("------------");

        System.out.println("Hi please give me number: ");
        Scanner scanner2 = new Scanner(System.in);
        
        String text = scanner2.nextLine();
        System.out.println(Integer.parseInt(text));
        System.out.println("You have number: "+ text);

        System.out.println("------------");

        System.out.println("Exercise no 2");

        System.out.println("------------");

        Scanner scanner3 = new Scanner(System.in);

       int age;


        do {
            System.out.println("Hello! How old are you?");
            while (!scanner3.hasNextInt()) {
                System.out.println("That's not a number or you are dead !!!");
               scanner3.next(); // this is important!
            }
            age = scanner3.nextInt();
        } while (age <= 0 || age > 123);

        if (age >= 18) {

            System.out.println("Great! You are adult");
        } else {
            System.out.println("Oh no you are a kid !!!!");
        }

        System.out.println("------------");
     
        System.out.println("Exercise no 3");

        System.out.println("------------");

        User user1 = new User("Krzysiek", "pass1", true);
        User user2 = new User("Ula", "pass2", false);
        User user3 = new User("Kuba", "pass3", false);
        User[] users = new User[3];
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        
        
        Scanner usernameScanner = new Scanner(System.in);
        Scanner passwordScanner = new Scanner(System.in);
        
      
        System.out.println("Please write Username: ");
        String givenUsername = usernameScanner.nextLine();
        System.out.println("Please write Password: ");
        String givenPassword = passwordScanner.nextLine();
        User chosen = null;

        for (int i=0; i<users.length; i++) {
        if (givenUsername.equals(users[i].username) && givenPassword.equals(users[i].password) && users[i].status == true){
            System.out.println("Username and password MATCH");
            System.out.println("You logged in as "+ users[i].username);
            chosen = users[i];
            System.out.println("ACCESS GRANTED - ADMIN");
        }
        if (givenUsername.equals(users[i].username) && givenPassword.equals(users[i].password) && users[i].status == false){
            System.out.println("Username and password MATCH");
            System.out.println("You logged in as "+ users[i].username);
            chosen = users[i];
            System.out.println("ACCESS GRANTED - NORMAL USER");
        }
        if (chosen == null && i==users.length-1){
            System.out.println("Username and password NOT MATCH");
            System.out.println("ACCESS DENIED");
        }
        
        }

        
        System.out.println("------------");
     
        System.out.println("Nie ukryłem hasła bo nie znalazłem tej funkcjonalności w klasie Scanner");

    }
}

class User {
    
    public String username;
    public String password;
    boolean status;
    
    public User(String username, String password, boolean status) {
        this.username = username;
        this.password = password;
        this.status = status;
    }
    
}
