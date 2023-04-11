package aluno.utfpr.samuel.Simplemessenger.entities;

public interface ComparableEntity {
    
    public Long getId();
    public void setId(Long id);
    public default  boolean equals(ComparableEntity comparable){
        String comparableClassName = comparable.getClass().getName();

        return  comparable != null && 
                this.getId() == comparable.getId() &&
                this.getClass().getName().equals(comparableClassName);
    }
}
