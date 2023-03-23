package partie1.dao;


import javafx.fxml.FXML;
import org.springframework.stereotype.Component;

@Component
public class DaoImp implements IDao {
    @Override
    public double getData() {
        double data = 100.0;
        return data;
    }
}
