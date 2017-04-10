package app.isfaaghyth.canvas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import app.isfaaghyth.canvas.view.MainView;
import app.isfaaghyth.canvas.view.MainViewImp;

public class MainActivity extends AppCompatActivity implements MainView {

    MainViewImp viewImp;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewImp = new MainViewImp(this);
        viewImp.test();
    }

    @Override public AppCompatActivity getActivity() {
        return this;
    }
}
