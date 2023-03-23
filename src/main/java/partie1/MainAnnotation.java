package partie1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import partie1.metier.IMetier;

public class MainAnnotation {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("partie1");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println(metier.calcul());

    }
}
