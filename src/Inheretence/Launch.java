package Inheretence;

public class Launch {
    public static void main(String[] args) {
        SamsungS4 s4 = new SamsungS4();
        s4.audioRec();
        s4.audioListen();
        s4.cameraBack();
        s4.cameraFront();
        s4.ram(); //overrided method
        s4.rom();

        SamsungS5 s5 = new SamsungS5();
        s5.gps();
        s5.audioListen();
        s5.audioRec();
        s5.ram();
        s5.rom();
    }
}
