/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_pokemon_g5;


public class Pokemon {
    
    // Tipos de Pokemon
    public static final int NORMAL = 0;
    public static final int FUEGO = 1;
    public static final int AGUA = 2;

    // Atributos
    private int tipo;
    public String nombreP;
    private int vida;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;

    // Constructor
    public Pokemon(int tipo, String nombreP, int vida, int ataque, int defensa, int ataqueEspecial, int defensaEspecial) 
    {
        this.tipo = tipo;
        this.nombreP = nombreP;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
    }

    
    //Getters t Setters
    public int getTipo() 
    {
        return tipo;
    }

    public void setTipo(int tipo) 
    {
        this.tipo = tipo;
    }

    public int getHitPoints() 
    {
        return vida;
    }

    public void setHitPoints(int vida) 
    {
        this.vida = vida;
    }

    public int getAtaque() 
    {
        return ataque;
    }

    public void setAtaque(int ataque) 
    {
        this.ataque = ataque;
    }

    public int getDefensa() 
    {
        return defensa;
    }

    public void setDefensa(int defensa) 
    {
        this.defensa = defensa;
    }

    public int getAtaqueEspecial() 
    {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial) 
    {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getDefensaEspecial() 
    {
        return defensaEspecial;
    }

    public String getNombreP() 
    {
        return nombreP;
    }

    public void setNombre(String nombreP) 
    {
        this.nombreP = nombreP;
    }

    public void setDefensaEspecial(int defensaEspecial) 
    {    
        this.defensaEspecial = defensaEspecial;
    }

    // Métodos específicos de los Pokemon, como ataques y acciones de combate.
    public void ataqueFisico(Pokemon oponente) 
    {
        int daño = this.ataque - oponente.defensa;
        if (daño > 0) {
            oponente.vida -= daño;
        } else {
            daño = 0;
        }

        
        if (oponente.vida < 0) 
        {
            oponente.vida = 0;
        }

        System.out.println(this.getNombreP() + " ha realizado un ataque físico a " + oponente.getNombreP() + " causando " + daño + " de daño.");
    }
    public void ataqueEspecial(Pokemon oponente) 
    {
        int dañoEspecial = this.ataqueEspecial - oponente.defensaEspecial;
        if (dañoEspecial > 0) {
            oponente.vida -= dañoEspecial;
        }

        if (oponente.vida < 0) 
        {
            oponente.vida = 0;
        }

        System.out.println(this.getNombreP() + " ha realizado un ataque especial a " + oponente.getNombreP() + " causando " + dañoEspecial + " de daño.");
    }

    public boolean estaFueraDeCombate() 
    {
        return vida <= 0;
    }

    // Obtener Pokemon como String
    private String getTipoAsString() 
    {
        switch (tipo) {
            case NORMAL:
                return "Normal";
            case FUEGO:
                return "Fuego";
            case AGUA:
                return "Agua";
            default:
                return "Desconocido";
        }
    }
    
}
