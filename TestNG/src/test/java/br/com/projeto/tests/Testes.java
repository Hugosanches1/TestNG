package br.com.projeto.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups="testeNaoFuncional")
public class Testes {
	
	@BeforeTest
	public void antesTodosTestes() {
		System.out.println("Executa uma vez antes de todos os testes");
	}
	
	@BeforeClass
	public void antesClasse() {
		System.out.println("Executando antes da classe");
	}
	@BeforeMethod
	public void antesMetodo() {
		System.out.println("Executado antes de cada metodo");
	}
	
	@Test(groups = "unitarios")
	public void teste1() {
		System.out.println("Metodo de teste 1");
	}
	
	@Test(groups = "funcional")
	public void teste2() {
		System.out.println("Metodo de teste 2");
	}
	//para desabilitar a execução do teste
	@Test(enabled = false)
	public void teste3() {
		System.out.println("Metodo de teste 3");
	}
	
	@Test(groups = "primarios")
	public void teste4() {
		System.out.println("Metodo de teste 4");
	}
	
	@AfterMethod
	public void depoisMetodo() {
		System.out.println("Executado depois de cada metodo");
	}
	
	@AfterClass
	public void depoisClasse() {
		System.out.println("Executando depois da classe");
	}
	
	@AfterTest
	public void depoisTodosTestes() {
		System.out.println("Executa uma vez depois de todos os testes");
	}

}
