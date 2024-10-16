import assigment5.*;
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Thermostat thermostat = new Thermostat();
        SecuritySystem securitySystem = new SecuritySystem();
        EntertainmentSystem entertainmentSystem = new EntertainmentSystem();

        // Create the facade
        SmartHomeFacade smartHome = new SmartHomeFacade(light, thermostat, securitySystem, entertainmentSystem);

        // Simulate different actions
        smartHome.arriveHome();
        System.out.println();
        smartHome.movieMode();
        System.out.println();
        smartHome.nightMode();
        System.out.println();
        smartHome.leaveHome();

}
}