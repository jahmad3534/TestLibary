package com.smooth.expandablenavigationview;

import android.content.Context;
import android.widget.Toast;

public class ToastHelper {

    public static void displayToast(Context con, String message)
    {

        Toast.makeText(con,message,Toast.LENGTH_LONG).show();
    }
}
