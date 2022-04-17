import java.util.ArrayList;

public class Worker {
    private String name;
    private ArrayList<Skill> listOfSkills;
    private boolean workingOnProject = false;
    private Skill skillUsing;

    public Worker (String name) {
        setName(name);
        listOfSkills = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkingOnProject(Skill skill) {
        if (!this.workingOnProject) {
            this.workingOnProject = true;
            this.skillUsing = skill;

            if (skillUsing.getSkillLevel() == skill.getSkillLevel()
                    || skillUsing.getSkillLevel() == skill.getSkillLevel() -1) {
                skillUsing.levelUpSkill();

            }
        }
    }

    public void clearWorkingOnProject() {
        this.skillUsing = null;
        this.workingOnProject = false;
    }

    public void setListOfSkills(ArrayList<Skill> listOfSkills) {
        this.listOfSkills = listOfSkills;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Skill> getListOfSkills() {
        return listOfSkills;
    }

    public boolean isWorkingOnProject() {
        return workingOnProject;
    }

    public void addNewSkill(Skill theSkill) {
        listOfSkills.add(theSkill);
    }

    public void increaseSkillLevel(Skill skill) {
        skill.levelUpSkill();
    }

}
