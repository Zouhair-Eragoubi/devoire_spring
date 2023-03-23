package partie2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("partie2");
        UniteCentral uniteCentral = context.getBean(UniteCentral.class);
        System.out.println(uniteCentral.getUsb().read());
        uniteCentral.getVga().printData("VGA Video Projecteur");
    }
}
