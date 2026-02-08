package Monster;

/** Project:Monster.Monster project
 * Purpose Details:ASSIGNMENT
 * Course:IST 242
 * Author:ZIZHOU XIANG
 * Date Developed:February.5 2026
 * Last Date Changed:February.8 2026
 * Rev:1.0
 */
public abstract sealed class Monster
        permits FireMonster, WaterMonster, EarthMonster {
    private String name;
    private int health;
    private SpecialPower specialPower;

    public Monster(String name, int health){
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public SpecialPower getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(SpecialPower specialPower) {
        this.specialPower = specialPower;
    }
    public abstract void specialPowers();
}
