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
        for (int i = 0; i < keys.getkeywords().length; i++) {
            String[] arrKey = keys.getkeywords()[i].split(" ");
            if (arrKey.length == 1) {
                keys.getkeywords()[i] = arrKey[0];
            } else if (arrKey.length == 2) {
                keys.getkeywords()[i] = arrKey[0] + "\n" + arrKey[1];
            } else if (arrKey.length == 3) {
                keys.getkeywords()[i] = arrKey[0] + " " + arrKey[1] + "\n" + arrKey[2];
            } else if (arrKey.length == 4) {
                keys.getkeywords()[i] = arrKey[0] + " " + arrKey[1] + "\n" + arrKey[2] + " " + arrKey[3];
            } else if (arrKey.length == 5) {
                keys.getkeywords()[i] = arrKey[0] + " " + arrKey[1] + "\n" + arrKey[2] + " " + arrKey[3] + " " + arrKey[4];
            } else if (arrKey.length == 6) {
                keys.getkeywords()[i] = arrKey[0] + " " + arrKey[1] + " " + arrKey[2] + "\n" + arrKey[3] + " " + arrKey[4] + " " + arrKey[5];
            } else if (arrKey.length == 7) {
                keys.getkeywords()[i] = arrKey[0] + " " + arrKey[1] + " " + arrKey[2] + "\n" + arrKey[3] + " " + arrKey[4] + " " + arrKey[5] + " " + arrKey[6];
            }
        }
        return keys.getkeywords();
    }

    public void showView() {
        view.initRecycler();
    }
}
