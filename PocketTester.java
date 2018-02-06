/**
* Driver class for Pocket.
* @author Lisa Miller
* @since 2/4/2018
*/
public class PocketTester {
   /** main method.
   * @param args not used.
   */
   public static void main(String [] args) {
    
      Pocket myPocket = new Pocket();
      Coin c;
      int counter = 0;
      myPocket.addCoin(new Penny());
      myPocket.addCoin(new Nickel());
      myPocket.addCoin(new Dime());
      myPocket.addCoin(new Quarter());
      myPocket.addCoin(new HalfDollar());
      myPocket.addCoin(new DollarCoin());
      
      c = myPocket.removeCoin();
      System.out.println("I removed a " + c.getName());
      
      counter = myPocket.getNCoins();
      Coin [] copy = myPocket.getCoins();
      
      for (int i = 0; i < counter; i++) {
         System.out.println(copy[i].getName());
      }
      
      for (int i = 0; i < counter; i++) {
         c = myPocket.removeCoin();
         System.out.println("I removed a " + c.getName());
      }
      
      //cause NullPointerException
      //c = myPocket.removeCoin();
      //System.out.println("I removed a " + c.getName());
   }
}