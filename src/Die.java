/* 
* This class represents a single die, which can be rolled.
*/
public class Die 
{
  private final int NUMFACES = 6;   // number of faces on die
  private int faceValue;            // numeric value of side facing up
  
  /*
   * Rolls a die by generating a random number between 1 and the number 
   * of faces. 
   * 
   * @return the value facing up
   */
  public int roll() 
  {
     this.faceValue = (int)(Math.random() * this.NUMFACES) + 1;
     return this.faceValue;
  }

  /*
   * Getter to retrieve the face value of die.
   * 
   * @return the faceValue
   */
  public int getFaceValue() 
  {
     return this.faceValue;
  }
  
  /*
   * Getter to retrieve the number of faces on the die.
   * 
   * @return the NUMFACES
   * 
   */ 
  public int getNUMFACES() 
  {
     return this.NUMFACES;
  }
  
  @Override
  public String toString() 
  { 
     return "Die [faceValue=" + this.faceValue+ "]";
  }
  
}

