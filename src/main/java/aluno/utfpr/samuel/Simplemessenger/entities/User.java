package aluno.utfpr.samuel.Simplemessenger.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class User implements ComparableEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    
    private String nick;
    @Email
    private String email;
    
    private String password;

    public Long getId(){
        return id;
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
    public void setId(Long userId){
        this.id = userId;
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
