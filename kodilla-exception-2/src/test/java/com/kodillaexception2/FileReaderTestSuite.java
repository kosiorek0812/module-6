package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;


import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTestSuite {

    @Test
    void testReadFile1() {
        // given
        FileReader fileReader = new FileReader();
        // when & then
        assertThrows(FileReaderException.class, () -> fileReader.readFile());
    }
    /*
    @Test
    void testReadFile2() {
        // given
        FileReader fileReader = new FileReader();
        // when & then
        assertDoesNotThrow(fileReader::readFile);
    }
    */
}