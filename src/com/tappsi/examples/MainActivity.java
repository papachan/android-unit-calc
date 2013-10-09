package com.tappsi.examples;

import java.io.InputStream;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.tappsi.calculador.MyFileParser;

public class MainActivity extends Activity implements OnClickListener {

    private EditText input;
    private TextView result;
    private Float total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText) findViewById(R.id.input);
        result = (TextView) findViewById(R.id.text_result);
        ((Button) findViewById(R.id.click_btn)).setOnClickListener(this);

        initDataContainer();
        
    }

    private void showMyResult() {
		result.setText(String.valueOf(total));
	}

	private void initDataContainer() {
        InputStream in = getResources().openRawResource(R.raw.data);
        try {
			MyFileParser parser = new MyFileParser(in);
		} catch (Exception e) {
			Log.e("Calculador", e.getMessage());
		}
    }

    @Override
    public void onClick(View v) {
        validateFields();
        calculate();
        showMyResult();
    }

    private void calculate() {
		// TODO Auto-generated method stub
		
	}

	private void validateFields() {
        final CheckBox option_nightly = (CheckBox) findViewById(R.id.checkBox_nightly);
        final CheckBox option_airport = (CheckBox) findViewById(R.id.CheckBox_airport);
        final CheckBox option_terminal = (CheckBox) findViewById(R.id.CheckBox_terminal);
        if (option_nightly.isChecked()) {
            // Log.i(TAG, "nightly is checked");
        }
        if (option_airport.isChecked()) {
            // Log.i(TAG, "airport is checked");
        }
        if (option_terminal.isChecked()) {
            // Log.i(TAG, "terminal is checked");
        }
    }





}
