package StructuralPatterns.FacadePattern.example;

public class GeneralSwitchFacade {
    private static GeneralSwitchFacade gsf;
    private Light[] lights;
    private Fan fan;
    private TV tv;

    private GeneralSwitchFacade() {
        lights = new Light[3];
        lights[0] = new Light("Front");
        lights[1] = new Light("Middle");
        lights[2] = new Light("Back");
        fan = new Fan();
        tv = new TV();
    }

    public static GeneralSwitchFacade getGeneralSwitchFacade(){
        if(gsf == null){
            gsf = new GeneralSwitchFacade();
        }
        return gsf;
    }

    public void on(){
        for(Light light : lights){
            light.turnOn();
        }
        fan.turnOn();
        tv.turnOn();
    }

    public void off(){
        for(Light light : lights){
            light.turnOff();
        }
        fan.turnOff();
        tv.turnOff();
    }
}
