package com.example.practica;

import androidx.fragment.app.Fragment;

public interface NavigationHost {
    void navigateTo(layout_home fragment, boolean addToBackstack);
}
