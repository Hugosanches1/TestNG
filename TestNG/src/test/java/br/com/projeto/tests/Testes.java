package br.com.projeto.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testes {
	
	@BeforeClass
	public void antesClasse() {
		System.out.println("Executando antes da classe");
	}
	@BeforeMethod
	public void antesMetodo() {
		System.out.println("Executado antes de cada metodo");
	}
	
	@Test
	public void teste1() {
		System.out.println("Metodo de teste 1");
	}
	
	@Test
	public void teste2() {
		System.out.println("Metodo de teste 2");
	}
	//para desabilitar a execução do teste
	@Test(enabled = false)
	public void teste3() {
		System.out.println("Metodo de teste 3");
	}
	
	@Test
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

}
