public class GreatCircle 
{
    public static void main(String[] args)
    {
         // Parse command-line arguments (degrees)
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        // Mean radius of Earth in kilometers
        double r = 6371.0;

        // Haversine formula
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        double a = Math.pow(Math.sin(deltaX / 2), 2)
                 + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin(deltaY / 2), 2);
        double distance = 2 * r * Math.asin(Math.sqrt(a));

        System.out.println(distance + " kilometers");
    }
}
