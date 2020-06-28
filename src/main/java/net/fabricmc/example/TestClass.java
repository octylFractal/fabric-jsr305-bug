package net.fabricmc.example;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.screen.world.WorldListWidget;
import net.minecraft.client.gui.widget.AlwaysSelectedEntryListWidget;

import java.util.Optional;

public class TestClass extends AlwaysSelectedEntryListWidget<WorldListWidget.Entry> {
    public TestClass(MinecraftClient minecraftClient, int i, int j, int k, int l, int m) {
        super(minecraftClient, i, j, k, l, m);
    }

    @Override
    public Optional<Element> hoveredElement(double mouseX, double mouseY) {
        return Optional.empty();
    }

    @Override
    public void mouseMoved(double mouseX, double mouseY) {

    }

    @Override
    public boolean keyReleased(int keyCode, int scanCode, int modifiers) {
        return false;
    }

    @Override
    public boolean charTyped(char chr, int keyCode) {
        return false;
    }

    @Override
    public void setInitialFocus(Element element) {

    }

    @Override
    public void focusOn(Element element) {

    }
}
