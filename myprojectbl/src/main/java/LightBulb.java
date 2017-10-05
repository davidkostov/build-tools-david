/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class LightBulb {
    private boolean state;

    public LightBulb(){
        this.state = false;
    }

    public void turnOn(){
        state = true;
    }

    public void turnOff(){
        state = false;
    }

    public boolean isOn(){
        return state;
    }
}
