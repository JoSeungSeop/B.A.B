package com.example.administrator.bab;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calendar extends AppCompatActivity {

    Button t1028, t1029, t1030, t1031, t1101, t1102, t1103, t1104, t1105, t1106, t1107, t1108, t1109, t1110, t1111, t1112, t1113, t1114;
    Button t1115,t1116, t1117, t1118, t1119, t1120, t1121, t1122, t1123, t1124, t1125, t1126, t1127, t1128, t1129, t1130, t1201;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        t1028 = (Button)findViewById(R.id.I028); ~ t1201 = (Button)findViewById(R.id.I201);

        t1028.setOnClickListener(new View.OnClickListener(){onClick(View view) {...});

       ~     

		t1028.setOnClickListener(new View.OnClickListener(){onClick(View view) {...});
       
    }
    public void nope(){                         // 급식이 없는 날 출력하는 함수
        Toast.makeText(getApplicationContext(),"- 주말에는 급식이 없습니다 -",Toast.LENGTH_SHORT).show();
    }

    public void bab(String putDay){             // 클릭한 날짜의 급식으로 넘어가는 함수
        Intent resultIntent = new Intent();
        resultIntent.putExtra("day", putDay);                       //intent의 day인자에 putday 넘겨줌
        setResult(Activity.RESULT_OK, resultIntent);

        finish();
    }
}
