package ua.logos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.logos.entity.Make;
import ua.logos.repository.MakeRepository;
import ua.logos.service.MakeService;

import java.util.List;

@Service
public class MakeServiceImpl implements MakeService {

    @Autowired private MakeRepository makeRepository;

    @Override
    public void saveMake(Make make) {
        makeRepository.save(make);
    }

    @Override
    public Make findByID(int id) {
        return makeRepository.getOne(id);
    }

    @Override
    public List<Make> findAll() {
        return makeRepository.findAll();
    }

    @Override
    public Make findByName(String name) {
        return makeRepository.findMakeByName(name);
    }
}
