package com.MusicPlayer.music_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MusicPlayer.music_backend.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
