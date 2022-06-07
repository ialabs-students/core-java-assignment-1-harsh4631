package Assignment1;

import java.util.ArrayList;

public class ProductService {
public static String findNameByCode(int a){
    for(int i=0;i<ProductRepository.arr.length;i++){
        if(ProductRepository.arr[i].getProductCode()==a){
            return ProductRepository.arr[i].getName();
        }
    }
    return "null";
}
public static Product findMaxPriceProduct(String a){
    double max=Double.MIN_VALUE;
    int b=-1;
    for(int i=0;i<ProductRepository.arr.length;i++){
        if(ProductRepository.arr[i].getCategory().equals(a)&&ProductRepository.arr[i].getPrice()>max){
            max=ProductRepository.arr[i].getPrice();
            b=i;
        }
    }
    if(b==-1){
        return null;
    }
    else {
        return ProductRepository.arr[b];
    }
}
public static Product[] getProductByCategory(String a){
    ArrayList<Product> list=new ArrayList<Product>();
    for(int i=0;i<ProductRepository.arr.length;i++){
        if(ProductRepository.arr[i].getCategory().equals(a)){
            list.add(ProductRepository.arr[i]);
        }
    }
    if(list.isEmpty()){
        return null;
    }
    else{
        Product[] arr=list.toArray(new Product[list.size()]);
        return arr;
    }
  }
}
