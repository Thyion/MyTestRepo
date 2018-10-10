package pl.infoshare;



/**
 * Hello world!
 *
 */
public class App
{


    public static void main(String[] args)
    {


        System.out.println( "Hello World!" );

        System.out.println("--------------------");

        String name = "Krzysztof";
        String lastName = "Beszczynski";
        System.out.print("Name and LastName : ");
        System.out.println(name + " " + lastName);

        System.out.println("--------------------");

        byte age = 28;
        String city = "Gdansk";
        System.out.println("Age" +" : " + age);
        System.out.println("City" + " : " + city);

        System.out.println("Age" +" : " + age + " \n" + "City : " + city);

        System.out.println("--------------------");

        double a = 3;
        double b = 4;



        double sum = a+b;
        double difference = a-b;
        double ratio = a*b;
        double quotient = (double)a/(double)b;
        //int zero = a/0;

        System.out.println("Sum (a+b) = " + sum);
        System.out.println("Difference (a-b) = " +  difference);
        System.out.println("Ratio (axb) = " + ratio);
        System.out.println("Quotient (a/b) = " + quotient);


        System.out.println("--------------------");


        double ddd = Function(a,b);
        System.out.println(ddd);

        System.out.println("--------------------");




    }
    public static double Function(double a, double b){
        double score = a*a+2*a*b+b*b;
        return score;
    }




}
