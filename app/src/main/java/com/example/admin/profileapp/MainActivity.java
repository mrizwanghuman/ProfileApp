package com.example.admin.profileapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView skillId;
    private Button frontEnd;
    private  Button backEnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        skillId = findViewById(R.id.skillId);
      frontEnd = findViewById(R.id.frontEnd);
      backEnd = findViewById(R.id.backEnd);

      frontEnd.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              skillId.setText(" 4+ Years of experience in application and web development with emphasis on HTML/HTML5, CSS2/3, AJAX, DOM, JavaScript, jQuery, Angular Js\n" +
                      "Extensive experience in designing the user experience interface UI/UX strategy, UI requirements, converting findings into UI designs. \n");
          }


      });

      backEnd.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              skillId.setText("Experience in working with Restful Web Services and implementing Restful API's. \n" +
                      "Experienced in usability testing including user profiles and personals, task analysis, contextual research, test moderation, and reporting.\n" +
                      "Excellent knowledge and experience in SQL, My SQL Server. \n" +
                      "Versatile team player with good analytical, communication and interpersonal skills.\n" +
                      "Manipulating SQL Database.\n");
          }
      });
    }
}
