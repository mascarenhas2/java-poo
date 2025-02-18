package Itau;

public class Funcionario {
            private String codFun;
            private String nome;
            private String endereco;
            private int telefone;
            private String email;
            private ContaBancaria contaBancaria;
           
            public Funcionario() {
            }

            public Funcionario(String codFun, String nome, String endereco, int telefone, String email,
                    ContaBancaria contaBancaria) {
                this.codFun = codFun;
                this.nome = nome;
                this.endereco = endereco;
                this.telefone = telefone;
                this.email = email;
                this.contaBancaria = contaBancaria;
            }

            public String getCodFun() {
                return codFun;
            }

            public void setCodFun(String codFun) {
                this.codFun = codFun;
            }

            public String getNome() {
                return nome;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public String getEndereco() {
                return endereco;
            }

            public void setEndereco(String endereco) {
                this.endereco = endereco;
            }

            public int getTelefone() {
                return telefone;
            }

            public void setTelefone(int telefone) {
                this.telefone = telefone;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public ContaBancaria getContaBancaria() {
                return contaBancaria;
            }

            public void setContaBancaria(ContaBancaria contaBancaria) {
                this.contaBancaria = contaBancaria;
            }

            @Override
            public String toString() {
                return "---Funcionario---\n codFun= " + codFun +
                 "\nnome= " + nome + 
                 "\nendereco=" + endereco + 
                 "\ntelefone= " + telefone +
                 "\nemail= " + email + 
                 "\n---contaBancaria---" + contaBancaria + "";
            }

            
}
