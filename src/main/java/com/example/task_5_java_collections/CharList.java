package com.example.task_5_java_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CharList extends ArrayList<Character> {
    public CharList() {
    }

    public CharList(String s) {
        for (char c : s.toCharArray()) {
            add(c);
        }
    }

    private CharList(ArrayList<Character> list) {
        addAll(list);
    }

    @Override
    public String toString() {
        String s = "";
        for (char c : this) {
            s += c;
        }
        return s;
    }

    public int length() {
        return size();
    }

    public char charAt(int index) {
        return get(index);
    }

    public int indexOf(char c) {
        return super.indexOf(c);
    }

    public CharList subString(int start, int end) {
        return new CharList(new ArrayList<>(subList(start, end)));
    }

    public CharList removeDuplicates() {
        return new CharList(
                new ArrayList<>(
                        new HashSet<>(this)
                )
        );
    }

    public CharList replaceFirst(Character c) {
        remove(c);
        return this;
    }

    public CharList removeAll(Character c) {
        boolean go = true;
        while (go) {
            go = remove(c);
        }
        return this;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean contains(Character c) {
        return super.contains(c);
    }

    public CharList clearList() {
        clear();
        return this;
    }

    public CharList sortList() {
        Collections.sort(this);
        return this;
    }

    public CharList reverseList() {
        Collections.reverse(this);
        return this;
    }

    public CharList mixedList() {
        Collections.shuffle(this);
        return this;
    }

    public boolean isPalindrome() {
        ArrayList<Character> reversed = new ArrayList<>(this);
        Collections.reverse(reversed);
        return this.equals(reversed);
    }
}