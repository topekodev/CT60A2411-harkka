package dev.topeko.municipalityinfo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import dev.topeko.municipalityinfo.Fragments.SearchFragment;

public class TabPagerAdapter extends androidx.viewpager2.adapter.FragmentStateAdapter {
    public TabPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new SearchFragment();
            default:
                return new SearchFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
