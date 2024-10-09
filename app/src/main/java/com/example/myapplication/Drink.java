package com.example.myapplication;
public class Drink {

        // Private fields
        private String name;
        private double price;  // Fixed the typo "peice" to "price"
        private String type;

        // Constructor
        public Drink(String name, double price, String type) {
            this.name = name;
            this.price = price;
            this.type = type;
        }

        // Getter and Setter for 'name'
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Getter and Setter for 'price'
        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        // Getter and Setter for 'type'
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }



