
/**
 * Class that represents a Card.
 *
 * @author Vivek Ily
 * @version 03/17/2021
 */
public class Card
{
   private String name;

   public Card()
   {
      name = "";
   }

   public Card(String n)
   {
      name = n;
   }

   public String getName()
   {
      return name;
   }

   public boolean isExpired()
   {
      return false;
   }

   public String toString()
   {
      return "Card holder: " + name;
   }
}
