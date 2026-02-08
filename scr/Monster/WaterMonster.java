package Monster;
/** Project:Monster.Monster project
 * Purpose Details:ASSIGNMENT
 * Course:IST 242
 * Author:ZIZHOU XIANG
 * Date Developed:February.5 2026
 * Last Date Changed:February.8 2026
 * Rev:1.0
 */
public final class WaterMonster extends Monster {
    private int swimSpeed;

    public WaterMonster(String name, int health, int swimSpeed){
        super(name, health);
        this.swimSpeed = swimSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    @Override
    public void specialPowers() {
        System.out.println(getName() + " uses water power:" + getSpecialPower());

    }
}
