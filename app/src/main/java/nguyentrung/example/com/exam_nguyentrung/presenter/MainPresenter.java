package nguyentrung.example.com.exam_nguyentrung.presenter;

import nguyentrung.example.com.exam_nguyentrung.model.Keywords;
import nguyentrung.example.com.exam_nguyentrung.view.MainActivity;

public class MainPresenter {
    MainContract.ViewMain view;
    Keywords keys;

    public void setView(MainContract.ViewMain view) {
        this.view = view;
        keys = new Keywords((MainActivity) view);
    }

    public String[] getData() {
        return keys.getkeywords();
    }

    public void showView() {
        view.initRecycler();
    }
}
