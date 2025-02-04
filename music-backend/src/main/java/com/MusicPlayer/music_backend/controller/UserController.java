package com.MusicPlayer.music_backend.controller;

import java.awt.color.ICC_ColorSpace;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MusicPlayer.music_backend.dto.UserDto;
import com.MusicPlayer.music_backend.service.UserService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {

	private UserService userService;
	
	
	//Build Add User REST API
	@PostMapping
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
		UserDto savedUser=userService.createUser(userDto);
		return new ResponseEntity<>(savedUser, HttpStatus.CREATED);	}
	
	//Build Get User Rest API
	@GetMapping("id")
	public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long userid)
	{
		UserDto userDto=userService.getUserById(userid);
		return ResponseEntity.ok(userDto);
	}
	
	//Build Update User REST API
	@PutMapping("{id}")
	public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long userId, @RequestBody UserDto updatedUser)
	{
		UserDto userDto=userService.updateUser(userId, updatedUser);
		return ResponseEntity.ok(userDto);
	}
}
