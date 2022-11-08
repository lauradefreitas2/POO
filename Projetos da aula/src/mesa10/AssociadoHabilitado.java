package mesa10;

public class AssociadoHabilitado extends Associado {

    private Double custoPiscina;
    private Boolean habilitado;

    public AssociadoHabilitado(String numAssociado, String nome, Double valorMensal, String atividade, Double custoPiscina) {
        super(numAssociado, nome, valorMensal, atividade);
        this.custoPiscina = custoPiscina;
    }

    @Override
    public Double custoMensal(){
        return getValorMensal() + custoPiscina;
    }
}
