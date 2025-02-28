package Tema8.interfazVolador;

public class Ave {
    String especie;
    String color;
    boolean isVuela;

    public Ave(String especie, String color, boolean isVuela) {
        this.especie = especie;
        this.color = color;
        this.isVuela = isVuela;
    }


    @Override
    public String toString() {
        return "Ave{" +
                "especie='" + especie + '\'' +
                ", color='" + color + '\'' +
                ", isVuela=" + isVuela +
                '}';
    }
}
