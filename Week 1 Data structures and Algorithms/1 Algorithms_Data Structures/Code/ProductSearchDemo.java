import java.util.*;

public class ProductSearchDemo 
{
    public static Product linearSearch(Product[] products, int targetId) 
    {
        for (Product p : products)
        {
            if (p.productId == targetId) 
            return p;
        }
        return null;
    }
    
    public static Product binarySearch(Product[] products, int targetId) 
    {
        int left = 0, right = products.length - 1;
        while (left <= right) 
        {
            int mid = (left + right) / 2;
            if (products[mid].productId == targetId) 
            return products[mid];
            else if (products[mid].productId < targetId) 
            left = mid + 1;
            else 
            right = mid - 1;
        }
        return null;
    }

    public static void sortProducts(Product[] products) 
    {
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
    }

    public static void main(String[] args) 
    {
        Product[] products = 
        {
            new Product(101, "Laptop", "Electronics"),
            new Product(205, "Shirt", "Fashion"),
            new Product(302, "Book", "Education"),
            new Product(150, "Mobile", "Electronics")
        };

        System.out.println("Linear Search:");
        Product result1 = linearSearch(products, 205);
        System.out.println(result1 != null ? result1 : "Product not found");

  
        System.out.println("Binary Search:");
        sortProducts(products);
        Product result2 = binarySearch(products, 205);
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}

class Product 
{
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) 
    {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() 
    {
        return "[" + productId + ", " + productName + ", " + category + "]";
    }
}