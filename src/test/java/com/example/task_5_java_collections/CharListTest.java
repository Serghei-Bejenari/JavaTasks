package com.example.task_5_java_collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CharListTest {

    CharList list = new CharList("acb123123");

    @Test
    void testCharList() {
        assertEquals("acb123123", list.toString());
    }

    @Test
    void testIndexOf() {
        assertEquals(3, list.indexOf('1'));
    }

    @Test
    void testLength() {
        assertEquals(9, list.length());
    }

    @Test
    void testCharAt() {
        assertEquals('b', list.charAt(2));
    }

    @Test
    void testSubString() {
        assertEquals("12", list.subString(3, 5).toString());

    }

    @Test
    void testRemoveDuplicates() {
        assertEquals("a1b2c3", list.removeDuplicates().toString());

    }

    @Test
    void testRemoveAll() {
        String str = list.removeAll('1').removeAll('2').toString();
        assertEquals("acb33", str);

    }

    @Test
    void testReplaceFirst() {
        assertEquals("acb23123", list.replaceFirst('1').toString());
    }

    @Test
    void testNotContains() {
        assertEquals(false, list.contains('q'));
    }

    @Test
    void testContains() {
        assertEquals(true, list.contains('a'));
    }

    @Test
    void testIsEmpty() {
        assertEquals(false, list.isEmpty());
    }

    @Test
    void testSort() {
        assertEquals("112233abc", list.sortList().toString());
    }

    @Test
    void testReverseList() {
        assertEquals("321321bca", list.reverseList().toString());
    }

    @Test
    void testMixedList() {
        assertNotEquals("acb123123", list.mixedList().toString());
    }

    @Test
    void testIsPalindrome() {
        assertEquals(false, list.isPalindrome());
    }

}