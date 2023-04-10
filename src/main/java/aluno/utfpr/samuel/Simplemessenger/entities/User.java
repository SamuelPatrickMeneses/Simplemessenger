package aluno.utfpr.samuel.Simplemessenger.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    
    private String nick;
    @Email
    private String email;
    
    private String password;

    public Long getUserId(){
        return userId;
    }
    public String getNick(){
        return nick;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public void setUserId(Long userId){
        this.userId = userId;
    }
    public void setNick(String nick) {
        this.nick = nick;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
