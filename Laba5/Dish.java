package Laba5;

public class Dish {// создаем класс Dish с уровнем доступа public
    protected String material; // создаем переменную «material» типа String с уровнем доступа protected
    protected String color; // создаем переменную «color» типа String с уровнем доступа protected

    public String getMaterial() { //Геттер для переменной «material
        return material;
    }
    public void setMaterial(String material) { //Cеттер для переменной «material»
        this.material =  material;
    }
    public String getColor() {
        return color;
    }
    public void setColor( String color) {
        this.color =  color;
    }
    public Dish(  String material,  String color){
        this.material = material;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Посуда{" +
                "Материал='" + material + '\'' +
                ", Цвет='" + color + '\'' +
                '}';
    }
}
