package com.Ercilla;

import java.time.LocalDate;

public interface Prestable {
    void prestar (LocalDate fechaPrestammo);
    void devolver (LocalDate fechaDevolucion);
}
