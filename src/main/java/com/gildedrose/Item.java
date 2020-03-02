package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    private void updateSellIn() {
        if (name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        }

        sellIn = sellIn - 1;
    }

    public void update() {
        if (name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        }

        if (name.equals("Aged Brie")){
            if (quality < 50) {
                quality = quality + 1;
            }
            updateSellIn();
            if (sellIn < 0 && quality < 50) {
                quality = quality + 1;
            }
            return;
        }

        if (name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (quality < 50) {
                quality = quality + 1;
            }
            if (sellIn < 11 && quality < 50) {
                quality = quality + 1;
            }
            if (sellIn < 6 && quality < 50) {
                quality = quality + 1;
            }
            updateSellIn();
            if (sellIn < 0) {
                quality = 0;
            }
            return;
        }

        if (quality > 0) quality = quality - 1;
        updateSellIn();
        if (sellIn < 0 && quality > 0) quality = quality - 1;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
