/**
* A container for coins.
*
* @author Lisa Miller
* @since 9/23/2017
*/
public class Pocket {
  /** number of coins held. */
   private int nCoins = 0;
   /** array to hold the coins. */
   private Coin[] coins = new Coin[10];
    
   /**
    * adds a Coin to the front of the array.
    * @param c the Coin to be added
    */ 
   public void addCoin(Coin c) {
      if (nCoins > 0) { relocateUp(); }
      coins[0] = c;
      nCoins++;
   }
   
   /**
   * Takes out the Coin at the front of the array.
   * Reduces count of Coins held.
   */
   public void removeCoin() {
      if (nCoins > 0) { relocateDown(); }
      coins[nCoins] = null;
      nCoins--;
   }
   
   /**
   * Returns whole array of Coins.
   * @return an array of Coins.
   */
   public Coin[] getCoins() {
      return coins;
   }
   
   /**
   * Moves all Coins in array up 
   * one index ( [i-1] -> [i]).
   */
   private void relocateUp() {
      for (int i = nCoins; i > 0; i--) {
         coins[i] = coins[i - 1];
      }
   }
   
   /**
   * Moves all Coins in array down 
   * one index ( [i+1] -> [i]).
   * Erases Coin at index 0.
   */
   private void relocateDown() {
      for (int i = 0; i < nCoins; i++) {
         coins[i] = coins[i + 1];
      }
   }
}
