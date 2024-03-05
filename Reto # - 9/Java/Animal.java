// Definición de la clase Animal
class Animal {
    protected String nombre; // Atributo protegido para el nombre del animal

    // Constructor de la clase Animal
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método para hacer sonido (será sobreescrito por las subclases)
    public void hacerSonido() {
        System.out.println("Haciendo sonido...");
    }
}

// Definición de la subclase Perro que extiende de Animal
class Perro extends Animal {
    // Constructor de la clase Perro
    public Perro(String nombre) {
        super(nombre); // Llama al constructor de la superclase para inicializar el nombre
    }

    // Implementación del método hacerSonido específico para Perro
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace: ¡Guau!");
    }
}

// Definición de la subclase Gato que extiende de Animal
class Gato extends Animal {
    // Constructor de la clase Gato
    public Gato(String nombre) {
        super(nombre); // Llama al constructor de la superclase para inicializar el nombre
    }

    // Implementación del método hacerSonido específico para Gato
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " hace: ¡Miau!");
    }
}

// Cl
