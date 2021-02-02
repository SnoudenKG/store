package personal;

import Services.AdminService;
import Services.Reportservice;
import Services.SeniorService;

public class Admin extends Person implements SeniorService, Reportservice, AdminService {
    @Override
    public void closeOperDay() {

    }

    @Override
    public void cancelSellOperation() {

    }

    @Override
    public void order() {

    }

    @Override
    public void createAccount() {

    }

    @Override
    public void deleteAccount() {

    }

    @Override
    public void getReport() {

    }
}
