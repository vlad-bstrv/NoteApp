package com.vladbstrv.noteapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.vladbstrv.noteapp.R;
import com.vladbstrv.noteapp.data.Data;
import com.vladbstrv.noteapp.data.DataImpl;
import com.vladbstrv.noteapp.models.Note;

import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<Note> notes;

    public NoteAdapter(Context context, List<Note> notes) {
        this.inflater = LayoutInflater.from(context);
        this.notes = notes;
    }

    @Override
    public NoteAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_note, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NoteAdapter.ViewHolder holder, int position) {
        Note note = notes.get(position);
        holder.itemNoteTitle.setText(note.getTitle());
        holder.itemNoteText.setText(note.getText());
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView itemNoteTitle;
        final TextView itemNoteText;
        ViewHolder(View view){
            super(view);
            itemNoteTitle = view.findViewById(R.id.item_note_title);
            itemNoteText = view.findViewById(R.id.item_note_text);

        }
    }

}
