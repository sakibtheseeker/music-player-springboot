package com.MusicPlayer.music_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class UserDto {

    private long id;
	private String firstName;
	private String lastName;
	private String emailid;
	private String password;
	private Integer phoneno;
	
}
