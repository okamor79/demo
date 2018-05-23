package ua.logos.service;

import ua.logos.entity.Model;

import java.util.List;

public interface ModelService {
    void saveMake(Model model);

    Model findByID(int id);

    List<Model> findAll();
}
