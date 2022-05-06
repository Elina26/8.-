import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class ReflectionDemo {
    /*Дан список объектов произвольных типов. Найдите количество элементов списка, которые
являются объектами типа Human или его подтипами.*/
    int method_1(List<Object> list) {
        int res=0;

        for (Object o : list) {
            if (o instanceof Human) {
                res++;
            }
        }

        return res;
    }


    /*Для объекта получить список имен его открытых методов.*/
    List<String> method_2(Object object) {
        List<String> res = new ArrayList<>();

        Class<?> cls = object.getClass();
        Method[] methods = cls.getMethods();

        for (Method method : methods) {
            res.add(method.getName());
        }

        return res;
    }


    /*Для объекта получить список (в виде списка строк) имен всех его суперклассов до класса
Object включительно.*/
    List<String> method_3(Object object) {
        List<String> res = new ArrayList<>();

        Class<?> cls1;

        cls1 = object.getClass();
        while (cls1.getSuperclass()!=null) {
            //if (cls1.getSuperclass().getName().equals("java.lang.Object")) {
                //res.add("Object");
            //}
            //else {
                res.add(cls1.getSuperclass().getName());
            //}
            cls1 = cls1.getSuperclass();
        }

        return res;
    }
}
