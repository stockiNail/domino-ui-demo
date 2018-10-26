package org.dominokit.domino.icons.client.presenters;

import org.dominokit.domino.api.client.annotations.ListenTo;
import org.dominokit.domino.api.client.annotations.Presenter;
import org.dominokit.domino.api.client.mvp.presenter.ViewBaseClientPresenter;
import org.dominokit.domino.api.shared.extension.Content;
import org.dominokit.domino.componentcase.shared.extension.ComponentCase;
import org.dominokit.domino.componentcase.shared.extension.ComponentCaseContext;
import org.dominokit.domino.componentcase.shared.extension.ComponentCaseEvent;
import org.dominokit.domino.icons.client.views.IconsView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Presenter
public class IconsPresenter extends ViewBaseClientPresenter<IconsView> {

    private static final Logger LOGGER = LoggerFactory.getLogger(IconsPresenter.class);

    @ListenTo(event=ComponentCaseEvent.class)
    public void onComponentsEvent(ComponentCaseContext context) {
        context.addComponentCase(new ComponentCase() {
            @Override
            public String getHistoryToken() {
                return "icons";
            }

            @Override
            public String getMenuPath() {
                return "Icons";
            }

            @Override
            public String getIconName() {
                return "spa";
            }

            @Override
            public Content getContent() {
                return view.getContent();
            }
        });
    }
}