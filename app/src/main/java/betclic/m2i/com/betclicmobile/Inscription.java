package betclic.m2i.com.betclicmobile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.OnClick;

public class Inscription extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
    }

    @OnClick(R.id.bInscription)
    public void onClick() {
    }
}
