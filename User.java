public class User
{
    public String status(Route route)
    {
        if (route.isDelayed())
        {
            return new String("Delayed");
        }
        else if (route.isCanceled())
        {
            return new String("Canceled");
        }
        else if (route.isUnavailable())
        {
            return new String("Unavailable");
        }
        else
        {
            return new String("On Time, on Route");
        }
    }
}