import java.util.ArrayList;

/**
* A container for coins.
*
* @author Lisa Miller
* @since 9/23/2017
*/
public class PocketAL {

   /** arrayList to hold the coins. */
   private ArrayList<Coin> coins = new ArrayList<>();
    
   /**
    * adds a Coin to the front of the array.
    * @param c the Coin to be added
    */ 
   public void addCoin(Coin c) {
      coins.add(0, c);
   }
   
   /**
   * Takes out the Coin at the front of the array.
   * Reduces count of Coins held.
   */
   public void removeCoin() {
      coins.remove(0);
   }
   
   /**
   * Returns whole array of Coins.
   * @return an array of Coins.
   */
   public ArrayList<Coin> getCoins() {
      return coins;
   }
   
   /**
   * Returns how many Coins held.
   * @return the number of Coins held.
   */
   public int getNumCoins() {
      return coins.size();
   }
}
