package partie2;

import org.springframework.stereotype.Component;

@Component("ecran")
public class Ecran implements VGAInterface{
    @Override
    public void printData(String data) {
        System.out.println("Ecran VGA impl");
    }
}
