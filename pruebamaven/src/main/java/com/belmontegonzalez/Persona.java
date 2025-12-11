package com.belmontegonzalez;

/**
 * La clase persona
 */
public class Persona {
    // Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;

    // Constructor
    /**
     * Constructor con parametros
     * 
     * @param nombre    - parametro nombre
     * @param apellidos - parametro apellidos
     * @param edad      - parametro edad
     * @param email     - parametro email
     */
    public Persona(String nombre, String apellidos, int edad, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
    }

    public static Persona factory(String cadena) {
        if (cadena == null) {
            throw new IllegalArgumentException("Argumentos invalidos");
        }
        String[] chunks = cadena.split(",");
        if (chunks.length != 4) {
            throw new IllegalArgumentException("Argumentos invalidos");
        }

        try {
            int edad = Integer.parseInt(chunks[2]);
            return new Persona(chunks[0], chunks[1], edad, chunks[3]);
        } catch (Exception e) {
            throw new IllegalArgumentException("Argumentos invalidos");
        }

    }

    // Getters y setters

    /**
     * Getter de nombre
     * 
     * @return el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
