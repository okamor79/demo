package ua.logos.service;

import ua.logos.entity.Make;

import java.util.List;

public interface MakeService {

    void saveMake(Make make);

    Make findByID(int id);

    List<Make> findAll();

    Make findByName(String name);
}
