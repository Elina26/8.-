import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ReflectionDemoTest {

    @Test
    public void method_1() {
        List<Object> arrayList = new ArrayList<>();

        Human human1 = new Student("Бобров", "Клим",
                "Федосеевич", 19, "Матфак");
        Human human2 = new Human("Данилов", "Модест", "Константинович", 31);
        Human human3 = new Student("Михайлов", "Герасим",
                "Григорьевич", 20, "Филфак");
        Human human4 = new Human("Бобров", "Игорь", "Данилович", 60);
        Integer int1=5;
        Double double1 = 2.9;


        arrayList.add(human1);
        arrayList.add(human2);
        arrayList.add(human3);
        arrayList.add(human4);
        arrayList.add(int1);
        arrayList.add(double1);

        ReflectionDemo reflectionDemo = new ReflectionDemo();
        int a = reflectionDemo.method_1(arrayList);
        assertEquals(a,4);
    }

    @Test
    public void method_2() {
        ReflectionDemo reflectionDemo = new ReflectionDemo();
        Human human2 = new Human("Данилов", "Модест", "Константинович", 31);
        List<String> res = reflectionDemo.method_2(human2);
        for (String re : res) {
            System.out.println(re);
        }
        //System.out.println(res.size());
        //assertEquals(res.size(), 11, 6);
    }

    @Test
    public void method_3_test_Human(){
        ReflectionDemo reflectionDemo = new ReflectionDemo();
        Human human1 = new Human("Бобров", "Клим",
                "Федосеевич", 19);
        List<String> res = reflectionDemo.method_3(human1);
        System.out.println(res);
        assertEquals(res.get(0), "java.lang.Object");
    }

    @Test
    public void method_3_test_Student(){
        ReflectionDemo reflectionDemo = new ReflectionDemo();
        Human human1 = new Student("Бобров", "Клим",
                "Федосеевич", 19, "Матфак");
        List<String> res = reflectionDemo.method_3(human1);
        System.out.println(res);
        assertEquals(res.get(0), "Human");
        assertEquals(res.get(1), "java.lang.Object");
    }

    @Test
    public void method_3_test_WorkingStudent(){
        ReflectionDemo reflectionDemo = new ReflectionDemo();
        Human human1 = new WorkingStudent("Бобров", "Клим",
                "Федосеевич", 19, "Матфак", "Малый матфак");
        List<String> res = reflectionDemo.method_3(human1);
        System.out.println(res);
        assertEquals(res.get(0), "Student");
        assertEquals(res.get(1), "Human");
        assertEquals(res.get(2), "java.lang.Object");

    }
}