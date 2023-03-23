package partie2;

import org.springframework.stereotype.Component;

@Component("videoProjecteur")
public class VideoProjecteur implements VGAInterface{
    @Override
    public void printData(String data) {
        System.out.println(data);
    }
}
