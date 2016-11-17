package fragments.dragos.com.fragments.activities;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fragments.dragos.com.fragments.R;
import fragments.dragos.com.fragments.fragments.BlankFragment;
import fragments.dragos.com.fragments.fragments.BlankFragment2;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Button btn2;
    FragmentManager fg;
    FragmentTransaction ft;
    boolean change = false;
//    BlankFragment bf;
//    BlankFragment2 bf2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fg = getFragmentManager();
        ft = fg.beginTransaction();
        BlankFragment bf = new BlankFragment();

        ft.add(R.id.frameContainer, bf, "fragment");
        ft.commit();
        setUI();
        setlistener();



    }

    public void init() {

    }

    public void setUI() {
        btn = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

    }


    public void setlistener() {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addBtnOne();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addBtnTwo();
                btn.setVisibility(View.VISIBLE);

            }
        });


    }

    public void addBtnOne() {
        fg = getFragmentManager();
        ft = fg.beginTransaction();
        BlankFragment bf = new BlankFragment();
        ft.add(R.id.frameContainer, bf, "Black 1");
        ft.addToBackStack("Black 1");
        ft.commit();
    }

    public void addBtnTwo() {

        fg = getFragmentManager();
        ft = fg.beginTransaction();
        BlankFragment2  bf2 = new BlankFragment2();
        ft.add(R.id.frameContainer, bf2, "Black 2");
        ft.addToBackStack("Black 2");
        ft.commit();
    }

    @Override
    public void onBackPressed() {
        if(getFragmentManager().getBackStackEntryCount()>=0){
            getFragmentManager().popBackStack();
        }else{

            super.onBackPressed();
        }
    }
}
