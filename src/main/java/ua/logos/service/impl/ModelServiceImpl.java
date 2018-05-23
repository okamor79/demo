package ua.logos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.logos.entity.Model;
import ua.logos.repository.ModelRepository;
import ua.logos.service.ModelService;

import java.util.List;

@Service
public class ModelServiceImpl implements ModelService {

    @Autowired private ModelRepository modelRepository;

    @Override
    public void saveMake(Model model) {
        modelRepository.save(model);
    }

    @Override
    public Model findByID(int id) {
        return modelRepository.getOne(id);
    }

    @Override
    public List<Model> findAll() {
        return modelRepository.findAll();
    }
}
