package partie1;

import partie1.dao.IDao;
import partie1.metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MainDynamique {
    public static void main(String[] args) {
        //Par instanciation dynamique
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassName = scanner.next();
            String metierClassName = scanner.next();

            System.out.println(daoClassName);
            System.out.println(metierClassName);

            Class dao = Class.forName(daoClassName);
            Class metier = Class.forName(metierClassName);

            IDao dao1 = (IDao) dao.newInstance();
            IMetier metier1 = (IMetier)metier.newInstance();

            Method method = metier.getMethod("setDao",IDao.class);
            method.invoke(metier1,dao1);
            System.out.println(metier1.calcul());

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
