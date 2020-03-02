package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void update() {
        for (int i = 0; i < items.length; i++) {
            items[i].update();
        }
    }
}
