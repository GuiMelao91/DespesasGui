package br.com.impacta.jsp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categorias {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long codigo;

  @NotBlank(message = "Informe uma categoria")// name nunca pode ser null
  @Column(unique = true, nullable = false) //Não deixa cadastrar categorias iguais
  private String name;
}
