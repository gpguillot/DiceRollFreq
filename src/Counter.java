import java.util.ArrayList;

/* 
* This class contains the functions to count integer frequencies in lists. 
*/
public class Counter 
{
   /*
    * This method counts the number of equivalent integers for each and every
    * integer in an ArrayList with the tally counts being stored in an array
    * where the index+1 corresponds to the target integer.  
    * 
    * @param arr the ArrayList
    * 
    * @return the array containing count frequencies for each integer
    */
   public int[] countAllFrequencies(ArrayList<Integer> arr)
   {
      // each arr index corresponds to face value holding freq counts
      int[] resultArr = new int[arr.size()];
      
      for (int i = 0; i < resultArr.length; i++)
      {
         resultArr[i] = countTargetFrequency(arr, i + 1);
      }
      
      return resultArr;
   }
   
   /*
    * This helper method counts the number of equivalent integers in an 
    * ArrayList for a given target integer.
    * 
    * @param arr the ArrayList
    * @oaram target the int value for which to scan and count equivalents
    * 
    * @return the number of equivalent matching integers in ArrayList
    */
   public static int countTargetFrequency(ArrayList<Integer> arr, int target)
   {
      int count = 0;
      
      if (arr.indexOf(target) != -1)
      {
         count++;
         
         for (int i = arr.indexOf(target) + 1; i < arr.size(); i++)
         {
            if (arr.get(i) == target)
            {
               count++;
            }
            
         }
      }
      
      return count;
   }
   
   /*
    * This method extracts the face values for each dice in a group of die. 
    * 
    * @param arr the array of die
    * 
    * @return the list of face values associated with each die in group
    */
   public ArrayList<Integer> extractFaceValues(ArrayList<Die> arr)
   {
      ArrayList<Integer> theList = new ArrayList<Integer>();
      
      Die temp;
      for (int i = 0 ; i < arr.size(); i++)
      {
         temp = arr.get(i);
         theList.add(temp.getFaceValue());
      }
      
      return theList;
   }

}

