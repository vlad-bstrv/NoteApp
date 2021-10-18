package com.vladbstrv.noteapp.data;

import com.vladbstrv.noteapp.models.Note;

import java.util.ArrayList;
import java.util.List;

public class DataImpl implements Data {

    private static DataImpl instance;
    private List<Note> noteData = new ArrayList<>();


    private DataImpl() {

    }

    public static DataImpl getInstance() {
        if(instance == null) {
            instance = new DataImpl();

        }
        return instance;
    }

    @Override
    public List<Note> get() {
        return noteData;
    }

    @Override
    public void add(Note note) {
        noteData.add(note);
    }

    @Override
    public void delete(Note note) {
        noteData.remove(note);
    }

    @Override
    public int size() {
        return noteData.size();
    }

    public void setInitialData() {
        noteData.add(new Note("Заголовок1", "Текст1"));
        noteData.add(new Note("Заголовок2", "Текст2"));
        noteData.add(new Note("Заголовок3", "Текст3"));
        noteData.add(new Note("Заголовок4", "Текст4"));
        noteData.add(new Note("Заголовок5", "Текст5"));
    }
}
