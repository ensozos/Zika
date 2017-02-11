package com.example.bill.virussymptoms;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> selection = new ArrayList<String>();
    TextView final_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final_text = (TextView)findViewById(R.id.final_result);
        final_text.setEnabled(false);
    }

    public int i=0;
    public void selectItem(View view)
    {

        boolean checked = ((CheckBox) view).isChecked();
            switch (view.getId())
            {
                case  R.id.Symptom_1:

                    if(checked) {
                        selection.add("Fever");
                        i++;
                    }
                    else
                        {
                            selection.remove("Fever");
                            i--;
                        }
                break;

                case  R.id.Symptom_2:

                    if(checked) {
                        selection.add("Sore throat/Cough");
                    }
                    else
                    {
                        selection.remove("Sore throa/Cough");
                    }
                    break;

                case  R.id.Symptom_3:

                    if(checked) {
                        selection.add("Rash");
                        i++;
                    }
                    else
                    {
                        selection.remove("Rash");
                        i--;
                    }
                    break;

                case  R.id.Symptom_4:

                    if(checked) {
                        selection.add("Dizziness");
                    }
                    else
                    {
                        selection.remove("Dizziness");
                    }
                    break;

                case  R.id.Symptom_5:

                    if(checked) {
                        selection.add("Muscle aches");
                        i++;
                    }
                    else
                    {
                        selection.remove("Muscle aches");
                        i--;
                    }
                    break;

                case  R.id.Symptom_6:

                    if(checked) {
                        selection.add("Conjunctivitis");
                        i++;
                    }
                    else
                    {
                        selection.remove("Conjunctivitis");
                        i--;
                    }
                    break;
            }
    }

    public void finalSelection(View view)
    {
        String final_symptom_selection = ""; //emfanish symptwmatwn
        String final_symptom_text = "";      //emfanish apotelesmatos
        for(String Selections : selection)
        {
            final_symptom_selection=final_symptom_selection+Selections+"\n";
        }
        if (i==4){
            final_symptom_text = "Your symptoms are worrying. You better visit a doctor soon.";
        }
        else{
            final_symptom_text  = "Your symptoms don't match with Mosquito Diseases. Stay aware and have a nice trip!";
        }
        final_text.setText(final_symptom_selection+final_symptom_text);
        final_text.setEnabled(true);
    }


    public void clickQuit(View v){
        finish();
    }

    @Override
    public void onBackPressed(){
        //exit application confirmation dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Do you want to quit?");
        builder.setCancelable(true);
        builder.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        });

        builder.setNegativeButton("Cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();


    }
}
