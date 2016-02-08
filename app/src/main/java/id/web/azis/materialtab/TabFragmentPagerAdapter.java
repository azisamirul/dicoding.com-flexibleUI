package id.web.azis.materialtab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import id.web.azis.materialtab.fragment.Tab1Fragment;
import id.web.azis.materialtab.fragment.Tab2Fragment;

/**
 * Created by azisamirul on 19/12/2015.
 */
public class TabFragmentPagerAdapter extends FragmentPagerAdapter {

    String [] title=new String[]{
      "Tab 1","Tab 2"
    };
    public TabFragmentPagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
     Fragment fragment=null;
        switch (position){
            case 0 :
                fragment = new Tab1Fragment();
                break;
            case 1:
                fragment=new Tab2Fragment();
                break;
            default:
                fragment=null;
                break;

        }
        return fragment;
    }
    @Override
    public CharSequence getPageTitle(int position){
        return title[position];

    }
    @Override
    public int getCount(){
        return title.length;
    }




}
