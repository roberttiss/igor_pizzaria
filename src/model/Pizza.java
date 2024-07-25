package model;

import java.util.ArrayList;
import java.util.List;

public final class Pizza {

    private final String cheese;
    private final List<String> toppings;
    private final SizeType size;
    private final CrustType crustType;

    private Pizza(SizeType size, CrustType crustType, String cheese, List<String> toppings) {
        this.size = size;
        this.crustType = crustType;
        this.cheese = cheese;
        this.toppings = new ArrayList<>(toppings);
    }

    public SizeType getSize() {
        return size;
    }

    public CrustType getCrustType() {
        return crustType;
    }

    public String getCheese() {
        return cheese;
    }

    public List<String> getToppings() {
        return new ArrayList<>(toppings);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "cheese='" + cheese + '\'' +
                ", toppings=" + toppings +
                ", size=" + size +
                ", crustType=" + crustType +
                '}';
    }

    public static class Builder{
        private String cheese;
        private List<String> toppings;
        private SizeType size;
        private CrustType crustType;

        public Builder cheese(String cheese){
            this.cheese = cheese;
            return this;
        }

        public Builder(){
            this.cheese = "not defined";
            this.toppings = new ArrayList<>();
            this.size = SizeType.DEFAULT;
            this.crustType = CrustType.THIN;

        }

        public Builder addTopping(String toppings){
            this.toppings.add(toppings);
            return this;
        }

        public Builder size(SizeType size){
            this.size = size;
            return this;
        }

        public Builder crust(CrustType crustType){
            this.crustType = crustType;
            return this;
        }

        public Pizza build(){
            return new Pizza(size,crustType,cheese,toppings);
        }

    }

}
