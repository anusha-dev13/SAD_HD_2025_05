package SOLID;

//FIXED: Now using Dependency Inversion Principle

public class DIP_01 {
    public interface Switchable {
        void turnOn();
        void turnOff();
    }
    public static class LightBulb implements Switchable {
        public void turnOn() {
            System.out.println("Light is ON!");
        }
        public void turnOff() {
            System.out.println("Light is OFF!");
        }
    }
    public static class Switch {
        private Switchable device;

        public Switch(Switchable device) {
            this.device = device;
        }
        public void operate() {
            device.turnOn();  
        }
        public void turnOff() {
            device.turnOff();
        }
    }

    public static void main(String[] args) {
        Switchable lightBulb = new LightBulb();
        Switch lightSwitch = new Switch(lightBulb);
        lightSwitch.operate();
        lightSwitch.turnOff();
    }
}


    
    