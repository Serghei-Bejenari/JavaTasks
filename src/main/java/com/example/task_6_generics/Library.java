package com.example.task_6_generics;

import com.example.task_6_generics.audio.Audio;
import com.example.task_6_generics.exceptions.ElementNotFoundException;
import com.example.task_6_generics.exceptions.ElementNotRemovedException;
import com.example.task_6_generics.printed.Printed;
import com.example.task_6_generics.video.Video;

import java.util.ArrayList;

public class Library<T extends Audio, E extends Printed, S extends Video> {

    ArrayList<T> audioLibrary = new ArrayList<>();
    ArrayList<E> printedLibrary = new ArrayList<>();
    ArrayList<S> videoLibrary = new ArrayList<>();

    public void addToAudioLibrary(T element) {
        if (audioLibrary.contains(element)) {
            System.out.println("The Audio Library already contains such element");
        } else {
            audioLibrary.add(element);
        }
    }

    public void addToPrintedLibrary(E element) {
        if (printedLibrary.contains(element)) {
            System.out.println("The Printed Library already contains such element");
        } else {
            printedLibrary.add(element);
        }
    }

    public void addToVideoLibrary(S element) {
        if (videoLibrary.contains(element)) {
            System.out.println("The Video Library already contains such element");
        } else {
            videoLibrary.add(element);
        }
    }

    public void removeFromAudioLibrary(T element) throws ElementNotRemovedException {
        if (!audioLibrary.remove(element)) {
            throw new ElementNotRemovedException();
        }
    }

    public void removeFromPrintedLibrary(E element) throws ElementNotRemovedException {
        if (!printedLibrary.remove(element)) {
            throw new ElementNotRemovedException();
        }
    }

    public void removeFromVideoLibrary(S element) throws ElementNotRemovedException {
        if (!videoLibrary.remove(element)) {
            throw new ElementNotRemovedException();
        }
    }

    public void removeAllAudioLibrary() {
        audioLibrary.clear();
    }

    public void removeAllFromPrintedLibrary() {
        printedLibrary.clear();
    }

    public void removeAllFromVideoLibrary() {
        videoLibrary.clear();
    }

    public T getByIdFromAudioLibrary(int id) throws ElementNotFoundException {
        for (T element : audioLibrary) {
            if (element.getId() == id) {
                return element;
            }
        }
        throw new ElementNotFoundException();
    }

    public E getByIdFromPrintedLibrary(int id) throws ElementNotFoundException {
        for (E element : printedLibrary) {
            if (element.getId() == id) {
                return element;
            }
        }
        throw new ElementNotFoundException();
    }

    public S getByIdFromVideoLibrary(int id) throws ElementNotFoundException {
        for (S element : videoLibrary) {
            if (element.getId() == id) {
                return element;
            }
        }
        throw new ElementNotFoundException();
    }

    public void infoAboutAudioLibrary() {
        System.out.println("audioLibrary " + audioLibrary.size() + " elements");
        for (int i = 0; i < audioLibrary.size(); i++) {
            System.out.println("Details of element " + i + ": " + audioLibrary.get(i).toString());
        }
    }

    public void infoAboutPrintedLibrary() {
        System.out.println("printedLibrary " + printedLibrary.size() + " elements");
        for (int i = 0; i < printedLibrary.size(); i++) {
            System.out.println("Details of element " + i + ": " + printedLibrary.get(i).toString());
        }
    }

    public void infoAboutVideoLibrary() {
        System.out.println("videoLibrary " + videoLibrary.size() + " elements");
        for (int i = 0; i < videoLibrary.size(); i++) {
            System.out.println("Details of element " + i + ": " + videoLibrary.get(i).toString());
        }
    }

    public void info() {
        System.out.println("AudioLibrary contains " + audioLibrary.size() + " elements");
        System.out.println("PrintedLibrary contains " + printedLibrary.size() + " elements");
        System.out.println("VideoLibrary contains " + videoLibrary.size() + " elements");
    }
}