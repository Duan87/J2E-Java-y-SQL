package com.mycompany.je2;

import java.util.Random;

/**
 *
 * @author Duan
 */
public class Persona {

    private String nombre;
    private int edad;
    private String nss;
    private char sexo;
    private float peso;
    private float altura;
    private final static char DEFAULT_SEX = 'H';
    private final static int SOBREPESO = 1;
    private final static int FALTAPESO = -1;
    private final static int PESONORMAL = 0;

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.nss = generaNSS();
        if (comprobarSexo(sexo)) {
            this.sexo = sexo;
        } else {
            this.sexo= DEFAULT_SEX;
        }
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        float imc = (float) (this.peso / Math.pow(this.altura, 2));
        System.out.println(imc);
        if (this.sexo == 'H' || sexo == 'h') {
            if (imc >= 25) {
                return SOBREPESO;
            } else if (imc < 20) {
                return FALTAPESO;
            } else {
                return PESONORMAL;
            }
        } else {
            if (imc >= 24) {
                return SOBREPESO;
            } else if (imc < 19) {
                return FALTAPESO;
            } else {
                return PESONORMAL;
            }
        }
        }
        
    

    public boolean esMayorDeEdad() {
        return (this.edad >= 18) ? true : false;
    }

    private boolean comprobarSexo(char sexo) {
        if (sexo == 'M' || sexo == 'm' || sexo == 'H' || sexo == 'h') {
            return true;
        } else {
            sexo=DEFAULT_SEX;
            return false;
        }
    }

    private String generaNSS() {
        StringBuilder sbuilder = new StringBuilder();
        Random r = new Random();

        String alphabet = "1234567890ABCDEFGHIJKMNOPQRSTUVWXYZ";
        for (int i = 0; i < 8; i++) {
            sbuilder.append(alphabet.charAt(r.nextInt(alphabet.length())));
        }
        return sbuilder.toString();

    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", nss=" + nss + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}
