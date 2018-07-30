package ru.job4j.chess.firuges.white;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

/**
 *
 * @author Petr Arsentev (parsentev@yandex.ru)
 * @version $Id$
 * @since 0.1
 */
public class KnightWhite implements Figure {
    private String color = "white";
    private Cell position;
    @Override
    public void setPosition(Cell position) {
        this.position = position;
    }
    public KnightWhite(final Cell position) {
        this.position = position;
    }
    @Override
    public String getColor(){
        return color;
    }
    @Override
    public Cell getPosition() {
        return this.position;
    }

    @Override
    public Cell[] way(Cell source, Cell dest, Figure[] figures) {
        return new Cell[] { dest };
    }

    @Override
    public Figure copy(Cell dest) {
        return new KnightWhite(dest);
    }
}