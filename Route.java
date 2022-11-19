import java.util.ArrayList;

public class Route
{
    private boolean delayed;
    private boolean canceled;
    private boolean unavailible;
    private ArrayList<Stop> stops;
    
    public Route()
    {
        delayed = false;
        canceled = false;
        unavailible = false;
        stops = new ArrayList<Stop>();
    }
    
    public Route(boolean delayed, boolean canceled, boolean unavailible)
    {
        this.delayed = delayed;
        this.canceled = canceled;
        this.unavailible = unavailible;
    }
    
    public boolean isDelayed()
    {
         return delayed;
    }
    
    public boolean isCanceled()
    {
         return canceled;
    }
    
    public boolean isUnavailable()
    {
         return unavailible;
    }
    
    public String status()
    {
        if (isDelayed())
        {
            return new String("Delayed");
        }
        else if (isCanceled())
        {
            return new String("Canceled");
        }
        else if (isUnavailable())
        {
            return new String("Unavailable");
        }
        else
        {
            return new String("On Time, on Route");
        }
    }
    public String toString()
    {
        status();
    }
}
