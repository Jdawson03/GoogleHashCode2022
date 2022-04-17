import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Submission {

    public Submission(Problem p) throws IOException {

        int numberOfProjectsSolved = p.getNumOfSolvedProjects();
        ArrayList<Project> listOfProjects = p.getListOfProjects();
        ArrayList<Project> solvedProjects = p.getProjectsSolved();

        File outputFile = new File("output.txt");
        if (outputFile.createNewFile()) {
            System.out.println("File created: " + outputFile.getName());
        } else {
            System.out.println("File already exists.");
        }

        FileWriter out = new FileWriter(outputFile);

        out.write(numberOfProjectsSolved + "\n");

        for (int i = 0; i < solvedProjects.size(); i++) {
            Project currentProject = solvedProjects.get(i);
            out.write(currentProject.getName() + "\n");
            for (int k = 0; k < currentProject.getWhoWorkedIt().size(); k++) {
                out.write(currentProject.getWhoWorkedIt().get(k).getName() + " ");
            }
            out.write("\n");


        }

        out.close();

    }
}
