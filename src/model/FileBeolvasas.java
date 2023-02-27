package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileBeolvasas {
    
    private static final String FILE_LINE_SEP = ";";
    
    public void Beolvas() throws FileNotFoundException
    {
        var file = new File("emberek.txt");
        var sc = new Scanner(file);
        if (sc.hasNextLine())
        {
            sc.nextLine();
        }
        while (sc.hasNextLine())
        {
            String line = sc.nextLine();
            var lineSplit = line.split(FILE_LINE_SEP);
            String name = lineSplit[0];
            int age = Integer.parseInt(lineSplit[1]);
            char gender = lineSplit[2].charAt(0);
            int hoursWorked = 0;
            if (lineSplit.length > 3)
            {
                hoursWorked = Integer.parseInt(lineSplit[3]);
            }
            System.out.println(name + ", " + age + ", " + gender + ", " + hoursWorked);
        }
    }
    
    
}
