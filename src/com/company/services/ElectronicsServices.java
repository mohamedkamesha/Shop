package com.company.services;

import com.company.model.Company;
import com.company.model.Electronics;

import java.util.List;

public interface ElectronicsServices extends CRUDServices<Electronics,Integer> {
    public Electronics getByInfo(Company company);
}
