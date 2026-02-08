package Monster;
/** Project:Monster.Monster project
 * Purpose Details:ASSIGNMENT
 * Course:IST 242
 * Author:ZIZHOU XIANG
 * Date Developed:February.5 2026
 * Last Date Changed:February.8 2026
 * Rev:1.0
 */
public final class EarthMonster extends Monster {
    private int defense;
    public EarthMonster(String name, int health, int defense){
        super(name, health);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public void specialPowers() {
        System.out.println(getName()+" uses earth power:" + getSpecialPower());
    }
}
