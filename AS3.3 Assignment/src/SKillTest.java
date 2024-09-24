public class SKillTest {
    public static void main(String[] args) throws Exception {
        //creating instances for each skill type
        Skill dataanalysis = new HardSkill("Data Analysis", 3);
        Skill timemanagement = new SoftSkill("Time Management", 6);
        Skill listening = new GiftSkill("Listening", 4);
        Skill persuasion = new TalentSkill("Persuasion", 9);

        //identify skill method for each instance
        dataanalysis.identifySkill();
        timemanagement.identifySkill();
        listening.identifySkill();
        persuasion.identifySkill();
    }
}

//abstract class representing a skill
abstract class Skill {
    private String skillName;
    private String skillType;
    private int skillLevel;

    //Constructor initializing attributes
    public Skill(String skillName, String skillType, int skillLevel) {
        this.skillName = skillName;
        this.skillType = skillType;
        this.skillLevel = skillLevel;
    }

    //Getter Methods
    public String getName() {
        return skillName;
    }

    public String getType() {
        return skillType;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    //abstract method to identify skill
    public abstract void identifySkill();
}

//hardskill concrete class
class HardSkill extends Skill {
    public HardSkill(String name, int skillLevel) {
        super(name, "Hard", skillLevel);
    }

    @Override
    public void identifySkill() {
        System.out.println("Hard skill of " + getName() + " has a level of " + getSkillLevel());
    }
}

//softskill concrete class
class SoftSkill extends Skill {
    public SoftSkill(String name, int skillLevel) {
        super(name, "Soft", skillLevel);
    }

    @Override
    public void identifySkill() {
        System.out.println("Soft skill of " + getName() + " has a level of " + getSkillLevel());
    }
}

//giftskill concrete class
class GiftSkill extends Skill {
    public GiftSkill(String name, int skillLevel) {
        super(name, "Gift", skillLevel);
    }

    @Override
    public void identifySkill() {
        System.out.println("Gift skill of " + getName() + " has a level of " + getSkillLevel());
    }
}

//talentskill concrete class
class TalentSkill extends Skill {
    public TalentSkill(String name, int skillLevel) {
        super(name, "Talent", skillLevel);
    }

    @Override
    public void identifySkill() {
        System.out.println("Talent skill of " + getName() + " has a level of " + getSkillLevel());
    }
}