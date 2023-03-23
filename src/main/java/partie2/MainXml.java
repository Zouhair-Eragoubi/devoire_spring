package partie2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");
        UniteCentral uniteCentral = context.getBean(UniteCentral.class);
        System.out.println(uniteCentral.getUsb().read());
        uniteCentral.getVga().printData("VGA Video Projecteur");
    }
}
