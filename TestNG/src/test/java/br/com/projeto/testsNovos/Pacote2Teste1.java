package br.com.projeto.testsNovos;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test(groups="testeQualquer")
public class Pacote2Teste1 {
	@BeforeClass
	public void antesClasse() {
		System.out.println("Executando antes da classe");
	}
	
	@Test(groups = "unitarios")
	public void pacote2Teste1() {
		System.out.println("Primeiro teste da classe 1 do pacote 2");
	}
	
	@Test(groups = "unitarios")
	public void pacote2Teste2() {
		System.out.println("segundo teste da classe 1 do pacote 2");
	}
	@Test(groups = "unitarios")
	public void pacote2Teste3() {
		System.out.println("terceiro teste da classe 1 do pacote 2");
	}
	@Test(groups = "unitarios")
	public void pacote2Teste4() {
		System.out.println("quarto teste da classe 1 do pacote 2");
	}
	@AfterClass
	public void depoisClasse() {
		System.out.println("Executando depois da classe");
	}
}
