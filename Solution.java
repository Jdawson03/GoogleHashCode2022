import java.util.ArrayList;

public class Solution {

    public Solution(Problem p) {

        for (Project theCurrentProject : p.getListOfProjects()) {
            //if (isProjectTimeDoable(theCurrentProject)) {
                for (Skill theRole : theCurrentProject.getListOfRoles()) {
                    for (Worker currentWorker : p.getListOfWorkers()) {
                        boolean doOnce = false;
                        if (!currentWorker.isWorkingOnProject()) {
                            for (Skill theSkill : currentWorker.getListOfSkills()) {
                                if (theRole.getSkillName().equals(theSkill.getSkillName())) {
                                    if (theRole.getSkillLevel() <= theSkill.getSkillLevel()) {

                                        currentWorker.setWorkingOnProject(theSkill);
                                        theCurrentProject.setWhoWorkedIt(currentWorker);
                                        doOnce = true;

                                    }
                                }
                            }
                        }
                        if (doOnce) {
                            break;
                        }
                    }
                }

                if (theCurrentProject.getRoles() == theCurrentProject.getWhoWorkedIt().size()) {
                    theCurrentProject.isAssigned();
                    p.setNumOfSolvedProjects();
                    p.addSolvedProject(theCurrentProject);

                } else {
                    for (Worker worker : theCurrentProject.getWhoWorkedIt()) {
                        worker.clearWorkingOnProject();
                    }
                    theCurrentProject.getWhoWorkedIt().clear();
                }
            //}
        }


    }

    private boolean isProjectTimeDoable(Project project) {
        return project.getDueDate() >= project.getDays();
    }


}
