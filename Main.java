public class Main {
    public static void main(String[] args) {

        Product bread = new Bread("деревенский", 35.00, 20, "шт", "10/03/2023", "пшеничная");
        Product diapers = new Diapers("Huggies",250.00, 3, "уп", 0, true, "S", 4, 5, "ночные");
        Product dummy = new Dummy("Avent",70.50, 10, "шт", 1, true);
        Product egg = new Eggs("С1", 73.80, 25, "уп", "20/03/2023", 10);
        Product lemonade = new Lemonade("Буратино",50.40, 30, "бут", "500 мл");
        Product mask = new Masks("маска медицинская",11.30, 100, "уп", 5);
        Product milk = new Milk("Три коровы", 57.80, 32, "уп", "16/03/2023");
        Product toiletPaper = new ToiletPaper("Zewa",159.90, 5, "уп", 4, 3);
        Product[] products = new Product[]{bread, diapers, dummy, egg, lemonade, mask, milk, toiletPaper};
        Program.getInfo(products);
    }
}