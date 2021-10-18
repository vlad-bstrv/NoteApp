package com.vladbstrv.noteapp.presenter;

import com.vladbstrv.noteapp.ui.MainFragment;

public class PresenterImpl implements Presenter {
    private final Data data;
    private final MainFragment mainFragment;

    public PresenterImpl(Data data, MainFragment mainFragment) {
        this.data = data;
        this.mainFragment = mainFragment;
    }


}
