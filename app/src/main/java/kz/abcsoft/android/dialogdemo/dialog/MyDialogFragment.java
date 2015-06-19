package kz.abcsoft.android.dialogdemo.dialog;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;

import kz.abcsoft.android.dialogdemo.R;

public class MyDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity()) ;
        builder.setTitle("Маңызды хабарлама") ;
        builder.setMessage("Покормить кота!") ;
        builder.setIcon(R.mipmap.ic_launcher) ;
        builder.setPositiveButton("OK, Асханаға кеттім", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        }) ;

        return builder.create() ;
    }
}
