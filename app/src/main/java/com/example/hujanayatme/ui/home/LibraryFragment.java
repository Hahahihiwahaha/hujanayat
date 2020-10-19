package com.example.hujanayatme.ui.home;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.hujanayatme.R;
import com.example.hujanayatme.ui.UploadFragment.UploadFragment;

public class LibraryFragment extends Fragment {


    private LibraryViewModel libraryViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
               libraryViewModel =
                ViewModelProviders.of(this).get(LibraryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_library, container, false);
        final TextView textView = root.findViewById(R.id.text_library);
        libraryViewModel.getText().observe(this, new Observer<String>() {


            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }


        });


        return inflater.inflate(R.layout.fragment_library, container, false);

    }

        public void onClickBtnNavigate(){
            UploadFragment uploadFragment = new UploadFragment();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction
        }

}