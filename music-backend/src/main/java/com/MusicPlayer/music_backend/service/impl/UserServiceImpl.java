package com.MusicPlayer.music_backend.service.impl;

import org.springframework.security.web.webauthn.management.MapPublicKeyCredentialUserEntityRepository;
import org.springframework.stereotype.Service;

import com.MusicPlayer.music_backend.Mapper.UserMapper;
import com.MusicPlayer.music_backend.dto.UserDto;
import com.MusicPlayer.music_backend.entity.User;
import com.MusicPlayer.music_backend.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl  implements UserService{

	private UserRepository userRepository;
	
	@Override
	public UserDto createUserDto(UserDto userDto) {
		// TODO Auto-generated method stub
		
		User user=UserMapper.mapToUser(userDto);
		UserMapper savedUser=UserMapper.save(user);
		return UserMapper.mapToUserDto(savedUser);
	}

}
