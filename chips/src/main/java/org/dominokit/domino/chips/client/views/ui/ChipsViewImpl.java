package org.dominokit.domino.chips.client.views.ui;

import elemental2.dom.HTMLDivElement;
import org.dominokit.domino.api.client.annotations.UiView;
import org.dominokit.domino.chips.client.presenters.ChipsPresenter;
import org.dominokit.domino.chips.client.views.ChipsView;
import org.dominokit.domino.chips.client.views.CodeResource;
import org.dominokit.domino.componentcase.shared.extension.ComponentView;
import org.dominokit.domino.ui.cards.Card;
import org.dominokit.domino.ui.chips.Chip;
import org.dominokit.domino.ui.chips.ChipsGroup;
import org.dominokit.domino.ui.grid.Column;
import org.dominokit.domino.ui.grid.Row;
import org.dominokit.domino.ui.header.BlockHeader;
import org.dominokit.domino.ui.icons.Icons;
import org.dominokit.domino.ui.notifications.Notification;
import org.dominokit.domino.ui.style.Color;
import org.dominokit.domino.ui.style.ColorScheme;

import static org.jboss.gwt.elemento.core.Elements.*;

@UiView(presentable = ChipsPresenter.class)
public class ChipsViewImpl extends ComponentView<HTMLDivElement> implements ChipsView {

    private HTMLDivElement element = div().asElement();

    private Card simpleCard;
    private Card removableCard;
    private Card iconChipsCard;
    private Card imagesChipsCard;
    private Card lettersChipsCard;
    private Card selectableChipsCard;

    @Override
    public void init() {
        element.appendChild(BlockHeader.create("CHIPS").asElement());
        simpleCard = Card.create("SIMPLE CHIPS");
        removableCard = Card.create("REMOVABLE CHIPS");
        iconChipsCard = Card.create("CHIPS WITH ICONS");
        imagesChipsCard = Card.create("CHIPS WITH IMAGES");
        lettersChipsCard = Card.create("CHIPS WITH LETTERS");
        selectableChipsCard = Card.create("SELECTABLE CHIPS");

        initSimpleExample();
        initRemovableExample();
        initChipsWithIconsExample();
        initChipsWithImagesExample();
        initChipsWithLettersExample();
        initSelectableChipsExample();

        element.appendChild(simpleCard.asElement());
        element.appendChild(Card.createCodeCard(CodeResource.INSTANCE.simple()).asElement());
        element.appendChild(removableCard.asElement());
        element.appendChild(Card.createCodeCard(CodeResource.INSTANCE.removable()).asElement());
        element.appendChild(iconChipsCard.asElement());
        element.appendChild(Card.createCodeCard(CodeResource.INSTANCE.chipsWithIcons()).asElement());
        element.appendChild(imagesChipsCard.asElement());
        element.appendChild(Card.createCodeCard(CodeResource.INSTANCE.chipsWithImages()).asElement());
        element.appendChild(lettersChipsCard.asElement());
        element.appendChild(Card.createCodeCard(CodeResource.INSTANCE.chipsWithLetters()).asElement());
        element.appendChild(selectableChipsCard.asElement());
        element.appendChild(Card.createCodeCard(CodeResource.INSTANCE.selectable()).asElement());
    }

    private void initSimpleExample() {
        simpleCard.appendChild(Row.create()
                .addColumn(Column.span12()
                        .appendChild(Chip.create()
                                .setValue("Sounds good, let's do that!"))
                        .appendChild(Chip.create()
                                .setValue("Yay! I'll be there")
                                .setColorScheme(ColorScheme.RED))
                        .appendChild(Chip.create()
                                .setValue("Hey, how are you?")
                                .setColorScheme(ColorScheme.ORANGE))
                        .appendChild(Chip.create()
                                .setValue("You look handsome today <3")
                                .setColorScheme(ColorScheme.PURPLE))
                        .appendChild(Chip.create()
                                .setValue("I like the weather today!")
                                .setColorScheme(ColorScheme.GREEN)))
        );
    }

    private void initRemovableExample() {
        removableCard.appendChild(Row.create()
                .addColumn(Column.span12()
                        .appendChild(Chip.create()
                                .setRemovable(true)
                                .setColorScheme(ColorScheme.GREY)
                                .setValue("Restaurants"))
                        .appendChild(Chip.create()
                                .setRemovable(true)
                                .setColorScheme(ColorScheme.PINK)
                                .setValue("Coffee shops"))
                        .appendChild(Chip.create()
                                .setRemovable(true)
                                .setColorScheme(ColorScheme.AMBER)
                                .setValue("Libraries"))
                        .appendChild(Chip.create()
                                .setRemovable(true)
                                .setColorScheme(ColorScheme.BROWN)
                                .setValue("Entertainment"))
                        .appendChild(Chip.create()
                                .setRemovable(true)
                                .setColorScheme(ColorScheme.TEAL)
                                .setValue("Universities")))
        );
    }

    private void initChipsWithIconsExample() {
        iconChipsCard.appendChild(Row.create()
                .addColumn(Column.span12()
                        .appendChild(Chip.create()
                                .setValue("Add to calendar")
                                .addClickListener(evt -> {
                                    Notification.createSuccess("Added to your calendar").show();
                                })
                                .setLeftIcon(Icons.ALL.date_range())
                        )
                        .appendChild(Chip.create()
                                .setValue("Bookmark")
                                .addClickListener(evt -> {
                                    Notification.createSuccess("Bookmark added").show();
                                })
                                .setLeftIcon(Icons.ALL.bookmark())
                        )
                        .appendChild(Chip.create()
                                .setValue("Set alarm")
                                .addClickListener(evt -> {
                                    Notification.createSuccess("Alarm has been set").show();
                                })
                                .setLeftIcon(Icons.ALL.alarm())
                        )
                        .appendChild(Chip.create()
                                .setValue("Get directions")
                                .addClickListener(evt -> {
                                    Notification.createSuccess("Directions has been sent to your email").show();
                                })
                                .setLeftIcon(Icons.ALL.directions())
                        ))
        );
    }

    private void initChipsWithImagesExample() {
        imagesChipsCard.appendChild(Row.create()
                .addColumn(Column.span2()
                        .appendChild(Chip.create()
                                .setValue("Schroeder Coleman")
                                .setColorScheme(ColorScheme.TRANSPARENT)
                                .setBorderColor(Color.INDIGO)
                                .setLeftImg(img("https://randomuser.me/api/portraits/med/men/0.jpg"))))
                .addColumn(Column.span2()
                        .appendChild(Chip.create()
                                .setValue("Renee Mcintyre")
                                .setColorScheme(ColorScheme.GREY)
                                .setLeftImg(img("https://randomuser.me/api/portraits/med/men/1.jpg"))))
                .addColumn(Column.span2()
                        .appendChild(Chip.create()
                                .setValue("Casey Garza")
                                .setColorScheme(ColorScheme.BLUE)
                                .setLeftImg(img("https://randomuser.me/api/portraits/med/men/2.jpg"))))
                .addColumn(Column.span2()
                        .appendChild(Chip.create()
                                .setValue("Ferguson Hudson")
                                .setColorScheme(ColorScheme.BLACK)
                                .setLeftImg(img("https://randomuser.me/api/portraits/med/men/3.jpg")))
                )
                .addColumn(Column.span2()
                        .appendChild(Chip.create()
                                .setValue("Serrano Green")
                                .setColorScheme(ColorScheme.CYAN)
                                .setLeftImg(img("https://randomuser.me/api/portraits/med/men/4.jpg")))
                )
                .addColumn(Column.span2()
                        .appendChild(Chip.create()
                                .setValue("Camacho Solis")
                                .setColorScheme(ColorScheme.BLUE_GREY)
                                .setLeftImg(img("https://randomuser.me/api/portraits/med/men/5.jpg")))
                )
        );
    }

    private void initChipsWithLettersExample() {
        lettersChipsCard.appendChild(Row.create()
                .addColumn(Column.span2()
                        .appendChild(Chip.create()
                                .setValue("Schroeder Coleman")
                                .setColorScheme(ColorScheme.TRANSPARENT)
                                .setLeftBackground(Color.INDIGO)
                                .setBorderColor(Color.INDIGO)
                                .setLeftLetter("SC")))
                .addColumn(Column.span2()
                        .appendChild(Chip.create()
                                .setValue("Renee Mcintyre")
                                .setColorScheme(ColorScheme.TRANSPARENT)
                                .setLeftBackground(Color.GREY)
                                .setBorderColor(Color.GREY)
                                .setLeftLetter("RM")))
                .addColumn(Column.span2()
                        .appendChild(Chip.create()
                                .setValue("Casey Garza")
                                .setColorScheme(ColorScheme.TRANSPARENT)
                                .setLeftBackground(Color.BLUE)
                                .setBorderColor(Color.BLUE)
                                .setLeftLetter("CG")))
                .addColumn(Column.span2()
                        .appendChild(Chip.create()
                                .setValue("Ferguson Hudson")
                                .setColorScheme(ColorScheme.TRANSPARENT)
                                .setLeftBackground(Color.BLACK)
                                .setBorderColor(Color.BLACK)
                                .setLeftLetter("FH"))
                )
                .addColumn(Column.span2()
                        .appendChild(Chip.create()
                                .setValue("Serrano Green")
                                .setColorScheme(ColorScheme.TRANSPARENT)
                                .setLeftBackground(Color.CYAN)
                                .setBorderColor(Color.CYAN)
                                .setLeftLetter("SG"))
                )
                .addColumn(Column.span2()
                        .appendChild(Chip.create()
                                .setValue("Camacho Solis")
                                .setColorScheme(ColorScheme.TRANSPARENT)
                                .setBorderColor(Color.BLUE_GREY)
                                .setLeftLetter("CS")
                                .setLeftBackground(Color.BLUE_GREY))
                )
        );
    }

    private void initSelectableChipsExample() {
        Chip tops = Chip.create("Tops").setSelectable(true).setColorScheme(ColorScheme.GREY);
        tops.addSelectionHandler(() -> tops.setLeftIcon(Icons.ALL.check()));
        tops.addDeselectionHandler(tops::removeLeftAddon);

        Chip bottoms = Chip.create("Bottoms").setSelectable(true).setColorScheme(ColorScheme.GREY);
        bottoms.addSelectionHandler(() -> bottoms.setLeftIcon(Icons.ALL.check()));
        bottoms.addDeselectionHandler(bottoms::removeLeftAddon);

        Chip shoes = Chip.create("Shoes").setSelectable(true).setColorScheme(ColorScheme.GREY);
        shoes.addSelectionHandler(() -> shoes.setLeftIcon(Icons.ALL.check()));
        shoes.addDeselectionHandler(shoes::removeLeftAddon);

        Chip accessories = Chip.create("Accessories").setSelectable(true).setColorScheme(ColorScheme.GREY);
        accessories.addSelectionHandler(() -> accessories.setLeftIcon(Icons.ALL.check()));
        accessories.addDeselectionHandler(accessories::removeLeftAddon);

        selectableChipsCard.appendChild(Row.create()
                .addColumn(Column.span12()
                        .appendChild(tops)
                        .appendChild(bottoms)
                        .appendChild(shoes)
                        .appendChild(accessories)
                ));

        selectableChipsCard.appendChild(br());
        selectableChipsCard.appendChild(BlockHeader.create("Choice chips"));

        ChipsGroup chipsGroup = ChipsGroup.create()
                .appendChild(Chip.create("Extra small"))
                .appendChild(Chip.create("Small"))
                .appendChild(Chip.create("Medium"))
                .appendChild(Chip.create("Large"))
                .appendChild(Chip.create("Extra large"))
                .setColorScheme(ColorScheme.TEAL);
        selectableChipsCard.appendChild(Row.create()
                .addColumn(Column.span12()
                        .appendChild(chipsGroup
                                .addSelectionHandler(() -> Notification
                                        .createInfo("Chip [ " + chipsGroup.getSelectedChip().getValue() + " ] is selected").show())
                                .selectAt(0)))
        );
    }

    @Override
    public HTMLDivElement getElement() {
        return element;
    }
}