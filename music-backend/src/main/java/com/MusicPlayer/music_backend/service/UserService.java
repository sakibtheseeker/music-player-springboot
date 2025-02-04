package com.MusicPlayer.music_backend.service;



import com.MusicPlayer.music_backend.dto.UserDto;

public interface UserService {
	UserDto createUser(UserDto userDto);
	
	UserDto getUserById(Long userId);	
	
	UserDto updateUser(Long userId, UserDto updatedUser);
}
