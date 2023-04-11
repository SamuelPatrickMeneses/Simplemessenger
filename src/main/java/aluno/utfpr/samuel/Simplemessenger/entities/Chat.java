package aluno.utfpr.samuel.Simplemessenger.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chat implements ComparableEntity{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "char_id")
    private Long id;    

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long chatId) {
        this.id = chatId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
