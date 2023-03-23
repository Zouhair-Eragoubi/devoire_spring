package partie2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UniteCentral {

    @Autowired
    @Qualifier("videoProjecteur")
    private VGAInterface vga;
    @Autowired
    @Qualifier("clavier")
    private USBInterface usb;

    public VGAInterface getVga() {
        return vga;
    }

    public void setVga(VGAInterface vga) {
        this.vga = vga;
    }

    public USBInterface getUsb() {
        return usb;
    }

    public void setUsb(USBInterface usb) {
        this.usb = usb;
    }
}
