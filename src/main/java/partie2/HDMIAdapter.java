package partie2;

import org.springframework.stereotype.Component;

@Component("hdmiAdapter")
public class HDMIAdapter implements VGAInterface{

    private HDMIInterface hdmiInterface;

    public HDMIAdapter(HDMIInterface hdmiInterface) {
        this.hdmiInterface = hdmiInterface;
    }

    @Override
    public void printData(String data) {
        this.hdmiInterface.print(data.getBytes());
    }
}
