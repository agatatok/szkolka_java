package pl.accenture.dp.domain;

public class Lambda {
    public static void main(String[] args) {

        MyInterface impl1 = new KlasycznaImplementacja();
        MyInterface impl2 = new MyInterface() {
            @Override
            public String go(String name) {
                return null;
            }
        };

        MyInterface impl3 = name -> name;
    }
}

@FunctionalInterface
interface MyInterface {
    String go(String name);
}

class KlasycznaImplementacja implements MyInterface {
    @Override
    public String go(String name) {
        return name.toLowerCase();
    }

}