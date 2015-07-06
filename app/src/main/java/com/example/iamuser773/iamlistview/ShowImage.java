package com.example.iamuser773.iamlistview;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import com.origamilabs.library.views.StaggeredGridView;

/**
 * Created by IamUser773 on 6/7/2558.
 */
public class ShowImage extends AppCompatActivity{
    private int img[] = {
            R.drawable.haha1,R.drawable.haha2,R.drawable.haha3,R.drawable.haha4,
            R.drawable.haha5,R.drawable.haha6,R.drawable.haha7,R.drawable.haha8,
            R.drawable.haha9,R.drawable.haha10
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_layout);

        StaggeredGridView gridView = (StaggeredGridView) this.findViewById(R.id.staggeredGridView1);
        int margin = getResources().getDimensionPixelSize(R.dimen.margin);
        gridView.setItemMargin(margin);
        gridView.setPadding(margin,0,margin,0);



    }
}

public class MyImageAdapter extends ArrayAdapter<int>{

    public MyImageAdapter(Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }
}
