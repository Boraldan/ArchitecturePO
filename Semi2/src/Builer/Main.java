package Builer;

public class Main {
    public static void main(String[] args) {

        Cat cat = CatBuilder.getCatBuilder().setName("Esfi").setBreed("Sfinx").setOwner("Alex").setWeight(3).build();
        System.out.println(cat);
        cat.setAge(9);
        System.out.println(cat);
    }
}
