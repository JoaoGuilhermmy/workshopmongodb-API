package com.joaoguilhermmy.workshopmongo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaoguilhermmy.workshopmongo.domain.User;
import com.joaoguilhermmy.workshopmongo.dto.UserDTO;
import com.joaoguilhermmy.workshopmongo.repository.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<User> list = userRepository.findAll();
        List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }
}
