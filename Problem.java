import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem {
    private ArrayList<Worker> listOfWorkers = new ArrayList<>();
    private ArrayList<Project> listOfProjects = new ArrayList<>();
    public int numOfSolvedProjects = 0;
    private ArrayList<Project> projectsSolved = new ArrayList<>();


    public Problem(String fileName) throws FileNotFoundException {
        File file = new File("/Users/josephdawson/IdeaProjects/GoogleHashCode2022/src/main/input_data/" + fileName);


        Scanner in = new Scanner(file);
        int worker = in.nextInt();
        int projects = in.nextInt();
        in.nextLine();

        for (int i = 0; i < worker; i++) {
            String newLine = in.nextLine();

            String[] splitLine = newLine.split(" ");
            listOfWorkers.add(new Worker(splitLine[0]));


            for (int j = 0; j < Integer.parseInt(splitLine[1]); j++) {
                String newLine2 = in.nextLine();
                String[] splitLine2 = newLine2.split(" ");
                Skill currentSkill = new Skill(splitLine2[0], Integer.parseInt(splitLine2[1]));
                listOfWorkers.get(i).addNewSkill(currentSkill);
            }

        }

        for (int i = 0; i < projects; i++) {
            String newLine = in.nextLine();

            String[] splitLine = newLine.split(" ");
            Project p = new Project(splitLine[0], Integer.parseInt(splitLine[1]), Integer.parseInt(splitLine[2]),
                    Integer.parseInt(splitLine[3]), Integer.parseInt(splitLine[4]));
            listOfProjects.add(p);

            for (int j = 0; j < Integer.parseInt(splitLine[4]); j++) {
                String newLine2 = in.nextLine();
                String[] splitLine2 = newLine2.split(" ");
                Skill currentSkill = new Skill(splitLine2[0], Integer.parseInt(splitLine2[1]));
                p.addNewRole(currentSkill);
            }
        }

    }

    public ArrayList<Project> getListOfProjects() {
        return listOfProjects;
    }

    public ArrayList<Worker> getListOfWorkers() {
        return listOfWorkers;
    }

    public  int getNumOfSolvedProjects() {
        return numOfSolvedProjects;
    }

    public  void setNumOfSolvedProjects() {
        numOfSolvedProjects++;
    }

    public ArrayList<Project> getProjectsSolved() {
        return projectsSolved;
    }

    public void addSolvedProject(Project solvedPro) {
        projectsSolved.add(solvedPro);
    }
}
