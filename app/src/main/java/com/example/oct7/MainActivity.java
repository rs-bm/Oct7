package com.example.oct7;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {

    private TaskViewModel taskViewModel;
    FragmentManager fg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            taskViewModel = new ViewModelProvider(this).get(TaskViewModel.class);
            fg = getSupportFragmentManager();
            FragmentTransaction trans = fg.beginTransaction();
            InputFragment inf = new InputFragment();
            trans.add(R.id.inputFragment, inf, "inputFrag");

            ListFragment lsf = new ListFragment();
            trans.add(R.id.listFragment, lsf, "listFrag");
            trans.commit();
        }
    }
}