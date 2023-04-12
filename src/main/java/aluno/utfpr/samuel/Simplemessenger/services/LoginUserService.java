package aluno.utfpr.samuel.Simplemessenger.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import aluno.utfpr.samuel.Simplemessenger.entities.LoginUser;


@Service
public class LoginUserService extends UserService implements UserDetailsService{

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LoginUser loginUser = new LoginUser();
        loginUser.setUser(this.loadByNick(username));
        return loginUser; 
    }
    
}
