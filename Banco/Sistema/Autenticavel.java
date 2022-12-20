package Sistema;

public abstract interface Autenticavel {
    // Metodos abstratos
    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}

// Contrato Autenticavel 
    // Quem assinar esse contrato, precisa implementar:
        // -> Metodo setSenha
        // -> Metodo autentica
