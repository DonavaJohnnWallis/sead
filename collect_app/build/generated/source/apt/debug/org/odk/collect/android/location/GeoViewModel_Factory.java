// Generated by Dagger (https://google.github.io/dagger).
package org.odk.collect.android.location;

import dagger.internal.Factory;

public final class GeoViewModel_Factory implements Factory<GeoViewModel> {
  private static final GeoViewModel_Factory INSTANCE = new GeoViewModel_Factory();

  @Override
  public GeoViewModel get() {
    return new GeoViewModel();
  }

  public static GeoViewModel_Factory create() {
    return INSTANCE;
  }

  public static GeoViewModel newGeoViewModel() {
    return new GeoViewModel();
  }
}
