package partie2;

public class Main {
    public static void main(String[] args) {
        UniteCentral uniteCentral = new UniteCentral();
        uniteCentral.setUsb(new Souris());
        System.out.println(uniteCentral.getUsb().read());

        uniteCentral.setVga(new VideoProjecteur());
        uniteCentral.getVga().printData("VGA Video Projecteur");

        uniteCentral.setVga(new HDMIAdapter(new TV()));
        uniteCentral.getVga().printData("VGA Video Projecteur");


    }
}
