package com.example.GameReviews.services;

import com.example.GameReviews.entities.Lists;
import com.example.GameReviews.repository.ListsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListsServices {

    @Autowired
    private ListsRepository listRepository;

    public Lists addLists(Lists list) {
        return listRepository.save(list);
    }

    public List<Lists> getAllLists() {
        return listRepository.findAll();
    }

    public Optional<Lists> findListsById(Long id) {
        return listRepository.findById(id);
    }

}
