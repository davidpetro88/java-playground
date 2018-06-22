package com.data.structure.linkedlist;

public class LinkedList {

    private Cell firstElemnt = null;
    private Cell lastElemnt = null;
    private int totalElement = 0;

    public void addAtBeginning(Object element) {
        if (totalElement == 0) {
            Cell newCell = new Cell(element);
            this.firstElemnt = newCell;
            this.lastElemnt = newCell;
        } else {
            Cell newCell = new Cell(element, this.firstElemnt);
            this.firstElemnt.setPrevious(newCell);
            this.firstElemnt = newCell;
        }
        this.totalElement++;
    }

    public void add(Object element) {
        if (this.totalElement == 0) {
            addAtBeginning(element);
        } else {
            Cell newCell = new Cell(element);
            this.lastElemnt.setNext(newCell);
            newCell.setPrevious(this.lastElemnt);
            this.lastElemnt = newCell;
            this.totalElement++;
        }
    }

    public void addInPosition(int position, Object element) {
        if (position == 0) {
            add(element);
        } else if (position == totalElement) {
            add(element);
        } else {
            Cell previous = getCell(position - 1);
            Cell next = previous.getNext();
            Cell newCell = new Cell(element, previous.getNext());
            newCell.setPrevious(previous);
            previous.setNext(newCell);
            next.setPrevious(newCell);
            this.totalElement++;
        }
    }

    private Cell getCell(int position) {
        if (!hasPositiion(position)) throw new IllegalArgumentException("Invalid Position");
        Cell actual = firstElemnt;
        for (int i = 0; i < position; i++) {
            actual = actual.getNext();
        }
        return actual;
    }

    public Object get(int position) {
        return getCell(position).getElement();
    }

    private boolean hasPositiion(int position) {
        return position >= 0 && position < this.totalElement;
    }

    public void removeAtBeginning() {
        if (this.totalElement == 0) {
            throw new IllegalArgumentException("Empty List");
        }
        this.firstElemnt = this.firstElemnt.getNext();
        this.totalElement--;
        if (totalElement == 0) this.lastElemnt = null;
    }

    public void remove(int position) {
        if (position == 0) {
            removeAtBeginning();
        } else if ( position == this.totalElement -1){
            remove();
        } else {
            Cell removeCell = getCell(position);
            Cell previous = removeCell.getPrevious();
            Cell next = removeCell.getNext();
            previous.setNext(next);
            next.setPrevious(previous);
            this.totalElement--;
        }
    }

    public void remove() {
        if (this.totalElement == 1) {
            this.removeAtBeginning();
        } else {
            Cell penultimate = this.lastElemnt.getPrevious();
            penultimate.setNext(null);
            this.lastElemnt = penultimate;
            totalElement--;
        }
    }

    public int size() {
        return this.totalElement;
    }

    public boolean contain(Object element) {
        Cell actual = this.firstElemnt;
        while (actual !=null) {
            if(actual.equals(element)) return true;
            actual = actual.getNext();
        }
        return false;
    }

    @Override
    public String toString() {
        if (this.totalElement == 0) return "[]";
        Cell actual = this.firstElemnt;
        StringBuilder stringBuilder = new StringBuilder("[");
        for (int i = 0; i < this.totalElement; i++) {
            stringBuilder.append(actual.getElement());
            actual = actual.getNext();
            if (actual != null) stringBuilder.append(",");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
