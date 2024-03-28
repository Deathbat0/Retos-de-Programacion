import unittest

def suma(a, b):
    return a + b

class TestSuma(unittest.TestCase):

    def test_suma_positivos(self):
        self.assertEqual(suma(3, 5), 8)

    def test_suma_negativos(self):
        self.assertEqual(suma(-3, -5), -8)

    def test_suma_positivo_negativo(self):
        self.assertEqual(suma(3, -5), -2)

    def test_suma_negativo_positivo(self):
        self.assertEqual(suma(-3, 5), 2)

if __name__ == '__main__':
    unittest.main()