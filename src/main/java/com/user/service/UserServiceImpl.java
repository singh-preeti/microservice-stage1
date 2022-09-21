package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;
@Service
public class UserServiceImpl implements UserService {
 
	//list of user
	List<User> list = List.of(
			new User (101L, "Vishal","98978765"),
			new User (102L, "Akash","89898909"),
			new User (103L,"Sumit", "5676777")
			);

	@Override
	public User getUser(Long id) {
		return list.stream()
				.filter(user ->
				user.getUserId()
				.equals(id))
				.findAny()
				.orElse(null);
	}
	
	
}
