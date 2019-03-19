
/**
 * Lav en beskrivelse af klassen Driver her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class Driver
{
    public static void exam()
    {
        System.out.println("");
        Biker b1 = new Biker("Ozzy Osbourne", 2, false);
        Biker b2 = new Biker("Hans", 10, true);
        Biker b3 = new Biker("Jack", 0, false);
        Biker b4 = new Biker("James", 3, false);
        Biker b5 = new Biker("Ryan", 1, true);
        
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println(b4.toString());
        System.out.println(b5.toString());
        
        System.out.println("");
        MotorcycleClub mc = new MotorcycleClub("Hells Angels");
        mc.add(b1);
        mc.add(b2);
        mc.add(b3);
        mc.add(b4);
        mc.add(b5);
        
        System.out.println("");
        System.out.println("Find the least respected biker: ");
        System.out.println(mc.leastRespectedBiker());
        
        System.out.println("");
        System.out.println("Find all bikers who are not hospitilized: ");
        System.out.println(mc.readyBikers(2));
        
        System.out.println("");
        mc.printMotorcycleClub();
    }
}
