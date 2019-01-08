package nguyentrung.example.com.exam_nguyentrung.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import nguyentrung.example.com.exam_nguyentrung.R;
import nguyentrung.example.com.exam_nguyentrung.presenter.MainContract;
import nguyentrung.example.com.exam_nguyentrung.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainContract.ViewMain {


    private MainPresenter mainPresenter = new MainPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter.setView(this);
        mainPresenter.showView();
    }

    @Override
    public void initRecycler() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(mainPresenter.getData(), this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }

}
