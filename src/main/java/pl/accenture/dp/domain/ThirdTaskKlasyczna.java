package pl.accenture.dp.domain;

public class ThirdTaskKlasyczna implements MyInterfaceForThirdTask {
    @Override
    public String go(String name) {
        return "To jest klasyczna implementacja interfejsu za pomocą klasy - zadanie 3 "+name;
    }
}
