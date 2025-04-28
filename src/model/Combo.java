package model;

public class Combo {
    private final Burguer burger;
    private final Bebida bebida;
    private final Sobremesa sobremesa;

    public Combo(Burguer burguer, Bebida bebida, Sobremesa sobremesa) {
        this.burger = burguer;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }

    public void getItens() {
        System.out.println("Burguer: " + burger.getNome());
        System.out.println("Bebida: " + bebida.getNome());
        System.out.println("Sobremesa: " + sobremesa.getNome());
    }

    public double getPrecoTotal() {
        return burger.getPreco() + bebida.getPreco() + sobremesa.getPreco();
    }
}
