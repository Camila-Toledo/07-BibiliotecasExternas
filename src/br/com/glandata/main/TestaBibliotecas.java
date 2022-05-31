package br.com.glandata.main;

import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.glandata.model.Pessoa;

public class TestaBibliotecas {

	public static void main(String[] args) {
		Formatter formatter = new CPFFormatter();

		// detalhado
		Pessoa pessoa = new Pessoa("Camila", "12345678900");
		String cpfNaoFormatado = pessoa.getCpf();
		String cpfFormatado = formatter.format(cpfNaoFormatado);
		pessoa.setCpf(cpfFormatado);
		System.out.println(pessoa);

		// otimizado
		Pessoa pessoa2 = new Pessoa("Camila", formatter.format("12345678900"));
		System.out.println(pessoa2);
	}

}
