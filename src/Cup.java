import java.util.ArrayList;

/* 
* This class represents a cup of dice, which is used to roll a group of dice.
*/
public class Cup 
{
   private ArrayList<Die> dice;
   private int numDiceInCup;                
   private final int MINNUMDIE = 1; // min num of die that can be placed in cup
   
   /*
    * Constructor for instantiating an empty cup that can be loaded. 
    */
   public Cup()
   {
      // empty
   }
   
   /* 
    * Constructor to instantiate loaded cup of dice.
    * 
    * @param numDieToRoll the number of die to load into cup
    */
   public Cup(int numDieToRoll)
   {
      this.numDiceInCup = numDieToRoll;
      
      if (this.MINNUMDIE <= this.numDiceInCup)
      {
         this.dice = new ArrayList<Die>();
      }
      else
      {
         System.out.println("Error: Invalid number of die in cup.");
      }
   }
   
   /*
    * Assigns cup with specified number of dice.
    * 
    * @param numDieToRoll the number of die to load into cup
    */
   public void load(int numDieToRoll)
   {
      this.numDiceInCup = numDieToRoll;
      
      if (this.MINNUMDIE <= this.numDiceInCup)
      {
         this.dice = new ArrayList<Die>();
      }
      else
      {
         System.out.println("Error: Invalid number of die in cup.");
      }
   }
   
   /*
    * Toss the dice from cup to generate randomized face values for each
    * individual die.
    * 
    * @return the randomized face value associated with each die in cup
    */
   public ArrayList<Die> toss()
   {
      for (int i = 0; i < this.numDiceInCup; i++)
      {
         Die die = new Die();
         die.roll();
         dice.add(die);
      }

      return this.dice;
   }
   
   /*
    * Print the face values associated with each rolled die from the cup.
    */
   public void printResults()
   {  
      if (this.dice.size() > 0)
      {
         for (int i = 0; i < this.dice.size(); i++)
         {
            System.out.print("[" + this.dice.get(i).getFaceValue() + "]");
         }
      }
      else
      {
         System.out.println("There are no dice to show.");
      }
   }

   /*
    * Getter to retrieve the dice. 
    * 
    * @return the dice
    */
   public ArrayList<Die> getDice() 
   {
      return this.dice;
   }

   @Override
   public String toString() 
   {
      return "Cup [dice=" + this.dice.toString() + "]";
   }
   
}


