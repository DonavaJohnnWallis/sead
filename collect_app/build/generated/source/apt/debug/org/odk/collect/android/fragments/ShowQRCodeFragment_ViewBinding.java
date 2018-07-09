// Generated code from Butter Knife. Do not modify!
package org.odk.collect.android.fragments;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.odk.collect.android.R;

public class ShowQRCodeFragment_ViewBinding implements Unbinder {
  private ShowQRCodeFragment target;

  private View view2131296614;

  private View view2131296303;

  private View view2131296304;

  @UiThread
  public ShowQRCodeFragment_ViewBinding(final ShowQRCodeFragment target, View source) {
    this.target = target;

    View view;
    target.ivQRCode = Utils.findRequiredViewAsType(source, R.id.ivQRcode, "field 'ivQRCode'", ImageView.class);
    target.progressBar = Utils.findRequiredViewAsType(source, R.id.circularProgressBar, "field 'progressBar'", ProgressBar.class);
    view = Utils.findRequiredView(source, R.id.tvPasswordWarning, "field 'tvPasswordWarning' and method 'passwordWarningClicked'");
    target.tvPasswordWarning = Utils.castView(view, R.id.tvPasswordWarning, "field 'tvPasswordWarning'", TextView.class);
    view2131296614 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.passwordWarningClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.btnScan, "method 'scanButtonClicked'");
    view2131296303 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.scanButtonClicked();
      }
    });
    view = Utils.findRequiredView(source, R.id.btnSelect, "method 'chooseButtonClicked'");
    view2131296304 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.chooseButtonClicked();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    ShowQRCodeFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivQRCode = null;
    target.progressBar = null;
    target.tvPasswordWarning = null;

    view2131296614.setOnClickListener(null);
    view2131296614 = null;
    view2131296303.setOnClickListener(null);
    view2131296303 = null;
    view2131296304.setOnClickListener(null);
    view2131296304 = null;
  }
}
