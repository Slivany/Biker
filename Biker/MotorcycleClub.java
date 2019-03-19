import java.util.*;

/**
 * Lav en beskrivelse af klassen MotorcycleClub her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class MotorcycleClub
{
    private String name;
    private ArrayList<Biker> bikers;
    
    public MotorcycleClub(String name)
    {
        this.name = name;
        bikers = new ArrayList<Biker>();
    }
    
    public void add(Biker b)
    {
        bikers.add(b);
    }
    
    public Biker leastRespectedBiker()
    {
        Biker respect = null;
        for(Biker b : bikers)
        {
            if(respect == null || respect.getShots() > b.getShots())
            {
                respect = b;
            }
        }
        return respect;
    }
    
    public ArrayList<Biker> readyBikers(int maxAmount)
    {
        ArrayList<Biker> res = new ArrayList<Biker>();
        for(Biker b : bikers)
        {
            if(b.isHospitalized() == false && maxAmount > res.size()) //skal have størrelsen af bikers!
            {
                res.add(b);
            }
        }
        return res;
    }
    
    public void printMotorcycleClub()
    {
        System.out.println(name);
        
        Collections.sort(bikers);
        
        for(Biker b : bikers)
        {
            System.out.println(b);
        }
    }
}
