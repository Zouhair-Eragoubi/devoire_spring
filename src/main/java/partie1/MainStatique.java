package partie1;

import partie1.dao.DaoImp;
import partie1.dao.IDao;
import partie1.metier.IMetier;
import partie1.metier.MetierImp;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MainStatique {
    public static void main(String[] args) {
        //Par instanciation statique
        IDao dao = new DaoImp();
        MetierImp metier = new MetierImp();
        metier.setDao(dao);
        System.out.println(metier.calcul());


    }
}
