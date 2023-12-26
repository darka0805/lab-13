package third;

import lombok.SneakyThrows;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        PDLReader pdl = new PDLReader();
        pdl.parse("https://github.com/darka0805/lab-13");
    }
}
