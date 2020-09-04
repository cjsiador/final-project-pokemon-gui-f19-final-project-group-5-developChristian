/**
* interface for Normal type Pokemon.
* Fails checkstyle because no methods.
* @author Lisa Miller
* @since 9/17/2017
*/
public interface NormalType {
   /** constants **/
   /** Type name String. */
   String NORMAL_TYPE = new String("Normal");
   /** Type color String. */
   String NORMAL_COLOR = new String("Brown");
   /** Array of type fast attack names. */
   String[] NORMAL_FAST_ATTACKS = {"Quick Attack", "Tackle", "Body Slam"};
   /** Array of type special attack names. */
   String[] NORMAL_SPECIAL_ATTACKS = {"Last Resort", "Swift"}; 
   /** Array of fast attack powers, coincides with name array. */
   int[] NORMAL_FAST_ATK_POWER = {8, 5, 50}; 
   /** Array of special attack powers, coincides with name array. */     
   int[] NORMAL_SPECIAL_ATK_POWER = {90, 60};

}
