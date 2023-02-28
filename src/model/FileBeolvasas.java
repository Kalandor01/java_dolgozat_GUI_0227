package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileBeolvasas {
    
    private static final String FILE_LINE_SEP = ";";
    private static final String FILE_PATH = "emberek.txt";
    
    public static List<Dolgozo> beolvas()
    {
        try
        {
            var lines = Files.readAllLines(Paths.get(FILE_PATH));
            var dolgozok = new ArrayList<Dolgozo>();
            for (int x = 1; x < lines.size(); x++) {
                var lineSplit = lines.get(x).split(FILE_LINE_SEP);
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
        catch (IOException e)
        {
            return null;
        }
    }
}
