package com.example.qmui_demo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.qmuiteam.qmui.widget.dialog.QMUIDialog;
import com.qmuiteam.qmui.widget.dialog.QMUIDialogAction;

//import android.app.AlertDialog;
//
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button_showQMUIDialog);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new QMUIDialog.MessageDialogBuilder(MainActivity.this)
                        .setTitle("QMUI")
                        .setMessage("This is QMUI")
                        .addAction("Cancel", new QMUIDialogAction.ActionListener() {
                            @Override
                            public void onClick(QMUIDialog dialog, int index) {
                                Toast.makeText(MainActivity.this,"clicked Cancel",Toast.LENGTH_SHORT).show();
                                dialog.dismiss();
                            }
                        })
                        .create()
                        .show();
            }
        });

        Button button1 = findViewById(R.id.button_showDefaultDialog);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Default")
                        .setMessage("Default")
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,"clicked Cancel",Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this,"clicked OK",Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                })
                        .create()
                        .show();
            }
        });
    }

//    public void  onClickShowDefaultDialog(View view){
//        new  AlertDialog.Builder(this)
//                .setTitle("Default")
//                .setMessage("Default Dialog")
//                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Toast.makeText(MainActivity.this,"clicked Cancel",Toast.LENGTH_SHORT).show();
//                        dialogInterface.dismiss();
//                    }
//                })
//                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialogInterface, int i) {
//                        Toast.makeText(MainActivity.this,"clicked OK",Toast.LENGTH_SHORT).show();
//                        dialogInterface.dismiss();
//                    }
//                })
//                .create()
//                .show();
//    }
}
