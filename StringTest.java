package com.javacourse.strings;

import com.javacourse.arrays.Array;
import com.javacourse.cycles.Cycles;
import com.javacourse.functions.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    public void test_positiveInt_intToString () {
        String actual = StringHomework.intToString(345678);
        String expected = "345678";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_negativeInt_intToString () {
        String actual = StringHomework.intToString(-66659);
        String expected = "-66659";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_zero_intToString () {
        String actual = StringHomework.intToString(0);
        String expected = "0";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_positiveDouble_doubleToString () {
        String actual = StringHomework.doubleToString(8.64);
        String expected = "8.64";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_negativeDouble_doubleToString () {
        String actual = StringHomework.doubleToString(-25.1);
        String expected = "-25.1";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_doubleWithD_doubleToString () {
        String actual = StringHomework.doubleToString(177.1D);
        String expected = "177.1";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_positiveInt_stringToNumber () {
        int actual = StringHomework.stringToNumber("12345");
        int expected = 12345;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_negativeInt_stringToNumber () {
        int actual = StringHomework.stringToNumber("-65470906");
        int expected = -65470906;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_word_convertStringToDouble(){
        double expected = 0.0;
        double actual = StringHomework.stringToNumber("five");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_positiveDouble_stringToRealNumber () {
        double actual = StringHomework.stringToRealNumber("14.6");
        double expected = 14.6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_negativeDouble_stringToRealNumber () {
        double actual = StringHomework.stringToRealNumber("-0.675");
        double expected = -0.675;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_doubleWithD_stringToRealNumber () {
        double actual = StringHomework.stringToRealNumber("14.9D");
        double expected = 14.9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_word_stringToRealNumber(){
        double expected = 0.0;
        double actual = StringHomework.stringToRealNumber("five");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_3words_getLengthOfShortestWord  () {
        int actual = StringHomework.getLengthOfShortestWord (" my little dear");
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_punctuation_getLengthOfShortestWord  () {
        int actual = StringHomework.getLengthOfShortestWord ("let's think");
        int expected = 4;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_4DifferentCaseWords_getLengthOfShortestWord  () {
        int actual = StringHomework.getLengthOfShortestWord ("your IDEA is GOOD");
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_4Words_changeSymbols  () {
        String [] array = {"мир", "дружба", "жвачка", "ура"};
        String [] actual = StringHomework.changeSymbols (array, 6 );
        String [] expected = {"мир", "дру$$$", "жва$$$", "ура"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_addSpaceAfterPunctuation () {
        String actual = StringHomework.addSpaceAfterPunctuation("здравствуй,милая, привет!рад видеть");
        String expected = "здравствуй, милая, привет! рад видеть";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_onlyUniqueSymbols () {
        String actual = StringHomework.onlyUniqueSymbols("солнышко вышло");
        String expected = "солнышк в";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_7words_quantityOfWords  () {
        int actual = StringHomework.quantityOfWords ("let's think about it a bit later");
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_deletePart () {
        String actual = StringHomework.deletePart("растерянный малыш", 3, 6);
        String expected = "расый малыш";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_stringReverse () {
        String actual = StringHomework.stringReverse("крапива растёт");
        String expected = "тётсар авипарк";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test_deleteLastWord () {
        String actual = StringHomework.deleteLastWord("hello, dear friends");
        String expected = "hello, dear";
        Assertions.assertEquals(expected, actual);
    }
}
