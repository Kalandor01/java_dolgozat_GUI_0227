package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileBeolvasas {
    
    private static final String FILE_LINE_SEP = ";";
    private static final String FILE_PATH = "emberek.txt";
    
    public static List<Dolgozo> beolvas()
    {
        var file = new File(FILE_PATH);
        try
        {
            var sc = new Scanner(file);
            if (sc.hasNextLine())
            {
                sc.nextLine();
            }
            var dolgozok = new ArrayList<Dolgozo>();
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
                dolgozok.add(new Dolgozo(name, age, gender, hoursWorked));
            }
            return dolgozok;
        }
        catch (FileNotFoundException e)
        {
            return null;
        }
    }
}
