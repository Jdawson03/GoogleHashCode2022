public class Skill {
    private String skillName;
    private int skillLevel;

    public Skill(String skillName, int skillLevel) {
        setSkillName(skillName);
        setSkillLevel(skillLevel);
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public String getSkillName() {
        return skillName;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void levelUpSkill() {
        skillLevel++;
    }

}
