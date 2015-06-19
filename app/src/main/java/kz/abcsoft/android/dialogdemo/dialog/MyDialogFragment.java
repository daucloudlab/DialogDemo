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
        final boolean[] checkedItemsArray = {false, true, false};

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Выберите любимое имя кота") ;
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setMultiChoiceItems(catNamesArray, checkedItemsArray, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                checkedItemsArray[i] = b ;
            }
        }) ;
        builder.setPositiveButton("Готово", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int id) {
                StringBuilder state = new StringBuilder();
                for (int i = 0; i < catNamesArray.length; i++) {
                    state.append("" + catNamesArray[i]);
                    if (checkedItemsArray[i])
                        state.append(" выбран\n");
                    else
                        state.append(" не выбран\n");
                }
                Toast.makeText(getActivity(),
                        state.toString(), Toast.LENGTH_LONG)
                        .show();
            }

        }) ;
        return builder.create() ;
    }
}
