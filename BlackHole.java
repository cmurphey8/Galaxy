/**********************************************************************************
 *
 *  GOAL: Complete the updateF(...) method to add the eat other objects functionality
 *              
 **********************************************************************************/
import java.util.Scanner;

public class BlackHole extends Body {

    // create and init a new object with input parameters scanned from a .txt file
    // this instance is for our supermassive blackhole only!
    public BlackHole(Scanner scan, double R) {
        super(scan, R);
        newImage("blackhole.gif");
        reinit();
    }

    // create and init a new object with an array of input parameters
    public BlackHole(double[] arr, double R) {
        super(arr, R);
        newImage("blackhole.gif");
        newSize(0.5);
        reinit();
        
    }

    // use body force update and then attempt to eat neighbors
    @Override
    public void updateF(Body obj, double G) {
        super.updateF(obj, G);
        // TODO: if the distance from this object to the input parameter obj is less than 
        //       either of the two object's radii (assumed half the size of an object), 
        //       then eat the parameter obj
    }
}
