public interface VeiculoAluguel {
    default double getValor(){
        return 1;
    }

    default String getTipo(){
        return null;
    }
}
