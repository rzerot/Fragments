package fragments.dragos.com.fragments.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fragments.dragos.com.fragments.R;

/**
 * Created by java2 on 10/3/2016.
 */

public class BlankFragment2 extends Fragment{

  public BlankFragment2(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false);
    }
}
