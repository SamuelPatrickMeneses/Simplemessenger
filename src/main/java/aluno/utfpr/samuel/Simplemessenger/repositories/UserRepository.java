package aluno.utfpr.samuel.Simplemessenger.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aluno.utfpr.samuel.Simplemessenger.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    public User  findByNick(String nick);
}
