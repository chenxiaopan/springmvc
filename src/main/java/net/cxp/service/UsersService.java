package net.cxp.service;

import net.cxp.pojo.Users;

public interface UsersService {

	 Users getUsersById(int usersId);
	 

	int updateUsers(Users record);

}
