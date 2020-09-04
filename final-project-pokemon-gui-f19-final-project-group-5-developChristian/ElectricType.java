/**
* interface for Water type Pokemon.
* Fails checkstyle because no methods.
* @author Lisa Miller
* @since 9/17/2017
*/
public interface ElectricType {
   /** constants **/
   /** Type name String. */
   String ELECTRIC_TYPE = new String("Electric");
   /** Type color String. */ 
   String ELECTRIC_COLOR = new String("Yellow");
   /** Array of type fast attack names. */
   String[] ELECTRIC_FAST_ATTACKS = {"Thunder Shock", "Volt Switch"};
   /** Array of type special attack names. */
   String[] ELECTRIC_SPECIAL_ATTACKS = {"Thunder", "Thunder Bolt", 
                                        "Last Resort", "Discharge"};
   /** Array of fast attack powers, coincides with name array. */
   int[] ELECTRIC_FAST_ATK_POWER = {5, 20};
   /** Array of special attack powers, coincides with name array. */  
   int[] ELECTRIC_SPECIAL_ATK_POWER = {100, 80, 90, 65};

}