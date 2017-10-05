/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class Inspector {

    public void inspectLighting(boolean ... states){
        int numberOfDefectiveBulbs = 0;
        for (boolean state : states) {
            if(!state){
                numberOfDefectiveBulbs++;
            }
        }
        if(numberOfDefectiveBulbs > 0){
            System.out.println("Malfunctions detected: A total of "+
                    numberOfDefectiveBulbs+" have stopped working.");
        }else{
            System.out.println("No malfunctions detected - lighting systems nominal.");
        }
    }

}
