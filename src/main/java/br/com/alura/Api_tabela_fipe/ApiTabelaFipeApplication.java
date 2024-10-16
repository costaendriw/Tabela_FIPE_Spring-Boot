package br.com.alura.Api_tabela_fipe;

import br.com.alura.Api_tabela_fipe.Principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiTabelaFipeApplication implements CommandLineRunner {

	public static void main(String[] args) {SpringApplication.run(ApiTabelaFipeApplication.class, args);}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();

		}
	}

