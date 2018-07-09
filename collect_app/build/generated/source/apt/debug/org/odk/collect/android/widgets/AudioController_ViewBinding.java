// Generated code from Butter Knife. Do not modify!
package org.odk.collect.android.widgets;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import org.odk.collect.android.R;

public class AudioController_ViewBinding implements Unbinder {
  private AudioController target;

  private View view2131296494;

  private View view2131296377;

  private View view2131296378;

  @UiThread
  public AudioController_ViewBinding(final AudioController target, View source) {
    this.target = target;

    View view;
    target.currentDurationLabel = Utils.findRequiredViewAsType(source, R.id.currentDuration, "field 'currentDurationLabel'", TextView.class);
    target.totalDurationLabel = Utils.findRequiredViewAsType(source, R.id.totalDuration, "field 'totalDurationLabel'", TextView.class);
    view = Utils.findRequiredView(source, R.id.playBtn, "field 'playButton' and method 'playClicked'");
    target.playButton = Utils.castView(view, R.id.playBtn, "field 'playButton'", ImageButton.class);
    view2131296494 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.playClicked();
      }
    });
    target.seekBar = Utils.findRequiredViewAsType(source, R.id.seekBar, "field 'seekBar'", SeekBar.class);
    view = Utils.findRequiredView(source, R.id.fastForwardBtn, "method 'fastForwardMedia'");
    view2131296377 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.fastForwardMedia();
      }
    });
    view = Utils.findRequiredView(source, R.id.fastRewindBtn, "method 'rewindMedia'");
    view2131296378 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.rewindMedia();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    AudioController target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.currentDurationLabel = null;
    target.totalDurationLabel = null;
    target.playButton = null;
    target.seekBar = null;

    view2131296494.setOnClickListener(null);
    view2131296494 = null;
    view2131296377.setOnClickListener(null);
    view2131296377 = null;
    view2131296378.setOnClickListener(null);
    view2131296378 = null;
  }
}
