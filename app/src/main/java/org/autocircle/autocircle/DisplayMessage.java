package org.autocircle.autocircle;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.autocircle.autocircle.databinding.ActivityDisplayMessageBinding;

import java.text.DecimalFormat;

public class DisplayMessage extends AppCompatActivity implements View.OnClickListener{
//    EditText userInput;
//    TextView result;
//    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnMul, btnDiv, btnSub, btnAdd,
//    btnDot, btnResult;
ActivityDisplayMessageBinding binding;
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';
    private char CURRENT_ACTION;
    private double valueOne = Double.NaN;
    private double valueTwo;
    private DecimalFormat decimalFormat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        decimalFormat = new DecimalFormat("#.##########");
        binding = DataBindingUtil.setContentView(this, R.layout.activity_display_message);

//        initVars();
        binding.bZero.setOnClickListener(this);
        binding.bOne.setOnClickListener(this);
        binding.bTwo.setOnClickListener(this);
        binding.bThree.setOnClickListener(this);
        binding.bFour.setOnClickListener(this);
        binding.bFive.setOnClickListener(this);
        binding.bSix.setOnClickListener(this);
        binding.bSeven.setOnClickListener(this);

        binding.bEight.setOnClickListener(this);
        binding.bNine.setOnClickListener(this);
        binding.bDot.setOnClickListener(this);
        binding.bMultiply.setOnClickListener(this);
        binding.bDivision.setOnClickListener(this);
        binding.bSubstruction.setOnClickListener(this);
        binding.bAddition.setOnClickListener(this);
        binding.bResult.setOnClickListener(this);


    }
    private void computeCalculation() {
        if(!Double.isNaN(valueOne)) {
            valueTwo = Double.parseDouble(binding.etUserInput.getText().toString());
            binding.etUserInput.setText(null);

            if(CURRENT_ACTION == ADDITION)
                valueOne = this.valueOne + valueTwo;
            else if(CURRENT_ACTION == SUBTRACTION)
                valueOne = this.valueOne - valueTwo;
            else if(CURRENT_ACTION == MULTIPLICATION)
                valueOne = this.valueOne * valueTwo;
            else if(CURRENT_ACTION == DIVISION)
                valueOne = this.valueOne / valueTwo;
        }
        else {
            try {
                valueOne = Double.parseDouble(binding.etUserInput.getText().toString());
            }
            catch (Exception e){}
        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bZero:
                binding.etUserInput.append(binding.bZero.getText());
                break;
            case R.id.bOne:
                binding.etUserInput.append(binding.bOne.getText());
                break;
            case R.id.bTwo:
                binding.etUserInput.append(binding.bTwo.getText());
                break;
            case R.id.bThree:
                binding.etUserInput.append(binding.bThree.getText());
                break;
            case R.id.bFour:
                binding.etUserInput.append(binding.bFour.getText());
                break;
            case R.id.bFive:
                binding.etUserInput.append(binding.bFive.getText());
                break;
            case R.id.bSix:
                binding.etUserInput.append(binding.bSix.getText());
                break;
            case R.id.bSeven:
                binding.etUserInput.append(binding.bSeven.getText());
                break;
            case R.id.bEight:
                binding.etUserInput.append(binding.bEight.getText());
                break;
            case R.id.bNine:
                binding.etUserInput.append(binding.bNine.getText());
                break;
            case R.id.bDot:
                binding.etUserInput.append(binding.bDot.getText());
                break;
            case R.id.bMultiply:
                computeCalculation();
                CURRENT_ACTION = MULTIPLICATION;
                binding.tvDisplayResult.setText(decimalFormat.format(valueOne) + "*");
                binding.etUserInput.setText(null);
                break;
            case R.id.bDivision:
                computeCalculation();
                CURRENT_ACTION = DIVISION;
                binding.tvDisplayResult.setText(decimalFormat.format(valueOne) + "/");
                binding.etUserInput.setText(null);
                break;
            case R.id.bSubstruction:
                computeCalculation();
                CURRENT_ACTION = SUBTRACTION;
                binding.tvDisplayResult.setText(decimalFormat.format(valueOne) + "-");
                binding.etUserInput.setText(null);
                break;
            case R.id.bAddition:
                computeCalculation();
                CURRENT_ACTION = ADDITION;
                binding.tvDisplayResult.setText(decimalFormat.format(valueOne) + "+");
                binding.etUserInput.setText(null);
                break;
            case R.id.bResult:
                computeCalculation();
                binding.tvDisplayResult.setText(binding.tvDisplayResult.getText().toString() +
                        decimalFormat.format(valueTwo) + " = " + decimalFormat.format(valueOne));
                valueOne = Double.NaN;
                CURRENT_ACTION = '0';
                break;
        }
    }
}
