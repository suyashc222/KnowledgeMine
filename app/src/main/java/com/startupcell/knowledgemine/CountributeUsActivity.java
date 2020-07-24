package com.startupcell.knowledgemine;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.LauncherActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.github.angads25.filepicker.controller.DialogSelectionListener;
import com.github.angads25.filepicker.controller.adapters.FileListAdapter;
import com.github.angads25.filepicker.model.DialogConfigs;
import com.github.angads25.filepicker.model.DialogProperties;
import com.github.angads25.filepicker.view.FilePickerDialog;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.File;
import java.util.ArrayList;

public class CountributeUsActivity extends AppCompatActivity {

    EditText subject;
    EditText description;
    ImageView upload;
    RadioGroup type;

    private FilePickerDialog dialog;
    private ArrayList<String> listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countribute_us);

        // Hiding Title Bar
        getSupportActionBar().hide();

        FirebaseStorage storage = FirebaseStorage.getInstance();

        // Create a storage reference from our app
        StorageReference rootRef = storage.getReference();

        final StorageReference uploadto = rootRef.child("To Review");

        subject=findViewById(R.id.input_subject);
        description=findViewById(R.id.input_description);
        upload=findViewById(R.id.input_upload);

        // Creating a Dialogue Box for File Input
        //Create a DialogProperties object.
        final DialogProperties properties=new DialogProperties();

        //Instantiate FilePickerDialog with Context and DialogProperties.
        dialog=new FilePickerDialog(CountributeUsActivity.this,properties);
        dialog.setTitle("Select a File");
        dialog.setPositiveBtnName("Select");
        dialog.setNegativeBtnName("Cancel");

        properties.selection_mode = DialogConfigs.MULTI_MODE;
        properties.selection_type=DialogConfigs.FILE_SELECT;
        properties.extensions= null;
        properties.root=new File("/storage/emulated/0");
        properties.offset=new File(DialogConfigs.DEFAULT_DIR);
        properties.error_dir=new File("/mnt");


        // Setting Properties
        dialog.setProperties(properties);



        upload.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                dialog.show();
/*
                Uri file = Uri.fromFile(new File("path/to/images/rivers.jpg"));
                UploadTask upload_Task = uploadto.putFile(file);

                // Register observers to listen for when the download is done or if it fails
                upload_Task.addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                        Toast.makeText(getApplicationContext(),"Upload Interrupted. Please try again.",Toast.LENGTH_SHORT).show();
                    }
                }).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                        // taskSnapshot.getMetadata() contains file metadata such as size, content-type, etc.
                        // ...
                    }
                });
 */


            }

        });

        dialog.setDialogSelectionListener(new DialogSelectionListener() {
            @Override
            public void onSelectedFilePaths(String[] files) {
                listItem.clear();
                for(String path:files) {
                    listItem.add(path);
                }
            }
        });

    }
}