package com.example.translator

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatDialogFragment

class SaveDataDialog: AppCompatDialogFragment() {
    lateinit var appDataBase: AppDataBase
    lateinit var data:Data
    private lateinit var etWord:EditText
    private lateinit var etTr:EditText
    private lateinit var etDs:EditText
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        var builder = AlertDialog.Builder(activity)
        var layoutInflater = requireActivity().layoutInflater
        var view = layoutInflater.inflate(R.layout.layout_dialog, null)
        appDataBase = AppDataBase.getInstance(requireContext())
        etWord = view.findViewById(R.id.et_word)
        etTr = view.findViewById(R.id.et_tr)
        etDs = view.findViewById(R.id.et_ds)

        builder.setView(view)
            .setTitle("Save data")
            .setPositiveButton("save", DialogInterface.OnClickListener { _, _ ->
                if (etWord.text.isNotEmpty() && etTr.text.isNotEmpty() && etDs.text.isNotEmpty()  ){
                    data = Data(null,
                        etWord.text.toString(),
                        etTr.text.toString(),
                        etDs.text.toString()
                        )
                    appDataBase.dataDao().insertData(data)

                }

            })
        return builder.create()
    }

}