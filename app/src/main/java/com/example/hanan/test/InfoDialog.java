package com.example.hanan.test;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Hanan on 06/09/16.
 */
public class InfoDialog extends DialogFragment implements View.OnClickListener{

    Button saveData ;
    Button back ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.info_dialog, null);
        saveData = (Button) view.findViewById(R.id.save_button);
        back = (Button) view.findViewById(R.id.back_button);
        saveData.setOnClickListener(this);
        back.setOnClickListener(this);
        setCancelable(false);
        return view ;
    }


    @Override
    public  void onClick(View view){
        if(view.getId()==R.id.save_button) {
            Toast.makeText(getActivity(), "save button was clicked", Toast.LENGTH_LONG).show();
            dismiss();
        }
        if (view.getId()==R.id.back_button){
            dismiss();
        }
    }
}
