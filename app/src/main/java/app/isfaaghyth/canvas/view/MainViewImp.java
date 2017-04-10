package app.isfaaghyth.canvas.view;

import android.util.Log;

/**
 * ---------------------------------
 * Created by isfaaghyth with <3
 * Everything in here: @isfaaghyth
 * ---------------------------------
 */

public class MainViewImp {

    MainView mainView;

    public MainViewImp(MainView mainView) {
        this.mainView = mainView;
    }

    public String test() {
        return (mainView.getActivity() != null) ? "Ada" : "Tidak ada";
    }
}
