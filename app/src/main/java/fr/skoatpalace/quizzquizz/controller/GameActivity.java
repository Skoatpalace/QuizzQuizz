package fr.skoatpalace.quizzquizz.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import fr.skoatpalace.quizzquizz.R;

public class GameActivity extends AppCompatActivity {
    private TextView question;
    private Button answer1;
    private Button answer2;
    private Button answer3;
    private Button answer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        question = findViewById(R.id.activity_game_question_text);
        answer1 = findViewById(R.id.activity_game_answer1_btn);
        answer2 = findViewById(R.id.activity_game_answer2_btn);
        answer1 = findViewById(R.id.activity_game_answer3_btn);
        answer1 = findViewById(R.id.activity_game_answer4_btn);

    }
}
