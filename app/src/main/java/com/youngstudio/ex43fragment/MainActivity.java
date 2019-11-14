package com.youngstudio.ex43fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    MyFragment myFragment;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv= findViewById(R.id.tv);

        //Fragment를 관리하는 관리자객체 얻어오기
        fragmentManager= getSupportFragmentManager();

        //id를 이용해서 Framgment참조하기
        myFragment= (MyFragment)fragmentManager.findFragmentById(R.id.frag);

    }

    public void clickBtn(View view) {
        myFragment.tv.setText("ddd");

    }


}
