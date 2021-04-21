package MyAnnotation;

import java.lang.reflect.Field;

public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz) throws Exception {
        String strFruitProvider = "供应商信息:";
        Field[] fields = Class.forName("Apple.class").getDeclaredFields();
        for(Field f : fields){
            if(f.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider = (FruitProvider) f.getAnnotation(FruitProvider.class);
                strFruitProvider = " 供应商编号:" + fruitProvider.id() + " 供应商名称:"
                        + fruitProvider.name();
                System.out.println(strFruitProvider);
            }
        }
    }
}
