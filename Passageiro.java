public class Passageiro {
    
        public String nome;
        public int idade;
        public String cpf;
        public String email;

        public Passageiro(String nome, int idade, String cpf, String email) {
            this.nome = nome;
            this.idade = idade;
            this.cpf = cpf;
            this.email = email;
        }

        // Getters e setters
        public String getNome() {
            return nome;
        }
    
        public int getIdade() {
            return idade;
        }
    
        public String getCpf() {
            return cpf;
        }
    
        public String getEmail() {
            return email;
        }
    
        @Override
        public String toString() {
            return nome;
        }
    }

