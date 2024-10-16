package assigment5;

public class SmartHomeFacade {
    private Light light;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EntertainmentSystem entertainmentSystem;

    public SmartHomeFacade(Light light, Thermostat thermostat, SecuritySystem securitySystem, EntertainmentSystem entertainmentSystem) {
        this.light = light;
        this.thermostat = thermostat;
        this.securitySystem = securitySystem;
        this.entertainmentSystem = entertainmentSystem;
    }

    // Method to simplify leaving the house
    public void leaveHome() {
        System.out.println("Leaving home...");
        light.turnOff();
        thermostat.setTemperature(18); // Set energy-saving temperature
        securitySystem.arm();
        entertainmentSystem.turnOff();
    }

    // Method to simplify arriving home
    public void arriveHome() {
        System.out.println("Arriving home...");
        light.turnOn();
        thermostat.setTemperature(22); // Set comfortable temperature
        securitySystem.disarm();
    }

    // Method to enable night mode
    public void nightMode() {
        System.out.println("Activating night mode...");
        light.turnOff();
        thermostat.setTemperature(16); // Set lower temperature
        securitySystem.arm();
    }

    // Method to set up movie mode
    public void movieMode() {
        System.out.println("Activating movie mode...");
        light.turnOff();
        thermostat.setTemperature(20); // Set comfortable temperature for movie watching
        entertainmentSystem.setMovieMode();
        entertainmentSystem.turnOn();
    }
}
