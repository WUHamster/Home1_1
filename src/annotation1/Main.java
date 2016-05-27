package annotation1;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/**
 * Created by WUHamster on 26.05.2016.
 * Создать аннотацию, которая принимает параметры для метода. Написать код, который вызовет метод,
 помеченный этой аннотацией, и передаст параметры аннотации в вызываемый метод.

 */
public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Class<?> cls = ForTesting.class;
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                Test annotation = method.getAnnotation(Test.class);
                System.out.println((Integer)method.invoke(null, annotation.a(), annotation.b()));
            }
        }

    }


}
