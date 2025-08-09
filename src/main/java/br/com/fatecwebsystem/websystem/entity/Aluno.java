package br.com.fatecwebsystem.websystem.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer idAluno;

    @Column(nullable = false, length = 40)
    private String nomeAluno;
    @Column(nullable = false, length = 50)
    private String enderecoAluno;
    @Column(nullable = false, length = 11)
    private String telefone;
    @Column(nullable = false, length = 11)
    private String cpfAluno;
   
    private Integer ra;


    
}
