#include <iostream>
#include <cassert>

int suma(int a, int b) {
    return a + b;
}

class TestSuma {
public:
    void test_suma_positivos() {
        assert(suma(3, 5) == 8);
    }

    void test_suma_negativos() {
        assert(suma(-3, -5) == -8);
    }

    void test_suma_positivo_negativo() {
        assert(suma(3, -5) == -2);
    }

    void test_suma_negativo_positivo() {
        assert(suma(-3, 5) == 2);
    }
};

int main() {
    TestSuma test;
    test.test_suma_positivos();
    test.test_suma_negativos();
    test.test_suma_positivo_negativo();
    test.test_suma_negativo_positivo();

    std::cout << "Todos los tests han pasado correctamente." << std::endl;

    return 0;
}
