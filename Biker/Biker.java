
/**
 * Lav en beskrivelse af klassen Biker her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class Biker implements Comparable<Biker>
{
    private String name;
    private int bulletWounds;
    private boolean hospitalized;

    /**
     * Konstruktør for objekter af klassen Biker
     */
    public Biker(String name, int bulletWounds, boolean hospitalized)
    {
        this.name = name;
        this.bulletWounds = bulletWounds;
        this.hospitalized = hospitalized;
    }

    public String toString()
    {
        return "Name: " + name + ", Wounds: " + bulletWounds + ", Hospitalized: " + hospitalized;
    }
    
    public int getShots()
    {
        return bulletWounds;
    }
    
    public boolean isHospitalized()
    {
        return hospitalized;
    }
    
    public int compareTo(Biker other)
    {
        if(bulletWounds != other.bulletWounds)
        {
            return bulletWounds - other.bulletWounds;
        }
        return name.compareTo(other.name);
    }
}
