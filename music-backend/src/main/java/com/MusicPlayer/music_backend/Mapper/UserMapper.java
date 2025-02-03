package com.MusicPlayer.music_backend.Mapper;

import com.MusicPlayer.music_backend.dto.UserDto;
import com.MusicPlayer.music_backend.entity.User;

public class UserMapper {

	public static UserDto mapToUserDto(User user){
		return new UserDto(
				user.getId(),
				user.getFirstName(),
				user.getLastName(),
				user.getEmailId(),
				user.getPassword(),
				user.getPhoneNo()
				
				);
	}
	
	public static User mapToUser(UserDto userDto) {
		return new User(
				userDto.getId(),
				userDto.getFirstName(),
				userDto.getLastName(),
				userDto.getEmailid(),
				userDto.getPassword(),
				userDto.getPhoneno()
				
				);
				
	}
}