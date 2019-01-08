package nguyentrung.example.com.exam_nguyentrung.model;

import android.content.Context;

import java.util.ArrayList;

import nguyentrung.example.com.exam_nguyentrung.R;

public class Keywords {
    private String[] keywords;
    public Keywords(Context context){
        keywords = context.getResources().getStringArray(R.array.keywords);
    }

    public String[] getkeywords() {
        return keywords;
    }
}
