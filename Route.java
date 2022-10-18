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
}