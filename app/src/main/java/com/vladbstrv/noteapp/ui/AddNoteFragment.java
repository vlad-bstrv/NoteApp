package com.vladbstrv.noteapp.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.vladbstrv.noteapp.R;
import com.vladbstrv.noteapp.data.Data;
import com.vladbstrv.noteapp.data.DataImpl;
import com.vladbstrv.noteapp.models.Note;


public class AddNoteFragment extends Fragment {


    public static AddNoteFragment newInstance() {
        AddNoteFragment fragment = new AddNoteFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_note, container, false);
        EditText itTitle = view.findViewById(R.id.it_title);
        EditText itText = view.findViewById(R.id.it_text);

        ExtendedFloatingActionButton buttonAdd = view.findViewById(R.id.btn_add_note);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DataImpl.getInstance().add(new Note(itTitle.getText().toString(), itText.getText().toString()));

                requireActivity().getSupportFragmentManager().popBackStack();

            }
        });

        return view;
    }
}