package com.company.services;

import java.util.List;

public interface CRUDServices <T,ID> {

    public List<T> getAll();

    public T getById (ID id);

    public void add(T t);

    public void delete( ID id);

    public void update(T t,ID id);
}

