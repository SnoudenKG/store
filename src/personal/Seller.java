package personal;

import Services.Reportservice;
import Services.Sellerservice;

public class Seller extends Person implements Reportservice, Sellerservice {
    @Override
    public void getReport() {

    }

    @Override
    public void sell() {

    }
}
