package com.hnsamal.mygate.ui.main.tab;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hnsamal.mygate.R;

public class HouseHoldFragment extends Fragment {

    private HouseHoldViewModel mViewModel;

    public static HouseHoldFragment newInstance() {
        return new HouseHoldFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.house_hold_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(HouseHoldViewModel.class);
        // TODO: Use the ViewModel
    }

}
