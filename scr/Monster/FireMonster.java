package Monster;
/** Project:Monster.Monster project
 * Purpose Details:ASSIGNMENT
 * Course:IST 242
 * Author:ZIZHOU XIANG
 * Date Developed:February.5 2026
 * Last Date Changed:February.8 2026
 * Rev:1.0
 */
public final class FireMonster extends Monster {
    private int fireLevel;

    public FireMonster(String name, int health,int fireLevel){
        super(name, health);
        this.fireLevel = fireLevel;
    }
    public int getFireLevel(){
        return fireLevel;
    }

    @Override
    public void specialPowers() {
        System.out.println(getName() + " uses fire power:"+ getSpecialPower());
    }
}
