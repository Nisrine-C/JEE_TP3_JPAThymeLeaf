package ma.enset.jee_tp2.service;


import ma.enset.jee_tp2.entities.Role;
import ma.enset.jee_tp2.entities.User;
import org.springframework.stereotype.Service;


public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String username, String roleName);


}
