package partie2;

import org.springframework.stereotype.Component;

@Component("clavier")
public class Clavier implements USBInterface{

    @Override
    public int read() {
        return 222;
    }
}
