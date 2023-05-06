package com.example.a1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView letterText;
    private TextView letterText2;
    private Button nextButton;
    private int currentLetterIndex = 0;
    private char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private String[] Words = {"Apple", "Bag", "Cat", "Dog", "Electric", "Fine", "Good", "Help", "Interface", "Jack", "Kind", "Lemon", "Melon", "Night", "Olives", "Parents", "Query", "Red", "Source", "Table", "Uniform", "Vacation", "World", "Xmas", "Yellow", "Zebra"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextButton = findViewById(R.id.next_button);
        letterText = findViewById(R.id.letter_name);
        letterText2 = findViewById(R.id.letter_name2);
        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                letterText.setText((letters[currentLetterIndex]+""));
                letterText2.setText(Words[currentLetterIndex]);
                currentLetterIndex = (currentLetterIndex + 1) % letters.length;
            }
        });
    }
}
