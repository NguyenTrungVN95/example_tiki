package nguyentrung.example.com.exam_nguyentrung.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import nguyentrung.example.com.exam_nguyentrung.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";
    private String[] mNames = new String[]{"", "", ""};
    private Context mcontext;
    private Random rnd = new Random();
    static String[] arrKey =new String[]{"", "", ""};

    private int color;

    public RecyclerViewAdapter(String[] mNames, Context mcontext) {
        this.mNames = mNames;
        this.mcontext = mcontext;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, final int position) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @SuppressLint("ResourceType")
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        holder.txt.setText(mNames[position]);
        holder.parent_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: Clicked");
                Toast.makeText(mcontext, mNames[position], Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mNames.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt;
        RelativeLayout parent_layout;

        public ViewHolder(View v) {
            super(v);
            txt = itemView.findViewById(R.id.text);
            parent_layout = itemView.findViewById(R.id.parent_layout);
            rnd = new Random();
            color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
            v.setBackgroundResource(R.drawable.tags_rounded_corners);
            GradientDrawable drawable = (GradientDrawable) v.getBackground();
            drawable.setColor(color);


        }
    }
}
