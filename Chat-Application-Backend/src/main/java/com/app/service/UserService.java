package com.app.service;

import java.util.List;

import com.app.dto.UserDto;
import com.app.exception.UserException;
import com.app.modal.User;
import com.app.request.UpdateUserRequest;

public interface UserService {
	
	public User findUserProfile(String jwt);
	
	public User updateUser(Integer userId, UpdateUserRequest req) throws UserException;
	
	public User findUserById(Integer userId) throws UserException;
	
	public List<User> searchUser(String query);
}
