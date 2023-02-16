package com.example.translator

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatDialogFragment

class DeleteDataDialog(): AppCompatDialogFragment() {
    lateinit var appDataBase: AppDataBase
    lateinit var data:Data
    lateinit var intent: Intent
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        var builder = AlertDialog.Builder(activity)
        var layoutInflater = requireActivity().layoutInflater
        var view = layoutInflater.inflate(R.layout.delete_dialog, null)
        appDataBase = AppDataBase.getInstance(requireContext())
        builder.setView(view)
            .setTitle("Delete data")
            .setPositiveButton("delete", DialogInterface.OnClickListener { _, _ ->
                data.id?.let { appDataBase.dataDao().removeData(it) }
                activity?.finish()
            })
        return builder.create()
    }

    fun getData(d:Data){
        data = d
    }
}