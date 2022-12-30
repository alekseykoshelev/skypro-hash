import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        var key1 = new MyKey("blah", 15);

        Map<MyKey, Integer> map = new HashMap<>();
        map.put(key1, 10000);

        System.out.println(map.get(key1));
        System.out.println(map.get(new MyKey("blah", 15)));

        System.out.println(key1.equals(new MyKey("blah", 15)));

    }

    private static class MyKey {

        private final String name;
        private final int age;

        private MyKey(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        /* Прежде, чем расскоментировать меня, запусти код в таком виде и посмотри результат.
           После того, как расскоментировал, запусти код еще раз и сравни резульат.

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyKey myKey = (MyKey) o;
            return age == myKey.age && Objects.equals(name, myKey.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

         */

        @Override
        public String toString() {
            return "MyKey{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}