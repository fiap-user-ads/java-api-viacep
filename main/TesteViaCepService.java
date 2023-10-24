package br.com.fiap.main;

import br.com.fiap.model.Endereco;
import br.com.fiap.services.ViaCepService;

import javax.swing.*;
import java.io.IOException;

public class TesteViaCepService {
    public static void main(String[] args) throws IOException {
        ViaCepService viaCep = new ViaCepService();

        String cep = JOptionPane.showInputDialog("Digite o CEP a ser pesquisado");

        Endereco endereco = viaCep.getEndereco(cep);

        System.out.println(endereco);
    }
}
