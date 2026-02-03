package com.Ercilla;

import java.time.LocalDate;

public class Terror extends Libro implements Prestable {

    private int nivelMiedo;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucon;

    public Terror (String autor, String titulo, int nivelMiedo){
        super(autor, titulo, Genero.Terror);
        this.nivelMiedo = nivelMiedo;
    }

    @Override
    public String getDescripcion() {
        return "Nivel de miedo: " + nivelMiedo;
    }

    @Override
    public void prestar (LocalDate fechaPrestamo){
        if (this.fechaPrestamo != null){
            System.out.println("El libro ya está prestado.");
            return;
        }
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucon = fechaPrestamo.plusDays(15);
        System.out.println("Prestado el " + fechaPrestamo + " y devolver antes del " + fechaDevolucon);
    }

    @Override
    public void devolver(LocalDate fechaDevolucon {
        if(this.fechaPrestamo == null){
            System.out.println("El libro no está prestado.");
            return;
        }
        System.out.println("Devuelto el " + fechaDevolucon);
        this.fechaPrestamo = null;
        this.fechaDevolucon = null;
    }
}
