
/**
 * Write a description of class Mobile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mobile
{
    private String name;
    private String playerClass;
    private int currentHealth;
    private int maxHealth = currentHealth;
    private int defense;
    private int strength;
    private int intelligence;
    private int currentMana;
    private int maxMana;
    /**
     * Constructor for objects of class Mobile
     */
    public Mobile(String name, String playerClass, int strength, int intelligence, int currentHealth, int defense, int mana )
    {
        // initialise instance variables
        this.name = name;
        this.playerClass = playerClass;
        this.strength = strength;
        this.intelligence = intelligence;
        this.defense = defense;
        this.currentHealth = currentHealth*10;
        this.currentMana = currentMana*10;
        this.maxHealth = currentHealth*10;
        this.maxMana = currentHealth*10;
        

    }
    
    
    /**
     * @return value of Mobile's strength
     */
    public int getStrength()
    {
        int num = strength;
        switch(playerClass)
        {
            case "orc":
            {
                return strength + 5;
            }
            default :
            {
                return strength;
            }
        }
        
    }
    
    public int getMaxMana()
    {
        int num = currentMana;
        switch(playerClass)
        {
            case "mage":
            {
                return (int)(maxMana*1.2);
            }
            default:
            {
                return maxMana;
            }
        }
    }
    
    public int getMaxHealth()
    {
        int num = currentHealth;
        switch (playerClass)
        {
            case "valkyrie":
            {
                return (int)(maxHealth*1.1);
                
            }
            default:
            {
                return maxHealth;
            }
        }
    }
    
    
    
    
    /**
     * @return current value of Mobile's health
     */
    public int getCurrentHealth()
    {
        return this.currentHealth;
    }
    
    public int getCurrentMana()
    {
        return this.currentMana;
    }
    
    /**
     * 
     */
    public String getPlayerClass()
    {
        return this.playerClass;
    }
    
     /**
     * Damages Mobile
     * 
     * @param d - value of damage
     * 
     * @return true if damage kills Mobile
     *          false otherwise
     */
    public boolean damage( int d )
    {
        if( d >= this.currentHealth )
        {
            this.currentHealth = 0;
            return true;
        }
        else if( d > 0 )
        {
            this.currentHealth -= d;
        }
        // Notice!  We are ignoring damage if (d < 0).  Do you agree that we should?
        
        return false;
    }
    
    /**
     * Adds value to Mobile's current health
     * 
     * @param h - value to add
     */
    public void addHealth( int h )
    {
        if( h > 0 )
        {
            this.currentHealth += h;
        }
         // Notice!  We are ignoring damage if (h <= 0).  Do you agree that we should?
    }

    /**
     * @return current value of Mobile's defense
     */
    public int getDefence()
    {
        return this.defense;
    }

    /**
     * Uses stamina of Mobile
     * 
     * @param s - value of stamina used
     * 
     * @return false if Mobile has enough stamina required
     *         true otherwise
     */
//     public boolean useStam( int s )
//     {
//         if( s > this.stamina )
//         {
//             return false;
//         }
//         else if( s > 0 )
//         {
//             this.stamina -= s;
//             return true;
//         }
//         // Notice!  We are ignoring damage if (s < 0).  Do you agree that we should?
//         
//         
//         return true; // What happens if we remove this line?
//     }
    
    /**
     * Adds value to Mobile's current stamina
     * 
     * @param s - value to add
     */
//     public void addStamina( int s )
//     {
//         if( s > 0 )
//         {
//             this.stamina += s;
//         }
//          // Notice!  We are ignoring damage if (s <= 0).  Do you agree that we should?
//     }
    
    /**
     * @return Mobile's name
     */
    public String getName()
    {
        return this.name;
    }


    /**
     * @return value of Mobile's intelligence
     */
    public int getIntelligence()
    {
        return this.intelligence;
    }
}

