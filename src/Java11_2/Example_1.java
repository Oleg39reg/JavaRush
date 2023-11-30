package Java11_2;

public class Example_1 {
    class Cat {
        public static final int UNKNOWN = -1; //Создаём константу
        public String name;
        public int age;
        public Cat(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Cat(){
            this.name = "Безымянный";
            this.age = UNKNOWN;
        }
        Cat cat = new Cat("Васька", 2);

    }

}
