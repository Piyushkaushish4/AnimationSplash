package com.example.animationsplash;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BottomActivity extends AppCompatActivity {
    private TextView mTextMessage;
    Button STD;
    ClipData.Item sd;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        STD=findViewById(R.id.button);
        STD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(BottomActivity.this, StudentActivity.class);
                startActivity(intent);
            }
        });
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void ok(MenuItem item)
    {Intent intent = new Intent(BottomActivity.this,
            OnclickHomeActivity.class);
        startActivity(intent);
    }

    public void mmdu(View view)
     {Intent intent = new Intent(BottomActivity.this,
            MMDUinfoinImage.class);
        startActivity(intent);
    }

    public void map(View view)
        {Intent intent = new Intent(BottomActivity.this,
                MapAcitivity.class);
            startActivity(intent);
        }

    public void chrome(View view) {
        Intent intent = new Intent(BottomActivity.this,
                ChromeActivity.class);
        startActivity(intent);
    }

    public void result(MenuItem item) {
        Intent intent = new Intent(BottomActivity.this,
                ResultActivity.class);
        startActivity(intent);
    }

    public void Blogs(MenuItem item) {
        Intent intent = new Intent(BottomActivity.this,
                BlogActivity.class);
        startActivity(intent);
    }
}
