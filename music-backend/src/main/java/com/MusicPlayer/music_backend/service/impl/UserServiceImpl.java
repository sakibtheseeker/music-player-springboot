package com.MusicPlayer.music_backend.service.impl;

import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.MusicPlayer.music_backend.Mapper.UserMapper;
import com.MusicPlayer.music_backend.dto.UserDto;
import com.MusicPlayer.music_backend.entity.User;
import com.MusicPlayer.music_backend.repository.UserRepository;
import com.MusicPlayer.music_backend.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl  implements UserService{

	private UserRepository userRepository;
	
	@Override
	public UserDto createUser(UserDto userDto) {
		// TODO Auto-generated method stub
		
		User user=UserMapper.mapToUser(userDto);
		User savedUser=userRepository.save(user);
		return UserMapper.mapToUserDto(savedUser);
	}

	@Override
	public UserDto getUserById(Long userId) {
		// TODO Auto-generated method stub
		User user=userRepository.findById(userId)
				.orElseThrow(()->
				new ResourceNotFoundException("User not exist with given id:" +userId));
		return UserMapper.mapToUserDto(user);
	}

}
