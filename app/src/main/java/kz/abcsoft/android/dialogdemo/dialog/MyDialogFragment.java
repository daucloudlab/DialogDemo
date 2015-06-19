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

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final String[] catNamesArray = {"Васька", "Рыжик", "Мурзик"};

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Выберите Кота") ;
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setItems(catNamesArray, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(), "Выбранный кот: " + catNamesArray[i],
                        Toast.LENGTH_SHORT).show();
            }
        }) ;
        return builder.create() ;
    }
}
