package kz.abcsoft.android.dialogdemo.dialog;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

import kz.abcsoft.android.dialogdemo.R;

public class MyDialogFragment extends DialogFragment {
    String title = "Выбор есть всегда";
    String message = "Выбери пищу";
    String button1String = "Вкусная пища";
    String button2String = "Здоровая пища";

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity()) ;
        builder.setTitle(title) ;
        builder.setMessage(message) ;
        builder.setIcon(R.mipmap.ic_launcher) ;
        builder.setPositiveButton(button1String, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Вы сделали правильный выбор",
                        Toast.LENGTH_LONG).show();
            }
        }) ;
        builder.setNegativeButton(button2String, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Возможно вы правы", Toast.LENGTH_LONG)
                        .show();
            }
        }) ;

        builder.setCancelable(true) ;
        return builder.create() ;
    }
}
