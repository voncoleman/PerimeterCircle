public class PerimeterCircle {
    private static final double radius = 7.5;   //This line of code tells me that the program will calculate the perimeter and area of a circle with a radius of  7.5
    {}
        public static void main (String[] args){        //Start of the program


            double perimeter = 2 * Math.PI * radius;    //This line calculates the perimeter of a circle.
            double area = Math.PI * radius * radius;    //This line calculates the area of a circle.

            System.out.println("Perimeter is = " + perimeter);
            System.out.println("Area is = " + area);
        
    }
}
