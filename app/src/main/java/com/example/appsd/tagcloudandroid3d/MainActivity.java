package com.example.appsd.tagcloudandroid3d;




import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.moxun.tagcloudlib.view.TagCloudView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TagCloudView tagCloudView = (TagCloudView) findViewById(R.id.tag_cloud);
        tagCloudView.setBackgroundColor(Color.LTGRAY);


        TextTagsAdapter tagsAdapter = new TextTagsAdapter(new String[10]);
        tagCloudView.setAdapter(tagsAdapter);





    }
}
