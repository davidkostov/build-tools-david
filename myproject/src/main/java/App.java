/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */

public class App {

    public static void main(String[] args) {
        LightBulb bulb1 = new LightBulb();
        LightBulb bulb2 = new LightBulb();
        LightBulb bulb3 = new LightBulb();
        bulb1.turnOn();bulb2.turnOn();bulb3.turnOn();
        new Visualiser().visualiseLightingSystem(
                bulb1.isOn(),bulb2.isOn(),bulb3.isOn()
        );
        new Inspector().inspectLighting(
                bulb1.isOn(),bulb2.isOn(),bulb3.isOn()
        );
    }

}
