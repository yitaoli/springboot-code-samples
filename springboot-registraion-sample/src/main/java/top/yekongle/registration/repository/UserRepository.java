package top.yekongle.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import top.yekongle.registration.entity.User;

/** 
* @Description: 用户操作接口
* @Author: Yekongle 
* @Date: 2020年5月5日
*/
public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
