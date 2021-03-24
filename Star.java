/**********************************************************************************
 *
 *  GOAL: Complete the step(...) method too add supernove functionality
 *              
 **********************************************************************************/
import java.util.Scanner;

public class Star extends Body {
    private final double NOVA_RATE = 1.2;
    private final double NOVA_GROWTH = Math.pow(NOVA_RATE, 10);
    
    private boolean startNova = false;
    private int novaCount = 0;

    // create and init a new object with input parameters scanned from a .txt file
    public Star(Scanner scan, double R) {
        super(scan, R);
    }

    // start the supernova process randomly
    public void Nova() {
        if (Math.random() > 0.99995) {
            startNova = true;
        }
    }

    // use Body step update and then attempt to supernova
    @Override 
    public void step(double dt, double R) {
        super.step(dt, R);
        if (startNova) {
            // TODO: multiply the size of the Star by a growth factor (see NOVA_RATE) for 10 time-steps
            //       (see novaCount) and then update the image to either a blackhole, a pulsar, 
            //       or a neutron star depending on the size (see NOVA_GROWTH) of the star:
            //       top 20% size    -> blackhole
            //       next 40% size   -> pulsar
            //       bottom 40% size -> neutron star
        }
        else {
            Nova();
        }
    }

}
