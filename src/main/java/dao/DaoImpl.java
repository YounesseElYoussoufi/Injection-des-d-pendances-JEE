package dao;

import org.springframework.stereotype.Component;

@Component
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        //se connecter a la base de donne pour récupèrer la temp
        double temp = Math.random()*40 ;

        return temp;
    }
}
