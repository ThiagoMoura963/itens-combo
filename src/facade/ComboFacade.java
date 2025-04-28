package facade;

import model.*;

public class ComboFacade {
    private Combo combo;

    public void criarCombo(int codigo) {
        switch (codigo) {
            case 1:
                combo = new Combo(
                        new Burguer("Whopper", 29.90),
                        new Bebida("Coca-Cola", 7.50),
                        new Sobremesa("Brownie", 6.00)
                );
                break;
            case 2:
                combo = new Combo(
                        new Burguer("Rodeio", 12.90),
                        new Bebida("Pepsi", 4.50),
                        new Sobremesa("Sorvete de Baunilha", 2.90)
                );
                break;
            default:
                System.out.println("Código inválido.");
                combo = null;
                break;
        }
    }

    public void getItens() {
        if (combo != null) {
            combo.getItens();
        } else {
            System.out.println("Nenhum combo selecionado.");
        }
    }

    public double getPrecoTotal() {
        if (combo != null) {
            return combo.getPrecoTotal();
        }
        return 0.0;
    }
}
