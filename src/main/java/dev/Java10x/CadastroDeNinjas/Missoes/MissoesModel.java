package dev.Java10x.CadastroDeNinjas.Missoes;


import dev.Java10x.CadastroDeNinjas.Ninjas.Controller.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nome;
    private String dificuldade;
    private NinjaModel ninja;

    //@OneToMany Uma missao pode ter muitos ninjas
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;

    public MissoesModel(){

    }

    public MissoesModel(String nome, String dificuldade){
        this.nome = nome;
        this.dificuldade = dificuldade;
    }

    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}

    public String getDificuldade(){return dificuldade;}
    public void setDificuldade(String dificuldade){this.dificuldade = dificuldade;}
}
