package com.MusicPlayer.music_backend.Mapper;

import com.MusicPlayer.music_backend.dto.UserDto;
import com.MusicPlayer.music_backend.entity.User;

public class UserMapper {

	public static UserDto mapToUserDto(User user){
		return new UserDto(
				user.getId(),
				user.
			
				);
	}