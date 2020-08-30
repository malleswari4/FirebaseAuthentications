package com.example.firebaseday2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {

    TextView emailname;
    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        emailname=findViewById(R.id.tv1);
        firebaseAuth=FirebaseAuth.getInstance();
        emailname.setText("Welcome "+firebaseAuth.getCurrentUser().getEmail());
    }

    public void signout(View view) {
        firebaseAuth.signOut();
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}