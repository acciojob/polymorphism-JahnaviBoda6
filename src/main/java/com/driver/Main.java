package com.driver;

public class Main {
    public static class Product{
        public int product(int x, int y){
            return x*y;
        }
        public int product(int x, int y, int z){
            return x*y*z;
        }
        public double product(double x, double y){
            return x*y;
        }
    }



    public static void main(String[] args){
        Product p = new Product();
        int product1=p.product(10,20);
        int product2=p.product(10,20,30);
        double product3 =p.product(10.2,20.8);
        System.out.println(product1+" "+product2+" "+product3);
    }

}