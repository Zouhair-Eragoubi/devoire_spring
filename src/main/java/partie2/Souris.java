package partie2;

import org.springframework.stereotype.Component;

@Component("souris")
public class Souris implements USBInterface{
    @Override
    public int read() {
        return 111;
    }
}
