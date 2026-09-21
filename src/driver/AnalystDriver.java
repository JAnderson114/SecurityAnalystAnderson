/*
 * Joshua Anderson - janderson114@dmacc.edu
 * CIS171 Tues Afternoon
 * Date: 9/21/2026
 * Operating System: DMACC Computer
 * IDE: IntelliJ
 * Program Description(short): This program creates and tests SecurityAnalyst
 * objects using constructors, getters, setters, and class methods.
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or unmodified
 * Documentation of Resources Used: Canvas
 */
package driver;
import model.SecurityAnalyst;

public class AnalystDriver {

    public static void main(String[] args) {

        // Create an object using the default constructor
        SecurityAnalyst analyst1 = new SecurityAnalyst();

        System.out.println("Default Object:");
        System.out.println(analyst1);

        // Use setters to change the default object's attributes
        analyst1.setAnalystName("Sarah Johnson");
        analyst1.setCertification("Security+");
        analyst1.setYearsExperience(3);
        analyst1.setActiveIncident(true);

        System.out.println("\nAfter Using Setters:");
        System.out.println(analyst1);

        // Demonstrate getters
        System.out.println("\nUsing Getters:");
        System.out.println("Analyst Name: " + analyst1.getAnalystName());
        System.out.println("Certification: " + analyst1.getCertification());
        System.out.println("Years of Experience: " +
                analyst1.getYearsExperience());
        System.out.println("Active Incident: " +
                analyst1.isActiveIncident());

        // Demonstrate investigate method
        System.out.println("\nInvestigate Method:");
        System.out.println(analyst1.investigate());

        // Create an object using the non-default constructor
        SecurityAnalyst analyst2 = new SecurityAnalyst(
                "Michael Chen",
                "CISSP",
                8,
                false
        );

        System.out.println("\nNon-Default Object:");
        System.out.println(analyst2);

        // Change the name using a setter
        analyst2.setAnalystName("Michael Rodriguez");

        System.out.println("\nAfter Name Change:");
        System.out.println(analyst2);

        // Demonstrate another getter
        System.out.println("\nCertification:");
        System.out.println(analyst2.getCertification());

        // Demonstrate investigate method for second object
        System.out.println("\nInvestigate Method:");
        System.out.println(analyst2.investigate());
    }
}