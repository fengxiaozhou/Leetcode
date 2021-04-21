package MyAnnotation;

import sun.jvm.hotspot.oops.ObjectHeap;

public class Apple {

    @FruitProvider(id = 1, name = "陕西红富士集团")
    private String appleProvider;

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }

    public String getAppleProvider() {
        return appleProvider;
    }

    public static void main(String[] args) {
        System.out.println(new Apple().getAppleProvider());
    }

}
