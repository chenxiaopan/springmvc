package net.cxp.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import net.cxp.dao.UsersMapper;
import net.cxp.pojo.Users;
import net.cxp.service.UsersService;

@Service("usersService")
public class UsersServiceImpl implements UsersService {

	@Resource
	private UsersMapper usersMapper;
	
	@Override
	public Users getUsersById(int usersId) {
		return this.usersMapper.selectByPrimaryKey(usersId);
	}

	@Override
	public int updateUsers(Users record) {
		return usersMapper.updateByPrimaryKeySelective(record);
	}

}
