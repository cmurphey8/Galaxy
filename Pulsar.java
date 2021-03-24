/**********************************************************************************
 *
 *  GOAL: Complete step(...) method to add pulse functionality
 *              
 **********************************************************************************/

public class Pulsar extends Body {

    private boolean imageRev;
    private int imageCount;

    // create and init a new object with input parameters scanned from a .txt file
    public Pulsar(double[] arr, double R) {
        super(arr, R);
        newImage("pulsar.gif");
        reinit();

        imageCount = 0;
        imageRev = false;
    }

    // use Body step update and then attempt to update image
    @Override
    public void step(double dt, double R) {
        super.step(dt, R);
        // TODO: swap the image between "pulsar.gif" and "pulsarR.gif" every 10 steps
        //       (see imageRev, imageCount)
    }
}
