package aluno.utfpr.samuel.Simplemessenger.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Member {

    @Id
    @Column(name = "user_id")
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    @Id
    @Column(name = "chat_id")
    @ManyToOne
    @JoinColumn(name = "chat_id")
    private Chat chat;
    
    private Boolean active;

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    

    
}
