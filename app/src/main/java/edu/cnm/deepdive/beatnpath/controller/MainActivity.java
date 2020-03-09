package edu.cnm.deepdive.beatnpath.controller;

import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavOptions;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import edu.cnm.deepdive.beatnpath.R;
import edu.cnm.deepdive.beatnpath.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

  private NavController navController;
  private BottomNavigationView navigator;
  private NavOptions navOptions;
  private MainViewModel viewModel;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate( savedInstanceState );
    setContentView( R.layout.activity_main );
    BottomNavigationView navView = findViewById( R.id.nav_view );
    setupNavigation();  findViewById( R.id.navigation_beatNpath );
    setupNavigation();
    AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
        R.id.navigation_user, R.id.navigation_beatNpath, R.id.navigation_music )
        .build();
    NavController navController = Navigation.findNavController( this, R.id.nav_host_fragment );
    NavigationUI.setupActionBarWithNavController( this, navController, appBarConfiguration );
    NavigationUI.setupWithNavController( navView, navController );
  }

  private void setupNavigation() {
    navOptions = new NavOptions.Builder()
        .setPopUpTo(R.id.mobile_navigation, true)
        .build();
    AppBarConfiguration appBarConfiguration =
        new AppBarConfiguration.Builder(R.id.navigation_music, R.id.navigation_user)
            .build();
    navController = Navigation.findNavController(this, R.id.nav_host_fragment);
    NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
    navigator = findViewById(R.id.mobile_navigation);
    };

  private void navigateTo(int itemId) {
    if (navController.getCurrentDestination().getId() != itemId) {
      navController.navigate(itemId, null, navOptions);
      if (navigator.getSelectedItemId() != itemId) {
        navigator.setSelectedItemId(itemId);
      }
    }
  }

}
