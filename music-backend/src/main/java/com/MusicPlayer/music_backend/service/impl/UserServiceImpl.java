package com.MusicPlayer.music_backend.service.impl;

import org.springframework.stereotype.Service;
import com.MusicPlayer.music_backend.Mapper.UserMapper;
import com.MusicPlayer.music_backend.dto.UserDto;
import com.MusicPlayer.music_backend.entity.User;
import com.MusicPlayer.music_backend.repository.UserRepository;
import com.MusicPlayer.music_backend.service.UserService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepository.save(user);
        return UserMapper.mapToUserDto(savedUser);
    }
}
