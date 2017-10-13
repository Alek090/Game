
/**
 * Write a description of class Room here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Room
{  
    private boolean roomCheck;
    public int number;
    private String name;
    private String description;
    
    
    /**
     * Constructor for objects of class Room
     */
    public Room(int number, String name, String description)
    {
        this.number = number;
        this.name = name;
        this.description = description;
        roomCheck = false;
    }

    // getter for roomCheck
    public boolean getRoomCheck()
    {
        return roomCheck;
    }
    
    // setter for roomCheckname
    public void setRoomCheck( boolean b )
    {
        roomCheck = b;
    }
    
    // getter for number
    public int getNumber()
    {
        return number;
    }
    
    // getter for name
    public String getName()
    {
        return name;
    }
    
    // getter for description
    public String getDescription()
    {
        return description;
    }
}
