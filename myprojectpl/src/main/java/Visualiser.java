/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class Visualiser {
    public void visualiseLightingSystem(boolean ... states){
        String visualisation = "Lighting system bulbs (x = off, o = on): ";
        for(boolean state : states){
            if(!state) {
                visualisation+="x";
            }else{
                visualisation+="o";
            }
        }
        System.out.println(visualisation);
    }
}
