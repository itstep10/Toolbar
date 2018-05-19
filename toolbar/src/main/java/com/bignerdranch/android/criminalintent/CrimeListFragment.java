package com.bignerdranch.android.criminalintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class CrimeListFragment extends Fragment
{
    private static final String TAG = "Debug";
//    private static final String SAVED_SUBTITLE_VISIBLE = "subtitle";
//    private boolean mSubtitleVisible;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_crime_list, container, false);

//        if(savedInstanceState != null)
//        {
//            mSubtitleVisible = savedInstanceState.getBoolean(SAVED_SUBTITLE_VISIBLE);
//        }
        return view;
    }

//    @Override
//    public void onSaveInstanceState(Bundle outState)
//    {
//        super.onSaveInstanceState(outState);
//        outState.putBoolean(SAVED_SUBTITLE_VISIBLE, mSubtitleVisible);
//    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater)
    {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.fragment_crime_list, menu);

//        MenuItem subtitleItem = menu.findItem(R.id.show_subtitle);
//        subtitleItem.setTitle(R.string.hide_subtitle);

//        if(mSubtitleVisible)
//        {
//            subtitleItem.setTitle(R.string.hide_subtitle);
//        }
//        else
//        {
//            subtitleItem.setTitle(R.string.show_subtitle);
//        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.new_crime:
                Toast.makeText(getActivity(), "Check item menu New crime", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.show_subtitle:
                Toast.makeText(getActivity(), "Check item menu Show subtitle", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
