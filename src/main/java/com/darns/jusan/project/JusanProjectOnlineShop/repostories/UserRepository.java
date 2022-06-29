package com.darns.jusan.project.JusanProjectOnlineShop.repostories;

import com.darns.jusan.project.JusanProjectOnlineShop.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<Users,Long> {
    Users findByEmail(String email);
    List<Users>  findAllByIdIsNot(Long id);
}
