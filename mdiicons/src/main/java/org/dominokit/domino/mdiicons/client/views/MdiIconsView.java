package org.dominokit.domino.mdiicons.client.views;

import org.dominokit.domino.api.client.mvp.view.View;
import org.dominokit.domino.api.shared.extension.Content;
import org.dominokit.domino.componentcase.shared.extension.DemoView;

public interface MdiIconsView extends View, DemoView {
    Content getContent();
}