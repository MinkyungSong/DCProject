package com.smk.dreamstagram.fragmnet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.smk.dreamstagram.R;

public class JoinByEmailFragment extends Fragment {

    EditText etEmail;
    Button btnNext_frag_joinByEmail;

    public JoinByEmailFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_join_by_email, container, false);

        etEmail = view.findViewById(R.id.etEmail);
        btnNext_frag_joinByEmail = view.findViewById(R.id.btnNext_frag_joinByEmail);

        btnNext_frag_joinByEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "다음 버튼 클릭됨!", Toast.LENGTH_SHORT).show();
                //fragment는 activity가 아니므로 context자리에 액티비티이름.this 대신 getContext()를 사용.
            }
        });

        return view;
    }
}