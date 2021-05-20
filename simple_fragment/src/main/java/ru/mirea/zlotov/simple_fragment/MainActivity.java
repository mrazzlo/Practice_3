package ru.mirea.zlotov.simple_fragment;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {
    Fragment fragment1, fragment2;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment1 = new ru.mirea.zlotov.simple_fragment.Fragment1();
        fragment2 = new ru.mirea.zlotov.simple_fragment.Fragment2();
    }

    public void onClick(View view) {
        fragmentManager = getSupportFragmentManager();
        switch (view.getId()) {
            case R.id.button_fragment_two:
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer,
                        fragment1).commit();
                break;
            case R.id.button_fragment_one:
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer,
                        fragment2).commit();
                break;
            default:
                break;
        }
    }
}