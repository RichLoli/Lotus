package com.macoloco.lotus.security;

import com.macoloco.lotus.dao.UserDao;
import com.macoloco.lotus.pojo.Users;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @Resource
    UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Users users = new Users();
        users.setUsername(s);
        Users selectUser = userDao.selectByUsername(users);
        Users selectUserValider = Optional.ofNullable(selectUser)
                .orElseThrow(() -> new UsernameNotFoundException("用户不存在"));
        List<GrantedAuthority> authorityList = AuthorityUtils.commaSeparatedStringToAuthorityList("admin");
        return new User("zhangsan", selectUserValider.getPassword(), authorityList);
    }
}
