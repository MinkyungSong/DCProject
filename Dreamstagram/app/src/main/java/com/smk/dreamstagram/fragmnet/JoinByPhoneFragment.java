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

public class JoinByPhoneFragment extends Fragment {

    EditText etPhoneNum;
    Button btnNext_frag_joinByPhone;

    public JoinByPhoneFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_join_by_phone, container, false);

        etPhoneNum = view.findViewById(R.id.etPhoneNum);
        btnNext_frag_joinByPhone = view.findViewById(R.id.btnNext_frag_joinByPhone);
        
        btnNext_frag_joinByPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //번호를 안 치면 버튼 비활성화
                // 번호를 이상하게 치면 빨간 테두리가 생기면서 바로 아래에 빨간 경고 메세지 뜨도록 어떻게?

                Toast.makeText(getContext(), "다음 버튼 클릭됨!", Toast.LENGTH_SHORT).show();
                //fragment는 activity가 아니므로 context자리에 액티비티이름.this 대신 getContext()를 사용.
            }
        });

        return view;
    }
}