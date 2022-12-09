package builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String masa;
    private String salsa;
    private List<String> ingredientes;

    private Pizza(PizzaBuilder builder) {
        this.masa = builder.masa;
        this.salsa = builder.salsa;
        this.ingredientes = builder.ingredientes;
    }

    // SETTERS Y GETTERES
    
    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return ":" + "Tipo de Masa: " + masa + " " + "Salsa:" + salsa + " " + "Ingredientes Adicionales: " + ingredientes;
    }
    
    

    // CALSE CONSTRUCTORA
    
    public static class PizzaBuilder {

        private String masa;
        private String salsa;
        private List<String> ingredientes;

        public PizzaBuilder() {
            this.ingredientes = new ArrayList<>();
        }

        public PizzaBuilder masa(String masa) {
            this.masa = masa;
            return this;
        }

        public PizzaBuilder salsa(String salsa) {
            this.salsa = salsa;
            return this;
        }

        public PizzaBuilder ingredientes(String ingredientes) {
            this.ingredientes.add(ingredientes);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    // CLASE MAIN PARA CREAR LAS PIZZAS
    
    public static void main(String[] args) {

        // primera pizza
        Pizza pizza = new Pizza.PizzaBuilder()
                .masa("Blanca")
                .salsa("De tomate y ají")
                .ingredientes("peperoni")
                .ingredientes("jamon")
                .ingredientes("champiñones")
                .build();

        System.out.println("Pizza Creada => " + pizza);

        // segunda pizza
        Pizza pizza2 = new Pizza.PizzaBuilder()
                .masa("Blanca")
                .salsa("Salsa roja")
                .ingredientes("peperoni")
                .ingredientes("pimiento")
                .ingredientes("champiñones")
                .ingredientes("jamon")
                .ingredientes("cebolla")
                .build();

        System.out.println("Pizza Creada => " + pizza2);

    }
}
