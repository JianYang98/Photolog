package com.example.photolog.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findByUsername(String username); // username으로 찾아서 User로 리턴해줌


}
