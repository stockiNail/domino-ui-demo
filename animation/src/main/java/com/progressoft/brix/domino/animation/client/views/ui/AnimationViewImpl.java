package com.progressoft.brix.domino.animation.client.views.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Timer;
import com.progressoft.brix.domino.animation.client.views.AnimationView;
import com.progressoft.brix.domino.api.client.annotations.UiView;
import com.progressoft.brix.domino.animation.client.presenters.AnimationPresenter;
import com.progressoft.brix.domino.api.shared.extension.Content;
import com.progressoft.brix.domino.ui.animations.Animation;
import com.progressoft.brix.domino.ui.animations.Transition;
import com.progressoft.brix.domino.ui.button.Button;
import com.progressoft.brix.domino.ui.cards.Card;
import com.progressoft.brix.domino.ui.column.Column;
import com.progressoft.brix.domino.ui.header.BlockHeader;
import com.progressoft.brix.domino.ui.loaders.Loader;
import com.progressoft.brix.domino.ui.loaders.LoaderEffect;
import com.progressoft.brix.domino.ui.row.Row;
import com.progressoft.brix.domino.ui.style.Background;
import com.progressoft.brix.domino.ui.style.Styles;
import elemental2.dom.*;
import jsinterop.base.Js;
import org.jboss.gwt.elemento.core.Elements;

import static org.jboss.gwt.elemento.core.Elements.*;

@UiView(presentable = AnimationPresenter.class)
public class AnimationViewImpl implements AnimationView {

    private static final String SAMPLE_CONTENT = "Quis pharetra a pharetra fames blandit. Risus faucibus velit Risus imperdiet mattis neque volutpat, etiam lacinia netus dictum magnis per facilisi sociosqu. Volutpat. Ridiculus nostra.";

    private HTMLDivElement element = div().asElement();

    public AnimationViewImpl() {

        element.appendChild(BlockHeader.create("CSS ANIMATIONS")
                .appendText("Pure css animations - ")
                .appendContent(a().attr("href", "https://daneden.github.io/animate.css/")
                        .attr("target", "_blank").textContent("daneden.github.io/animate.css").asElement())
                .asElement());


        HTMLImageElement image = img(GWT.getModuleBaseURL() + "/images/animation-bg.jpg").css(Styles.img_responsive).asElement();
        Column column = Column.create()
                .onLarge(Column.OnLarge.four)
                .onMedium(Column.OnMedium.four)
                .onSmall(Column.OnSmall.twelve)
                .onXSmall(Column.OnXSmall.twelve);

        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.BOUNCE)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FLASH)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.PULSE)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.RUBBER_BAND)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.SHAKE)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.SWING)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.TADA)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.WOBBLE)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.JELLO)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.BOUNCE_IN)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.BOUNCE_IN_DOWN)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.BOUNCE_IN_LEFT)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.BOUNCE_IN_RIGHT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.BOUNCE_IN_UP)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.BOUNCE_OUT)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.BOUNCE_OUT_DOWN)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.BOUNCE_OUT_LEFT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.BOUNCE_OUT_RIGHT)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.BOUNCE_OUT_UP)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FADE_IN)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FADE_IN_DOWN)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FADE_IN_DOWN_BIG)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FADE_IN_LEFT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FADE_IN_LEFT_BIG)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FADE_IN_RIGHT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FADE_IN_RIGHT_BIG)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FADE_IN_UP)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FADE_IN_UP_BIG)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FADE_OUT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FADE_OUT_DOWN)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FADE_OUT_DOWN_BIG)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FADE_OUT_LEFT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FADE_OUT_LEFT_BIG)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FADE_OUT_RIGHT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FADE_OUT_RIGHT_BIG)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FADE_OUT_UP)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FADE_OUT_UP_BIG)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FLIP)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FLIP_IN_X)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FLIP_IN_Y)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FLIP_OUT_X)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.FLIP_OUT_Y)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.LIGHT_SPEED_IN)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.LIGHT_SPEED_OUT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ROTATE_IN)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ROTATE_IN_DOWN_LEFT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ROTATE_IN_DOWN_RIGHT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ROTATE_IN_UP_LEFT)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ROTATE_IN_UP_RIGHT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ROTATE_OUT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ROTATE_OUT_DOWN_LEFT)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ROTATE_OUT_DOWN_RIGHT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ROTATE_OUT_UP_LEFT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ROTATE_OUT_UP_RIGHT)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.SLIDE_IN_UP)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.SLIDE_IN_DOWN)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.SLIDE_IN_LEFT)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.SLIDE_IN_RIGHT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.SLIDE_OUT_UP)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.SLIDE_OUT_DOWN)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.SLIDE_OUT_LEFT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.SLIDE_OUT_RIGHT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ZOOM_IN)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ZOOM_IN_DOWN)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ZOOM_IN_LEFT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ZOOM_IN_RIGHT)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ZOOM_IN_UP)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ZOOM_OUT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ZOOM_OUT_DOWN)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ZOOM_OUT_LEFT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ZOOM_OUT_RIGHT)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ZOOM_OUT_UP)
                                .asElement()))
                .asElement());
        element.appendChild(Row.create()
                .addColumn(column.copy()
                        .addElement(createCard(Transition.HINGE)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ROLL_IN)
                                .asElement()))
                .addColumn(column.copy()
                        .addElement(createCard(Transition.ROLL_OUT)
                                .asElement()))
                .asElement());

        element.appendChild(Card.createCodeCard("// Create an animation for the element and pass the transition type and other parameters\n" +
                "Animation.create(element)\n" +
                "        .transition(Transition.BOUNCE)\n" +
                "        .duration(1000)\n" +
                "        .animate();\n" +
                "\n" +
                "// Delay animation start\n" +
                "Animation.create(element)\n" +
                "        .transition(Transition.FLASH)\n" +
                "        .duration(1000)\n" +
                "        .delay(1000)\n" +
                "        .animate();\n" +
                "\n" +
                "// Make the animation infinite\n" +
                "Animation.create(element)\n" +
                "        .transition(Transition.FLIP)\n" +
                "        .duration(1000)\n" +
                "        .infinite()\n" +
                "        .animate();\n" +
                "\n" +
                "// Stop the infinite animation\n" +
                "Animation animation = Animation.create(element)\n" +
                "        .transition(Transition.TADA)\n" +
                "        .duration(1000)\n" +
                "        .infinite()\n" +
                "        .animate();\n" +
                "\n" +
                "animation.stop();").asElement());


    }

    private Card createCard(Transition transition) {

        Card animationCard = Card.create().setBackground(Background.BLUE_GREY)
                .appendContent(img(GWT.getModuleBaseURL() + "/images/animation-bg.jpg").css(Styles.img_responsive).asElement());

        Card card = Card.create(transition.getName(), transition.getStyle() + " animation.")
                .setBodyBackground(Background.LIGHT_BLUE)
                .setHeaderBackground(Background.BLUE);

        Button animate = Button.createDefault(transition.getName())
                .large();
        animate.getClickableElement().addEventListener("click", e ->
                Animation.create(animationCard.asElement())
                        .transition(transition)
                        .duration(1000)
                        .animate());

        Button infiniteAnimate = Button.createDefault("INFINITE")
                .large();
        infiniteAnimate.getClickableElement().addEventListener("click", e -> {

            Animation animation = Animation.create(animationCard.asElement())
                    .transition(transition)
                    .infinite()
                    .duration(1000);
            if (animationCard.asElement().classList.contains("animated")) {
                animation.stop();
                animate.asElement().style.display = "inline-block";
                infiniteAnimate.setContent("INFINITE");
            } else {
                animation.animate();
                animate.asElement().style.display = "none";
                infiniteAnimate.setContent("STOP");
            }
        });


        card.appendContent(animationCard.asElement())
                .appendContent(Elements.div().css("button-demo").attr("style", "text-align: center")
                        .add(animate.asElement())
                        .add(infiniteAnimate.asElement())
                        .asElement());

        return card;
    }

    private HTMLElement makeAnimationButton(HTMLImageElement image, Transition transition) {
        Button button = Button.createPrimary(transition.getName())
                .large();
        button.getClickableElement().addEventListener("click", e ->
                Animation.create(image)
                        .transition(transition)
                        .duration(1000)
                        .animate());

        return button.asElement();
    }

    @Override
    public void showIn(Content content) {
        HTMLElement contentElement = Js.cast(content.get());
        contentElement.appendChild(element);
    }
}