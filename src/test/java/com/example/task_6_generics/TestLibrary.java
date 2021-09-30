package com.example.task_6_generics;

import com.example.task_6_generics.audio.Songs;
import com.example.task_6_generics.exceptions.ElementNotFoundException;
import com.example.task_6_generics.exceptions.ElementNotRemovedException;
import com.example.task_6_generics.printed.Books;
import com.example.task_6_generics.video.Movies;
import org.junit.jupiter.api.Test;

public class TestLibrary {

    Library<Songs, Books, Movies> library = new Library<>();

    @Test
    void testAddToLibrary() {

        library.info();
        System.out.println("+Add to each library 3 elements");

        library.addToAudioLibrary(new Songs(1));
        library.addToAudioLibrary(new Songs(5));
        library.addToAudioLibrary(new Songs(7));
        library.addToPrintedLibrary(new Books(11));
        library.addToPrintedLibrary(new Books(12));
        library.addToPrintedLibrary(new Books(13));
        library.addToVideoLibrary(new Movies(27));
        library.addToVideoLibrary(new Movies(28));
        library.addToVideoLibrary(new Movies(29));

        library.infoAboutAudioLibrary();
        library.infoAboutPrintedLibrary();
        library.infoAboutVideoLibrary();

    }

    @Test
    void testRemoveFromAudioLibrary() throws ElementNotRemovedException {
        Songs songs = new Songs(1);
        library.addToAudioLibrary(songs);
        library.addToAudioLibrary(new Songs(5));
        library.addToAudioLibrary(new Songs(7));

        library.removeFromAudioLibrary(songs);
    }

    @Test
    void testRemoveAll() {

        library.addToAudioLibrary(new Songs(1));
        library.addToAudioLibrary(new Songs(5));
        library.addToAudioLibrary(new Songs(7));

        library.infoAboutAudioLibrary();

        library.removeAllAudioLibrary();
        System.out.println("Delete All from list");
        library.infoAboutAudioLibrary();

    }

    @Test
    void testGetByIdFromLibrary() throws ElementNotFoundException {

        library.addToVideoLibrary(new Movies(27));
        library.addToVideoLibrary(new Movies(28));
        library.addToVideoLibrary(new Movies(29));

        library.getByIdFromVideoLibrary(27);
        System.out.println(library.getByIdFromVideoLibrary(27));

    }
}