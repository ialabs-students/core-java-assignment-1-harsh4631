package Assignment1;

public class ProductRepository {
    static  Product[] arr={
            new Product(201,"Realme c2",14000,"MobileAcc"),
            new Product(202,"Oneplus nord2",30000,"MobileAcc"),
            new Product(203,"Apple13pro",130000,"MobileAcc"),
            new Product(204,"BMW",6000000,"CarAcc"),
            new Product(205,"Hyundai",600000,"CarAcc"),
            new Product(206,"Audi",8000000,"CarAcc"),

    };

    public static void main(String[] args) {
//        System.out.println( ProductService.findNameByCode(201));
//    }
        System.out.println( ProductService.findNameByCode(201));
        System.out.println( ProductService.findNameByCode(205));
        System.out.println(ProductService.findMaxPriceProduct("MobileAcc"));
        System.out.println(ProductService.getProductByCategory("CarAcc"));
    }

}
