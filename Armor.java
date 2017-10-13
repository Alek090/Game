
/**
 * Armors are used in combat.
 * 
 * @author Brandon Bettes 
 * @version 0.1
 */
public class Armor
{
    // instance variables - replace the example below with your own
    private String name;
    private int defense, weight;

    /**
     * Constructor for objects of class Armor
     */
    public Armor(String name, int weight, int defense)
    {
        this.name = name;
        this.weight = weight;
        this.defense = defense;
    }
    
    /**
     * @return Armor's name
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * @return defense amount
     */
    public int getDefense()
    {
        return this.defense;
    }
    
    /**
     * @return weight amount
     */
    public int getWeight()
    {
        return this.weight;
    }
}
