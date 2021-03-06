// Generated by Dagger (https://google.github.io/dagger).
package org.odk.collect.android.injection.config.architecture;

import android.arch.lifecycle.ViewModelProvider;
import android.support.v4.app.FragmentActivity;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ActivityViewModelProvider_Factory implements Factory<ActivityViewModelProvider> {
  private final Provider<FragmentActivity> activityProvider;

  private final Provider<ViewModelProvider.Factory> factoryProvider;

  public ActivityViewModelProvider_Factory(
      Provider<FragmentActivity> activityProvider,
      Provider<ViewModelProvider.Factory> factoryProvider) {
    this.activityProvider = activityProvider;
    this.factoryProvider = factoryProvider;
  }

  @Override
  public ActivityViewModelProvider get() {
    return new ActivityViewModelProvider(activityProvider.get(), factoryProvider.get());
  }

  public static ActivityViewModelProvider_Factory create(
      Provider<FragmentActivity> activityProvider,
      Provider<ViewModelProvider.Factory> factoryProvider) {
    return new ActivityViewModelProvider_Factory(activityProvider, factoryProvider);
  }

  public static ActivityViewModelProvider newActivityViewModelProvider(
      FragmentActivity activity, ViewModelProvider.Factory factory) {
    return new ActivityViewModelProvider(activity, factory);
  }
}
