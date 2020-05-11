package data;

import java.util.Arrays;

public class NamesHolder {
    private String[] names;
    private int fillCounter;
    private int matchIndex;

    public NamesHolder(String[] names) {
        this.names = names;
    }

    public void add(String name){
        if (name == null) throw new NullPointerException("No name to add");
        if (contains(name)) throw new DuplicateException(name + " :Such name already exist");
        if (size() >= names.length) throw new ArrayIndexOutOfBoundsException("Table out of space");
        names[fillCounter] = name;
        fillCounter++;
    }

    public boolean contains(String name) {
        matchIndex=-1;
        if (name == null) throw new IllegalArgumentException("No name to compare with");
        if (fillCounter != 0) {
            for (String s : names) {
                matchIndex++;
                if (s != null && s.equals(name)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int size() {
        return fillCounter;
    }

    public void remove(String name) {
        int j=0;
        if (name == null) throw new NullPointerException("No name to add");
        String[] newNames = new String[names.length];
        if(contains(name)) {
            for (int i = 0; i < names.length; i++) {
                if (i != matchIndex) {
                    newNames[j] = names[i];
                    j++;
                }
                else {
                    fillCounter--;
                }
            }
            names=newNames;
        }
    }

    @Override
    public String toString() {
        return "NamesHolder{" +
                "names=" + Arrays.toString(names) +
                ", fillCounter=" + size() +
                '}';
    }
}

