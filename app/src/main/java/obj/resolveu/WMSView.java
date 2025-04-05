package obj.resolveu;

import android.widget.LinearLayout;

public abstract class WMSView {
    public abstract LinearLayout getLayout();
    public void OnActivated() {}
    public void OnDisabled() {}

    // Ciclo de vida (opcional de sobrescrever)
    public void onResume() {}
    public void onPause() {}
    public void onStart() {}
    public void onStop() {}
    public void onDestroy() {}
    public void onLowMemory() {}

    public void Show() {
        synchronized (this) {
            int index = WMSActivity.__views.indexOf(this);
            if (index != -1 && index == WMSActivity.__views.size() - 1) return;
            if (index != -1) WMSActivity.__views.remove(index);

            if (!WMSActivity.__views.isEmpty()) {
                WMSView topView = WMSActivity.__views.get(WMSActivity.__views.size() - 1);
                topView.OnDisabled();
            }

            WMSActivity.__views.add(this);
            LinearLayout layout = WMSActivity.criaTela(this);
            WMSActivity.__activity.setContentView(layout);
            this.OnActivated();
        }
    }

    public void Hide() {
        int index = WMSActivity.__views.indexOf(this);
        if (index != -1 && index == WMSActivity.__views.size() - 1) {
            WMSActivity.__views.remove(index);
            if (!WMSActivity.__views.isEmpty()) {
                WMSView previous = WMSActivity.__views.get(WMSActivity.__views.size() - 1);
                WMSActivity.__activity.setContentView(previous.getLayout());
                previous.OnActivated();
            }
        } else if (index != -1) {
            WMSActivity.__views.remove(index);
        }
    }
}