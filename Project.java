import java.util.ArrayList;

public class Project {
    private String name;
    private int days;
    private int score;
    private int dueDay;
    private int roles;
    private static int currentDay;
    private int finalScore;
    private ArrayList<Skill> listOfRoles = new ArrayList<>();
    private ArrayList<Worker> whoWorkedIt = new ArrayList<>();
    private boolean isAssigned = false;


    public Project(String name, int days, int score, int dueDay, int roles) {
        setName(name);
        setDays(days);
        setScore(score);
        setDueDay(dueDay);
        setRoles(roles);
    }

    public void awardScore() {
        if (currentDay <= dueDay) {
            finalScore =+ score;
        } else {
            int points = currentDay - dueDay;
            if (points > 0) {
                finalScore = score - points;
            }

        }
    }

    public void isAssigned() {
        if (isAssigned) {
            isAssigned = false;
        } else {
            isAssigned = true;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setDueDay(int dueDay) {
        this.dueDay = dueDay;
    }

    public void setRoles(int roles) {
        this.roles = roles;
    }

    public void addNewRole(Skill theSkill) {
        listOfRoles.add(theSkill);
    }

    public static int getCurrentDay() {
        return currentDay;
    }

    public static void setCurrentDay(int currentDay) {
        Project.currentDay = currentDay;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public int getScore() {
        return score;
    }

    public int getDueDate() {
        return dueDay;
    }

    public int getRoles() {
        return roles;
    }

    public ArrayList<Skill> getListOfRoles() {
        return listOfRoles;
    }

    public ArrayList<Worker> getWhoWorkedIt() {
        return whoWorkedIt;
    }

    public boolean getIsAssigned() {
        return isAssigned;
    }

    public void setWhoWorkedIt(Worker whoWorkedIt) {
        this.whoWorkedIt.add(whoWorkedIt);
    }
}
