package partie2;

import org.springframework.stereotype.Component;

@Component("tv")
public class TV implements HDMIInterface{
    @Override
    public void print(byte[] data) {
        System.out.println("TV");
    }
}
