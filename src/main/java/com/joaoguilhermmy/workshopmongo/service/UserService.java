package com.joaoguilhermmy.workshopmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.joaoguilhermmy.workshopmongo.domain.User;
import com.joaoguilhermmy.workshopmongo.dto.UserDTO;
import com.joaoguilhermmy.workshopmongo.expection.DatabaseException;
import com.joaoguilhermmy.workshopmongo.expection.ResourcesNotFoundException;
import com.joaoguilhermmy.workshopmongo.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        Optional<User> user = repository.findById(id);
        return user.orElseThrow(() -> new ResourcesNotFoundException(id));
    }

    public User insert(User obj) {
        return repository.save(obj);
    }

    public void delete(String id) {

        if (!repository.existsById(id)) {
            throw new ResourcesNotFoundException(id);
        }
        try {
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(User user) {
        try {
            User entity = findById(user.getId());
            updateData(entity, user);
            return repository.save(entity);
        } catch (RuntimeException e) {
            throw new ResourcesNotFoundException(user.getId());
        }
    }

    private void updateData(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
