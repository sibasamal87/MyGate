package com.hnsamal.mygate;

import android.net.Uri;
import android.os.Bundle;

import com.hnsamal.mygate.ui.main.login.LoginFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class MainActivity extends AppCompatActivity implements LoginFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}