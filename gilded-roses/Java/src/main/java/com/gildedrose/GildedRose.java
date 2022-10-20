package com.gildedrose;

import com.gildedrose.factory.QualityAnalysisFactory;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        QualityAnalysisFactory qualityAnalysisFactory = new QualityAnalysisFactory();

        for (int i = 0; i < items.length; i++) {
            qualityAnalysisFactory.updateQuality(items[i]);
        }
    }
}
