package com.apps.reo.inside_w;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

/**
 * Created by reo on 09.01.2015.
 */
public class MyAlert extends DialogFragment{
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){

        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        Dialog dialog=builder.create();

        return dialog;


    }
}