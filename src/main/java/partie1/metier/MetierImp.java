package partie1.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import partie1.dao.IDao;
@Component
public class MetierImp implements IMetier {
    @Autowired
    IDao dao ;

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        return data * 0.25;
    }
}
