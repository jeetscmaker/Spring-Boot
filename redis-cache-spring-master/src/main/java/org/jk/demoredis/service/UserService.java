package org.jk.demoredis.service;

import java.util.List;

import org.jk.demoredis.domain.User;

public interface UserService {
	public User getUser(long id);

	public List<User> getAll();

	public void delete(long id);

	public User update(User user);

	public User create(User user);
}
