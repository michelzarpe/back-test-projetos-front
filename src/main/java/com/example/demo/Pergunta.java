package com.example.demo;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Pergunta implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idPergunta;
	private String descricaoPergunta;
	private List<Opcao> opcao;

}


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
class Opcao implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer idOpcao;
	private String descricao;
}