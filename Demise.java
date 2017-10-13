import java.util.*;
/**
 * Write a description of class Demise here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Demise
{
    /** 
     * 
     * Field variables Go Up Here
     * 
     */
    // Declare any field, aka world variables that you need here.
    // For example, you could assign a number to each room so that we know where the player
    // is currently located. Uses key word static in declaration.
    // Example:
    static Room currentRoom;
    static int currentRoomNum;
    // If you want the player to have character stats, declare them here as a static variable.
    // Examples:
    static Mobile player;

    static Room starterRoom;
    static Room lockedRoom;
    static Room room1;
    static Room room2;
    static Room room3;
    static Room room4;
    static Room room5;

    // If you want to have items that the player can find in game and add to their 'inventory',
    // declare item variables here. We can use booleans to represent if the player has the item
    // in their inventory or not.
    // Examples:

    /** Elven sword
     * 
     *  taken name: sword
     */
    static boolean sword;
    static int swordLocation; // Keep track of item location.

    /** Oil lamp
     * 
     *  starts in pack
     *  taken name: lamp, oillamp
     *  useable: lamp
     */
    static boolean oilLamp;
    static boolean oilLampOn;

    // Keep track of the turns taken by player:
    static int turnsTaken;

    // key

    // knife

    // End of field variables
    /*
     * begins game
     */
    public static void main(String[] args)
    {
        boolean run = true;
        do
        {
            Scanner sc = new Scanner(System.in);

            System.out.print("\n\nWould you like to begin or quit? ");
            String response = sc.next().toLowerCase();

            if( response.equals("begin") )
            {
                startGame();
                run = false; // after our game is over, exit the loop
            }
            else if( response.equals("quit") )
            {
                run = false;
            }
            else
            {
                System.out.println("\n\nPlease enter either begin or quit.");
            }
        }while(run);
    }

    /** Starts a new game
     */
    public static void startGame()
    {
        displayIntro();  // Display the game's intro!

        init(); // Initialize game variables - plyer stats etc...

        displayCurrentRoom(currentRoom);  // Display the starting room description

        boolean menu = true;
        do
        {
            Scanner kb = new Scanner(System.in);

            String getAction = kb.next().toLowerCase();

            switch( getAction )
            {
                case "inventory":
                {
                    //displayInventory();
                    break;
                }
                case "look":
                {
                    //displayCurrentRoom(currentRoom);
                    break;
                }
                case "take":
                case "get":
                {
                    //takeItem();
                    break;
                }
                // how ot move rooms
                case "room":
                {
                    // move( getAction );
                    break;
                }
                case "n":
                case "north":
                case "s":
                case "south":
                case "e":
                case "east":
                case "w":
                case "west":
                {
                    move( getAction );
                    break;
                }
                case "go":
                case "walk":
                case "run":
                case "jog":
                {
                    System.out.println("Which direction do you want to " + getAction + "?");
                    break;
                }

                case "quit":
                {
                    menu = false;
                    break;
                }

                default:
                {
                    System.out.println("You can not do that, action not defined");
                    break;
                }

            }

            System.out.println(); // print a space between attempted actions

        }while( menu );
    }

    /** Displays a description of the room where the character is currently located.
     */
    public static void displayCurrentRoom(Room room)
    {

        System.out.println( room.getDescription() );

    }

    public static void displayIntro()
    {
        System.out.println("Welcome to Demise! game intro... ");
    }

    public static void init()
    {
        Scanner sc= new Scanner(System.in);
        //name for player
        System.out.print("\n\nEnter the name you would like to be called:  ");
        String name = sc.next();

        //sets players base stats
        boolean check = true;
        System.out.println("\n\n" + name + ", there are 5 different stats you can choose to change." + " Everything starts \nat a base of 10" +
            " and you have 20 free points to \nadd to" + " your strength, intelligence, health, defense, and " +
            "mana.(In \nthis order decide how many points you want to add to each \nstat and put a space" + 
            "after each number with your total equalling 20 points. \nEx: 4 6 2 3 5)\n\n");

        int strength=10; int intelligence=10; int health=10; int defense=10; int mana=10;

        do
        {
            strength+=sc.nextInt(); intelligence+=sc.nextInt(); health+=sc.nextInt(); defense+=sc.nextInt(); mana+=sc.nextInt();

            if((strength + intelligence + health + defense + mana) == 70)
            {
                check = false;
                break;
            }
            else
            {
                System.out.println("\n\nYour Stats do not add up to 20. Please try again and "+
                    "\nremember the order: Strength, intelligence, health defense, " +
                    "\nand mana.");
            }
        }while(check);

        //sets player base class
        System.out.println("\n\nDecide the type of class you would like your player to be:");
        System.out.println("Valkyrie - gives 10% bonus to health.");
        System.out.println("Mage - gives 20% bonus to mana.");
        System.out.println("Orc - gives 5 bonus points to Strength stat.");
        System.out.println("");
        String playerClass = sc.next();

        // create all room objects here:
        String descStartingRoom = "\nYou awake from a cot in a dungeon cell not knowing how " +
            "\nyou got there. The room is well lit by a torch on the wall." +
            "\nThere is a cell door on the far side that appears to be unlocked and " +
            "\nopen, revealing a long darkening corridor";
        Room startingRoom = new Room( 1, "starting room", descStartingRoom );

        String descStartingRoomCooridor = "\nDown the long, dark corridor you come to a locked door. Hmmm..." +
            " there must be a key somewhere...";
        Room startingRoomCorridor = new Room( 2, "dark corridor", descStartingRoomCooridor);

        /** 
         * Starting room:
         */
        currentRoom = startingRoom;

        // Mobile(String name, playerClass, int strength, int intelligence, int health, int stamina, int mana )
        Mobile player = new Mobile(name, playerClass, strength, intelligence, health, defense, mana);
        //System.out.println( player.getStrength());
    }

    /** 'Move' command
     * 
     * Moves the player in a given direction.
     * 
     * @param direction - the direction the player wants to go.
     */
    public static void move(String direction)
    {
        //change how this works!

        if( canMove(direction) )
        {
            
            switch(currentRoomNum)
            {
                case 1: // starting room
                {
                    if( direction.equals("n") || direction.equals("north") )
                    {
                        // currentRoom = startingRoomCorridor;
                    }

                    break;
                }
                case 2: // cave entrance
                {
                    if( direction.equals("s") || direction.equals("south") )
                    {
                        currentRoomNum = 1;
                    }

                    break;
                }
                default:
                {
                    break;
                }
            }
        }
        else
        {
            System.out.println("You cannot move in that direction.");
        }

        displayCurrentRoom(currentRoom);
    }

    /** @param direction - the direction the player wants to go.
     * 
     *  @return true if the player's chosen direction is allowed from their current location,
     *          false otherwise.
     */
    public static boolean canMove( String direction )
    {
        // change how this works!

        switch( currentRoom.getNumber())
        {
            case 1: // Can only move north from this room
            {
                if(direction.equals("n") || direction.equals("north"))
                    return true;
                else
                    return false;
            }
            case 2: // Can only move south from this room
            {
                if(direction.equals("s") || direction.equals("south"))
                    return true;
                else
                    return false;
            }
            default:
            {
                return false;
            }
        }

        
    }

}
