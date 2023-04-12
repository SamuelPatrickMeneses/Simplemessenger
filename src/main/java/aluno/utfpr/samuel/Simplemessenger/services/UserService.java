package aluno.utfpr.samuel.Simplemessenger.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import aluno.utfpr.samuel.Simplemessenger.entities.User;
import aluno.utfpr.samuel.Simplemessenger.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public User loadByNick(String nick)throws UsernameNotFoundException{
        User user = repository.findByNick(nick);
        if(user == null)
            throw new UsernameNotFoundException("this user name don't exists!");
        return user;
    }

    public UserRepository getRepository() {
        return repository;
    }

    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }

    
}
