/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoIntegrador.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import projetoIntegrador.dao.ClienteDAO;
import projetoIntegrador.model.Cliente;

/**
 *
 * @author geovane.saraujo
 */
public class ClienteController {

    private final ClienteDAO clienteDAO = new ClienteDAO();

    private final String[] tradutorSexo = new String[]{"Feminino", "Masculino", "Indefinido"};
    private final String[] tradutorEstadoCivil = new String[]{"Solteiro", "Casado", "Divorciado"};

    public int traduzirSexo(String sexoSelecionado) {
        return java.util.Arrays.asList(tradutorSexo).indexOf(sexoSelecionado);
    }

    public int traduzirEstadoCivil(String estadoCivilSelecionado) {
        return java.util.Arrays.asList(tradutorEstadoCivil).indexOf(estadoCivilSelecionado);
    }
    

    public boolean salvarCliente(String cpf, String nome, int sexo,
            Date dataNascimento, int estadoCivil, String endereco,
            String bairro, String cep, String numero, String cidade,
            String nacionalidade, String email, String telefone,
            String telefone2, Date dataCadastro, Date ultimaAtualizacao) {

        Cliente cliente = new Cliente(cpf, nome, tradutorSexo[sexo], dataNascimento,
                tradutorEstadoCivil[estadoCivil], endereco, bairro, cep, numero,
                cidade, nacionalidade, email, telefone, telefone2, dataCadastro,
                ultimaAtualizacao);

        return clienteDAO.salvarCliente(cliente);
    }
    
    public ArrayList<String[]> consultarClientes() {
        ArrayList<String[]> listarClientesString = new ArrayList<>();

        for (Cliente cliente : clienteDAO.consultarClientes()) {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            listarClientesString.add(new String[]{
                String.valueOf(cliente.getId()),
                cliente.getNome(),
                cliente.getCpf(),
                String.valueOf(traduzirSexo(cliente.getSexo())),
                formato.format(cliente.getDataNascimento()),
                String.valueOf(traduzirEstadoCivil(cliente.getEstadoCivil())),
                cliente.getEndereco(),
                cliente.getBairro(),
                cliente.getCep(),
                cliente.getNumero(),
                cliente.getCidade(),
                cliente.getNacionalidade(),
                cliente.getEmail(),
                cliente.getTelefone(),
                cliente.getTelefone2(),
                formato.format(cliente.getDataCadastro()),
                formato.format(cliente.getUltimaAtualizacao())});
        }
        return listarClientesString;
    }

    public ArrayList<String[]> buscarClientes(String buscar, String modo) {
        ArrayList<String[]> buscarClientesString = new ArrayList<>();
        for (Cliente ListarCliente : clienteDAO.consultarClientes()) {

            if (ListarCliente.getCpf().equals(buscar) && modo.equals("BuscarCPF") || ListarCliente.getNome().toLowerCase().equals(buscar.toLowerCase()) && modo.equals("BuscarNome")||buscar.equals("")) {
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                buscarClientesString.add(new String[]{
                    String.valueOf(ListarCliente.getId()),
                    ListarCliente.getNome(),
                    ListarCliente.getCpf(),
                    String.valueOf(traduzirSexo(ListarCliente.getSexo())),
                    formato.format(ListarCliente.getDataNascimento()),
                    String.valueOf(traduzirEstadoCivil(ListarCliente.getEstadoCivil())),
                    ListarCliente.getEndereco(),
                    ListarCliente.getBairro(),
                    ListarCliente.getCep(),
                    ListarCliente.getNumero(),
                    ListarCliente.getCidade(),
                    ListarCliente.getNacionalidade(),
                    ListarCliente.getEmail(),
                    ListarCliente.getTelefone(),
                    ListarCliente.getTelefone2(),
                    formato.format(ListarCliente.getDataCadastro()),
                    formato.format(ListarCliente.getUltimaAtualizacao())});
            }
        }
        return buscarClientesString;
    }

    public boolean atualizarCliente(int id,String cpf, String nome, int sexo, Date dataNascimento,
            int estadoCivil, String endereco, String bairro, String cep,
            String numero, String cidade, String nacionalidade, String email,
            String telefone, String telefone2, Date ultimaAtualizacao) {

        Cliente clienteAtualizar = new Cliente(id, cpf, nome, tradutorSexo[sexo],
                dataNascimento, tradutorEstadoCivil[estadoCivil], endereco, bairro,
                cep, numero, cidade, nacionalidade, email, telefone, telefone2,
                ultimaAtualizacao);

        return clienteDAO.atualizarCliente(clienteAtualizar);
    }

    public boolean excluirCliente(int id) {
        return clienteDAO.excluirCliente(id);
    }

}
