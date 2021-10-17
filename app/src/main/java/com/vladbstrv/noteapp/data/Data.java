package com.vladbstrv.noteapp.data;

import com.vladbstrv.noteapp.models.Note;

import java.util.List;

public interface Data {

    List<Note> get();
    void add(Note note);
    void delete(Note note);
    int size();

}
