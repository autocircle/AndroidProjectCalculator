package org.autocircle.autocircle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessage extends AppCompatActivity implements View.OnClickListener{
    EditText userInput;
    TextView result;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnMul, btnDiv, btnSub, btnAdd,
    btnDot, btnResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        initVars();
    }

    private void initVars() {
        btn0 = findViewById(R.id.bZero);
        btn1 = findViewById(R.id.bOne);
        btn2 = findViewById(R.id.bTwo);
        btn3 = findViewById(R.id.bThree);
        btn4 = findViewById(R.id.bFour);
        btn5 = findViewById(R.id.bFive);
        btn6 = findViewById(R.id.bSix);
        btn7 = findViewById(R.id.bSeven);
        btn8 = findViewById(R.id.bEight);
        btn9 = findViewById(R.id.bNine);
        btnDot = findViewById(R.id.bDot);
        btnMul = findViewById(R.id.bMultiply);
        btnDiv = findViewById(R.id.bDivision);
        btnSub = findViewById(R.id.bSubstruction);
        btnAdd = findViewById(R.id.bAddition);
        btnResult = findViewById(R.id.bResult);
        result = findViewById(R.id.tvDisplayResult);
        userInput = findViewById(R.id.etUserInput);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnResult.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bZero:
                userInput.append(btn0.getText().toString());
                break;
            case R.id.bOne:
                userInput.append(btn1.getText().toString());
                break;
            case R.id.bTwo:
                userInput.append(btn2.getText().toString());
                break;
            case R.id.bThree:
                userInput.append(btn3.getText().toString());
                break;
            case R.id.bFour:
                userInput.append(btn4.getText().toString());
                break;
            case R.id.bFive:
                userInput.append(btn5.getText().toString());
                break;
            case R.id.bSix:
                userInput.append(btn6.getText().toString());
                break;
            case R.id.bSeven:
                userInput.append(btn7.getText().toString());
                break;
            case R.id.bEight:
                userInput.append(btn8.getText().toString());
                break;
            case R.id.bNine:
                userInput.append(btn9.getText().toString());
                break;
            case R.id.bDot:
                userInput.append(btnDot.getText().toString());
                break;

        }
    }
}
