package br.unitau.inf.cursos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursosApplication.class, args);
	}

	// se ñ conectar, editar arquivo application.properties, desfazer edição, salvar
	// e tentar de novo

	// mostrar total de filmes:
	// method GET:
	// localhost:8080/locadora/filme/count

	// mostrar total de filmes por categoria:
	// method GET:
	// localhost:8080/locadora/categoria/count-filmes/categorias

	// mostrar total de clientes:
	// method GET:
	// localhost:8080/locadora/cliente/count

	// mostrar total de clientes por endereço:
	// method GET:
	// localhost:8080/locadora/endereco/count-clientes/endereco

	// mostrar total de locações ativas:
	// method GET:
	// localhost:8080/locadora/locacao/count

	// mostrar total de locações ativas para cada cliente:
	// method GET:
	// localhost:8080/locadora/cliente/count-locacoes/clientes
}