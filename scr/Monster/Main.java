package Monster;
/** Project:Monster.Monster project
 * Purpose Details:ASSIGNMENT
 * Course:IST 242
 * Author:ZIZHOU XIANG
 * Date Developed:February.5 2026
 * Last Date Changed:February.8 2026
 * Rev:1.0
 */
public class Main {
    public static void main(String[] args){
        Monster m1 = new FireMonster("Flame", 100, 5);
        Monster m2 = new WaterMonster("Aqua", 90, 8);
        Monster m3 = new EarthMonster("Rock", 120, 10);
        Monster m4 = new FireMonster("Blaze", 95, 6);
        Monster m5 = new WaterMonster("IceMan", 90, 7);
        m1.setSpecialPower(SpecialPower.FIRE_BLAST);
        m2.setSpecialPower(SpecialPower.WATER_SPLASH);
        m3.setSpecialPower(SpecialPower.EARTH_QUAKE);
        m4.setSpecialPower(SpecialPower.POISON_ATTACK);
        m5.setSpecialPower(SpecialPower.ICE_FREEZE);

        m1.specialPowers();
        m2.specialPowers();
        m3.specialPowers();
        m4.specialPowers();
        m5.specialPowers();

        System.out.println("monster Details:");
        System.out.println(m1.getName() + " Health: " + m1.getHealth());
        System.out.println(m2.getName() + " Health: " + m2.getHealth());
        System.out.println(m3.getName() + " Health: " + m3.getHealth());
        System.out.println(m4.getName() + " Health: " + m4.getHealth());
        System.out.println(m5.getName() + " Health: " + m5.getHealth());
    }
}
