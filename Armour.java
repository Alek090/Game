
/**
 * Write a description of class Armour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Armour
{
    
/**
 * Weapons are used in combat.
 * 
 * @author Brandon Bettes 
 * @version 0.1
 */
public class Weapon
{
    // instance variables - replace the example below with your own
    private String name;
    private int minDamage, maxDamage, weight;

    /**
     * Constructor for objects of class Weapon
     */
    public Weapon(String name, int weight, int minDamage, int maxDamage)
    {
        this.name = name;
        this.weight = weight;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }
    
        /**
     * @return Weapon's name
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * @return minDamage amount
     */
    public int getMinDamage()
    {
        return this.minDamage;
    }
    
    /**
     * @return maxDamage amount
     */
    public int getMaxDamage()
    {
        return this.maxDamage;
    }
    
    /**
     * @return weight amount
     */
    public int getWeight()
    {
        return this.weight;
    }
}

}

