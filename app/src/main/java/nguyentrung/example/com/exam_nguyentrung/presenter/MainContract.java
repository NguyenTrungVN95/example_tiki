package nguyentrung.example.com.exam_nguyentrung.presenter;

import android.content.Context;

public interface MainContract {
    interface ViewMain {
        void initRecycler();
    }

    interface ActionsListener {
        void checkStyleItemView();
    }

}
