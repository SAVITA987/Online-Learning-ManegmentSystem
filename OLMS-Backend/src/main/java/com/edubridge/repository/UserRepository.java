package com.edubridge.repository;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.edubridge.model.User;

public interface UserRepository extends CrudRepository<User, Integer>
{
	
    public User findByEmail(String email);
	
	public List <User> findByUsername(String username);
	
	public User findByEmailAndPassword(String email, String password);
	
	public List<User> findProfileByEmail(String email);
	public User findByUserid(String userid);
	
	
}