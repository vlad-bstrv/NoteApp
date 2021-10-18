package com.vladbstrv.noteapp.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.vladbstrv.noteapp.R;
import com.vladbstrv.noteapp.adapter.NoteAdapter;
import com.vladbstrv.noteapp.data.DataImpl;


public class MainFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new NoteAdapter(getContext(), DataImpl.getInstance().get()));

        FloatingActionButton button = view.findViewById(R.id.btn_add_main);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction =
                        requireActivity().getSupportFragmentManager().beginTransaction();
                fragmentTransaction
                        .addToBackStack("")
                        .replace(R.id.fragmentContainerView, AddNoteFragment.newInstance())
                        .commit();
            }
        });

        return view;
    }



}