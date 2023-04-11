package aluno.utfpr.samuel.Simplemessenger.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Message implements ComparableEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private Long id;

    private String messageText;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User messageUser;

    @ManyToOne
    @JoinColumn(name = "chat_id")
    private Chat messageChat;

    @Temporal(TemporalType.TIMESTAMP)
    private Date messageTime;

    public Long getId() {
        return id;
    }

    public void setId(Long messageId) {
        this.id = messageId;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Date getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(Date messageTime) {
        this.messageTime = messageTime;
    }

    public boolean equals(ComparableEntity comparable){
        try{
            Message anoderMessage = (Message) comparable;
            return  anoderMessage != null &&
            this.getId() == anoderMessage.getId();
        }catch(ClassCastException  ex){
            return false;
        }
        
    }
    
}
