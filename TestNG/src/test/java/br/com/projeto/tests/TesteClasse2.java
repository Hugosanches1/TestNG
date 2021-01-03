package br.com.projeto.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups="testeFuncional")
public class TesteClasse2 {
	
	@BeforeClass
	public void antesClasse() {
		System.out.println("Executando antes da classe");
	}
	
	@Test(groups = "unitarios")
	public void teste1Classe2() {
		System.out.println("Metodo de teste 1 calsse 2");
	}
	
	@Test(groups = "unitarios")
	public void teste2Classe2() {
		System.out.println("Metodo de teste 2 calsse 2");
	}
	@Test(groups = "integração")
	public void teste3Classe2() {
		System.out.println("Metodo de teste 3 calsse 2");
	}
	
	@Test(groups = "integração")
	public void teste4Classe2() {
		System.out.println("Metodo de teste 4 calsse 2");
	}
	
	@AfterClass
	public void depoisClasse() {
		System.out.println("Executando depois da classe");
	}
}
